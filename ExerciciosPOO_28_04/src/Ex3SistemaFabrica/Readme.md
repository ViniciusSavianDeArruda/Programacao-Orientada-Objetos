# 03 — Sistema de Chão de Fábrica (Indústria 4.0) — TecnoForja S.A.

Este projeto consiste em implementar (em **Java**) um sistema de gestão para uma linha de produção automatizada.  
O sistema deve controlar diferentes tipos de **máquinas industriais**, monitorar **produção**, **consumo energético**, **estados internos** (matéria-prima, calibração, temperatura) e validar se uma máquina consegue ou não **produzir lotes**.

---

## Objetivos de POO avaliados

- **Encapsulamento estrito** (sem setters públicos; estado controlado por métodos)
- **Herança** (subclasses especializadas a partir de uma classe base abstrata)
- **Polimorfismo** (cada máquina produz lote com regras e custos diferentes)
- **Máquinas de estado** (temperatura/calibração/matéria-prima evoluem com o uso)
- **Exceções personalizadas** (alarmes da fábrica; exigem `try-catch`)

---

## Requisitos de Implementação

## 1) Classe Base (Abstrata): `MaquinaIndustrial`

Esta classe define o comportamento padrão de qualquer equipamento na fábrica.

### Atributos (Encapsulamento Estrito)
- `numeroSerie` (`String`) — **imutável após a criação**
- `ligada` (`boolean`) — estado atual (`true` = ligada, `false` = desligada)
- `pecasProduzidasTotais` (`int`) — acumulador histórico de produção
- `energiaConsumidaKWh` (`double`) — acumulador de energia consumida

### Construtor
- Deve receber **apenas** `numeroSerie`
- Todas as máquinas começam:
  - desligadas (`ligada = false`)
  - `pecasProduzidasTotais = 0`
  - `energiaConsumidaKWh = 0`

### Getters
- Criar getters para **todos** os atributos

### Setters
- **Não criar nenhum setter público**
- O estado só pode ser alterado por métodos específicos

### Métodos obrigatórios
#### `ligar()` e `desligar()`
- Alteram o estado da máquina
- Regra: chamadas redundantes devem lançar a exceção nativa do Java:
  - chamar `ligar()` quando já está ligada → `IllegalStateException`
  - chamar `desligar()` quando já está desligada → `IllegalStateException`

#### Método protegido de registro (único que altera acumuladores)
Criar:

```java
protected void registrarProducao(int pecas, double energia)
```

Este método é o **único** responsável por somar:
- `pecasProduzidasTotais += pecas`
- `energiaConsumidaKWh += energia`

### Método abstrato (Polimorfismo)
Criar:

```java
public abstract void produzirLote(int quantidade) throws Exception;
```

- Objetivo: tentar produzir um lote
- Não retorna valor, mas **pode falhar** via exceções

---

## 2) Subclasses (Herança, Polimorfismo e Máquinas de Estado)

Criar **3 subclasses**.  
**Regra comum obrigatória (para todas):** a primeira verificação de `produzirLote` deve checar se a máquina está desligada.  
Se estiver desligada, deve lançar:

- `MaquinaDesligadaException`

> Observação: o enunciado menciona “imprime erro e retorna false”, porém a especificação final padroniza o comportamento via **exceção** (`MaquinaDesligadaException`) e o método retorna `void`. Siga a regra da exceção como requisito.

---

### A) `InjetoraPlastico`

Derrete plástico para moldar peças.

**Estado interno extra:**
- `kgMateriaPrima` (`double`)

**Comportamento extra:**
- `abastecerPlastico(double kg)`:
  - adiciona matéria-prima ao reservatório
  - `kg` **não pode ser negativo** (validar)

**Polimorfismo (`produzirLote`)**
- Cada peça precisa de **0.2 kg** de matéria-prima
- Verificar se há plástico suficiente:
  - se **não** houver, lançar `FaltaMateriaPrimaException`
- Se houver:
  - subtrair o plástico gasto
  - energia: cada peça consome **0.5 kWh**
  - chamar `registrarProducao(pecas, energia)`
  - imprimir mensagem de sucesso da operação

---

### B) `BracoRoboticoMontagem`

Equipamento de alta precisão, mas perde calibração com uso contínuo.

**Estado interno extra:**
- `percentualCalibracao` (`double`) — começa **sempre em 100.0**

**Comportamento extra:**
- `recalibrar()`:
  - restaura calibração para **100.0**

**Polimorfismo (`produzirLote`)**
- O robô **recusa-se** a trabalhar se `percentualCalibracao < 20.0`
  - se for menor que 20.0, lançar `EquipamentoDescalibradoException`
- Se puder produzir:
  - energia: **15.0 kWh por lote** (fixo, independente do tamanho)
  - desgaste: cada peça reduz calibração em **0.5**
    - atualizar após o lote
    - garantir que não fique abaixo de **0**
  - registrar produção e energia com `registrarProducao(...)`
  - imprimir mensagem de sucesso da operação

---

### C) `PrensaHidraulica`

Máquina de força bruta; aquece e precisa de arrefecimento.

**Estado interno extra:**
- `temperaturaAtual` (`double`) — começa em **25.0 °C**

**Comportamento extra:**
- `acionarRefrigeracao()`:
  - reduz a temperatura de volta para **25.0**

**Polimorfismo (`produzirLote`)**
- Limite térmico de segurança: **90.0 °C**
- Se `temperaturaAtual >= 90.0` **antes de iniciar um lote**, lançar `SuperaquecimentoException`
- Durante a produção:
  - cada peça aumenta temperatura em **1.5 °C**
  - cada peça consome **2.0 kWh**
- Realizar a produção, aumentar temperatura conforme quantidade, registrar produção e energia
- Observação importante:
  - a máquina **pode ultrapassar 90°C durante o lote**
  - o bloqueio ocorre apenas ao **tentar iniciar** um novo lote já acima/igual ao limite

---

## 2D) Exceções Personalizadas (Alarmes da Fábrica)

Criar as seguintes classes **herdando de `Exception`** (para obrigar `try-catch`):

- `MaquinaDesligadaException`
- `FaltaMateriaPrimaException`
- `EquipamentoDescalibradoException`
- `SuperaquecimentoException`

---

## 3) Classe Executável: `Main`

### Cenário de testes obrigatório

1. Criar uma `List<MaquinaIndustrial>` e adicionar:
   - 1 `InjetoraPlastico`
   - 1 `BracoRoboticoMontagem`
   - 1 `PrensaHidraulica`

2. Abastecer a Injetora com **10 kg** de plástico

3. Antes de ligar, tentar mandar **todas** produzirem um lote de **60 peças**
   - deve falhar (testar lógica base)
   - usar `try-catch` para capturar `MaquinaDesligadaException`

4. Ligar todas as máquinas em um ciclo (`for` / `foreach`)

5. Iniciar um turno de trabalho:
   - fazer um ciclo que mande todas as máquinas produzirem **3 lotes seguidos** de **40 peças cada**
   - envolver a chamada `produzirLote` em `try-catch` múltiplo (ou capturando `Exception`)

### Comportamento esperado durante o turno (via polimorfismo)
- i) A Injetora deve falhar no 2º ou 3º lote (ficará sem plástico)
- ii) O Robô deve falhar no 3º lote (calibração cairá abaixo de 20%)
- iii) A Prensa deve falhar em algum momento por sobreaquecimento (ao iniciar um novo lote já quente)

### Regra de continuidade da fábrica
Quando a Injetora ficar sem plástico:
- a exceção será lançada
- o `catch` deve imprimir exatamente:

```
ALARME INJETORA: Falta matéria prima!
```

- e o loop deve continuar tentando operar as outras máquinas (uma máquina parar não para a fábrica inteira)

6. Ao final, imprimir um relatório por máquina contendo:
- número de série
- total de peças efetivamente produzidas
- energia total consumida (kWh)

---

## Observações finais

- Não criar setters públicos em `MaquinaIndustrial`.
- Usar `registrarProducao(...)` como único ponto de atualização dos acumuladores.
- As validações devem ser feitas conforme descrito e disparar as exceções corretas.
- O `Main` deve demonstrar robustez: falhas são tratadas e o sistema continua operando.

---
**Área:** Ciências Tecnológicas  
**Curso:** Sistemas de Informação  
**Disciplina:** Programação Orientada a Objetos  
**Professor:** Rafael Bisogno
