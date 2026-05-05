# 01 — Sistema de Gestão de Frota (Agência Espacial “Cosmos”)

Este projeto consiste em implementar um sistema (em **Java**) para gerir diferentes tipos de naves espaciais de uma frota.  
Todas as naves partilham características comuns (classe base), mas **comportam-se de forma diferente ao calcular consumo de combustível** e ao realizar missões/viagens (polimorfismo).

---

## Objetivos de POO avaliados

- **Encapsulamento**: atributos privados + validações em setters  
- **Herança**: subclasses especializadas a partir de uma classe base  
- **Polimorfismo**: cada tipo de nave implementa seu próprio cálculo de consumo  
- **Exceções personalizadas**: regras de negócio validadas com exceptions

---

## Requisitos de Implementação

### 1) Classe Base (Abstrata): `NaveEspacial`

Esta classe serve de base para todas as naves.

#### Atributos (Encapsulamento)
- **Todos os atributos devem ser `private`**
- `identificador` (`String`): nome/código da nave  
- `combustivelMaximo` (`double`): capacidade máxima do depósito  
- `combustivelAtual` (`double`): quantidade atual de combustível  
- `velocidadeBase` (`double`): velocidade padrão da nave  

#### Construtor
- Deve inicializar todos os atributos
- Regra: `combustivelAtual` deve iniciar **igual** a `combustivelMaximo`

#### Getters e Setters
- Criar getters e setters para todos os atributos

##### Regra de Encapsulamento (setter de `combustivelAtual`)
No setter de `combustivelAtual`, o valor:
- **nunca pode ser negativo**
- **nunca pode ultrapassar `combustivelMaximo`**

Se o valor for inválido, deve lançar:

```java
throw new CombustivelInvalidoException("Valor de combustível inválido!");
```

#### Método abstrato (Polimorfismo)
Implementar na classe base:

```java
public abstract double calcularConsumo(double distanciaEmAnosLuz);
```

Cada subclasse implementará sua própria fórmula.

#### Método concreto: `viajar(double distancia)`
Este método deve:

1. Chamar `calcularConsumo(distancia)` para obter o combustível necessário.
2. Verificar se `combustivelAtual` é suficiente.
3. Se for suficiente:
   - subtrair o consumo de `combustivelAtual`
   - imprimir:

```
A nave [identificador] viajou [distância] anos-luz. Combustível restante: [valor]
```

> Observação: se não for suficiente, o comportamento deve ser tratado por exceção (ver `CombustivelInsuficienteException`).

---

### 2) Subclasses (Herança e Polimorfismo)

Criar **3 subclasses** que herdam de `NaveEspacial`.  
Cada uma possui atributos próprios e uma forma única de calcular consumo.

Regras gerais:
- Encapsular os novos atributos (`private`)
- Criar construtores apropriados usando `super(...)`
- Implementar `calcularConsumo(...)` em cada subclasse

---

#### A) `NaveCargueiro`

Naves pesadas para transportar mantimentos.

**Atributos extra:**
- `pesoCargaAtual` (`double`)
- `capacidadeMaximaCarga` (`double`)

**Regra de encapsulamento:**
- `pesoCargaAtual` **não pode exceder** `capacidadeMaximaCarga`

**Cálculo de consumo (polimorfismo):**
```
(distancia * 0.5) + (pesoCargaAtual * 0.2)
```

---

#### B) `NaveCombate`

Naves rápidas, porém com peso adicional do armamento.

**Atributos extra:**
- `numeroArmas` (`int`)
- `escudoAtivado` (`boolean`)

**Cálculo de consumo (polimorfismo):**
- Base:
```
(distancia * 0.8)
```
- Se `escudoAtivado == true`, aplicar agravamento de **15%** ao consumo final:
```
consumoFinal = consumoBase * 1.15
```

---

#### C) `NaveExploracao`

Naves leves e eficientes para missões longas.

**Atributos extra:**
- `possuiSensoresAvancados` (`boolean`)

**Cálculo de consumo (polimorfismo):**
- Base:
```
(distancia * 0.3)
```
- Se possui sensores avançados, somar custo fixo de **50.0** (independente da distância):
```
consumoFinal = (distancia * 0.3) + 50.0
```

---

### 2D) Exceções Personalizadas

Criar as classes:

- `CombustivelInvalidoException`
  - herda de `IllegalArgumentException` **ou** `Exception`

- `CombustivelInsuficienteException`
  - herda de `Exception`

---

## 3) Classe Executável: `Main`

Implementar `public static void main(String[] args)` para simular o sistema.

### Passos obrigatórios

1. Criar uma lista de naves (ex.: `ArrayList<NaveEspacial>`)
2. Instanciar **pelo menos**:
   - 1 `NaveCargueiro`
   - 1 `NaveCombate`
   - 1 `NaveExploracao`
3. Adicionar as 3 naves na lista

4. **Testar Encapsulamento**  
   Tentar abastecer a `NaveCargueiro` usando o setter de combustível com um valor **maior que o máximo permitido**, garantindo que a validação bloqueia a ação.

5. **Testar Polimorfismo**  
   Percorrer a lista com `for` ou `foreach`. Para cada nave:
   - imprimir o **tipo de nave** e o `identificador`
   - mandar a nave `viajar(1000)`

6. **Tratamento de exceções com try-catch**  
   Tanto o teste do abastecimento inválido quanto o loop de viagens devem estar protegidos com `try-catch`, imprimindo:

```java
e.getMessage()
```

A ideia é confirmar que o bloqueio funciona **sem travar o programa**.

---

## Saída esperada (exemplo conceitual)

- Mensagem de erro ao tentar combustível acima do máximo:  
  `Valor de combustível inválido!`

- Mensagens de viagem para cada nave (com combustível restante atualizado), por exemplo:  
  `A nave X viajou 1000 anos-luz. Combustível restante: Y`

---

## Observações

- Siga estritamente as regras de negócio descritas acima.
- Garanta que os atributos sejam privados e acessados via getters/setters.
- Garanta que o método abstrato exista na base e seja implementado nas subclasses.
- Garanta que as exceções sejam realmente lançadas onde a regra exige.

---
**Área:** Ciências Tecnológicas  
**Curso:** Sistemas de Informação  
**Disciplina:** Programação Orientada a Objetos  
**Professor:** Rafael Bisogno
