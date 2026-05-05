# 02 — Sistema de Folha de Pagamento Hospitalar (Hospital de Caridade UFN)

Este projeto consiste em implementar um sistema (em **Java**) para processar a **folha de pagamento** dos funcionários de um hospital.  
Embora todos sejam funcionários, **Médicos, Enfermeiros e Administrativos** possuem **regras salariais diferentes**, envolvendo plantões, insalubridade, horas extra e bônus de gestão.

---

## Objetivos de POO avaliados

- **Encapsulamento**: atributos privados + validações em setters (com exceções)
- **Herança**: subclasses especializadas a partir de uma classe base abstrata
- **Polimorfismo**: cada tipo de funcionário calcula o salário final de forma diferente
- **Exceções personalizadas**: tratamento robusto de regras de negócio inválidas

---

## Requisitos de Implementação

## 1) Classe Base (Abstrata): `FuncionarioHospital`

Classe mãe para todos os trabalhadores do hospital.

### Atributos (Encapsulamento)
- **Todos os atributos devem ser `private`:**
  - `nome` (`String`)
  - `matricula` (`String`)
  - `salarioBase` (`double`)
  - `horasTrabalhadasMensais` (`int`)

### Construtor
- Deve receber e inicializar: `nome`, `matricula` e `salarioBase`
- Regra: `horasTrabalhadasMensais` deve iniciar **sempre em 0**

### Getters e Setters
Criar getters e setters para todos os atributos, respeitando as regras:

#### Regra de Encapsulamento 1 (setter de `salarioBase`)
- O valor **não pode ser inferior ao salário mínimo** (considerar **R$ 1.412,00**)
- Se for menor, lançar:

```java
throw new ValorInvalidoException("Salário base não pode ser inferior ao mínimo legal.");
```

#### Regra de Encapsulamento 2 (setter de `horasTrabalhadasMensais`)
- O valor **não pode ser negativo**
- O valor **não pode ser superior a 300** (limite humano mensal)
- Se for inválido (`< 0` ou `> 300`), lançar:

```java
throw new ValorInvalidoException("Carga horária inválida. O limite humano é 300 horas.");
```

### Método abstrato (Polimorfismo)
Criar na classe base:

```java
public abstract double calcularSalarioFinal();
```

Cada subclasse implementará sua própria regra de cálculo.

### Método concreto: `exibirResumoMensal()`
Deve imprimir:
- nome
- matrícula
- horas trabalhadas
- salário final (obtido chamando `calcularSalarioFinal()`)

---

## 2) Subclasses (Herança e Polimorfismo)

Criar **3 subclasses** que herdam de `FuncionarioHospital`.  
Regras gerais:
- Usar `super(...)` nos construtores
- Encapsular os novos atributos (`private`)
- Criar getters/setters necessários com validações
- Implementar `calcularSalarioFinal()` em cada classe

---

### A) `Medico`

Médicos ganham salário base + valor fixo por plantão.

**Atributos extra:**
- `especialidade` (`String`)
- `valorPorPlantao` (`double`)
- `quantidadePlantoes` (`int`)

**Regra de encapsulamento:**
- `quantidadePlantoes` **não pode ser negativa**

**Cálculo do salário final (polimorfismo):**
```
salarioFinal = salarioBase + (valorPorPlantao * quantidadePlantoes)
```

---

### B) `Enfermeiro`

Enfermeiros recebem adicional de insalubridade e podem receber horas extra.  
**Carga horária padrão: 160 horas/mês.**

**Atributos extra:**
- `setor` (`String`)
- `percentualInsalubridade` (`double`)

**Regra de encapsulamento (percentual de insalubridade):**
O `percentualInsalubridade` só pode ser:
- `0.10` (mínimo)
- `0.20` (médio)
- `0.40` (máximo)

Qualquer outro valor deve lançar (e não atribuir):

```java
throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato.");
```

**Cálculo do salário final (polimorfismo):**
1. Calcular bônus de insalubridade:
```
bonus = salarioBase * percentualInsalubridade
```
2. Verificar horas trabalhadas:
- Se `horasTrabalhadasMensais > 160`, cada hora extra vale **R$ 50,00**
```
horasExtras = horasTrabalhadasMensais - 160
valorHorasExtras = horasExtras * 50.0
```
3. Salário final:
```
salarioFinal = salarioBase + bonus + valorHorasExtras (se houver)
```

---

### C) `Administrativo`

Equipe administrativa não recebe insalubridade nem plantões, mas pode receber bônus de gestão.

**Atributos extra:**
- `departamento` (`String`)
- `cargoDeGestao` (`boolean`)

**Cálculo do salário final (polimorfismo):**
- Base: `salarioFinal = salarioBase`
- Se `cargoDeGestao == true`, adicionar bônus fixo de **R$ 1.500,00**:
```
salarioFinal = salarioBase + 1500.0
```

---

## 2D) Exceção Personalizada

Criar a classe:

- `ValorInvalidoException`
  - herda de `RuntimeException`
  - usada para todas as falhas de validação do exercício

---

## 3) Classe Executável: `Main`

A classe `Main` deve testar a robustez do código com validações e polimorfismo.

### Passos obrigatórios

1. Criar uma lista para representar a folha de pagamento:
- Ex.: `ArrayList<FuncionarioHospital>`

2. Instanciar:
- Um **Medico** cirurgião com **5 plantões**
- Um **Enfermeiro** da **UTI** com insalubridade **máxima (0.40)** e **180 horas trabalhadas**
- Um **Administrativo** de **Recursos Humanos** que é **gestor (true)**

3. Adicionar todos na lista

---

### 4) Teste de Encapsulamento (proposital)

Realizar as tentativas abaixo **em try-catch separados**, imprimindo `e.getMessage()` e permitindo que o programa continue:

- Tentar alterar o salário base do Administrativo para **R$ 900,00**
- Tentar definir a insalubridade do Enfermeiro para **0.99**
- Tentar definir as horas trabalhadas do Médico para **400**

> A intenção é capturar **três erros sequencialmente**, imprimir as mensagens e seguir a execução normal.

---

### 5) Teste de Polimorfismo

Percorrer a lista de funcionários com um ciclo (`for`/`foreach`) e, para cada funcionário, chamar:

```java
exibirResumoMensal();
```

O Java deve garantir que:
- plantões do Médico
- insalubridade + horas extra do Enfermeiro
- bônus de gestão do Administrativo

sejam aplicados corretamente conforme o tipo do objeto.

---

## Observações finais

- Siga estritamente as regras de validação indicadas.
- Mantenha atributos privados e valide nos setters com `ValorInvalidoException`.
- Garanta que `calcularSalarioFinal()` seja abstrato na base e implementado nas subclasses.
- Garanta que o programa não pare ao ocorrerem erros (uso correto de try-catch).

---
**Área:** Ciências Tecnológicas  
**Curso:** Sistemas de Informação  
**Disciplina:** Programação Orientada a Objetos  
**Professor:** Rafael Bisogno
