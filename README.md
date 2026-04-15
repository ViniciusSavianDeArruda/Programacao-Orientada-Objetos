# ☕ Programação Orientada a Objetos — Resumo Java

> **Disciplina:** Programação Orientada a Objetos 

---

## 🧱 Estrutura do Java

### JVM, JRE e JDK

```
JDK (Java Development Kit)
└── JRE (Java Runtime Environment)
    ├── JVM (Java Virtual Machine)
    └── Bibliotecas
```

- **JVM** — executa o Byte Code em qualquer sistema operacional
- **JRE** — necessário para *rodar* programas Java
- **JDK** — necessário para *desenvolver* programas Java

O código `.java` é compilado pelo `javac` → gera `.class` (Byte Code) → executado pela JVM no Windows, Linux ou Mac.

---

## 🔤 Sintaxe Básica

### Primeiro Programa

```java
public class Program {
    public static void main(String[] args) {
        System.out.println("Olá mundo!"); // com quebra de linha
        System.out.print("Sem quebra");   // sem quebra de linha
    }
}
```

### Tipos de Dados e Variáveis

```java
int    idade  = 18;
char   letra  = 'r';
double real   = 123.4;
float  pi     = 3.14f;
String texto  = "Olá";

// Constante (não pode ser alterada)
final float PI = 3.14159265f;
```

### Atalhos Úteis no Eclipse

| Atalho | Ação |
|--------|------|
| `sysout` + `Ctrl+Espaço` | Gera `System.out.println()` |
| `Alt+Shift+R` | Renomeia variável em todo o código |
| `Ctrl+D` | Deleta a linha atual |
| `Ctrl+/` | Comenta/descomenta linha |
| `Ctrl+Shift+F` | Formata o código |

---

## ⌨️ Leitura pelo Teclado (Scanner)

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

int    numInt  = sc.nextInt();       // lê inteiro
double numReal = sc.nextDouble();    // lê decimal
float  numF    = sc.nextFloat();     // lê float
String palavra = sc.next();          // lê uma palavra
String linha   = sc.nextLine();      // lê linha completa
char   c       = sc.next().charAt(0); // lê um caractere

sc.close(); // sempre fechar ao final
```

---

## 🔀 Condicionais

### if / else

```java
if (idade >= 18) {
    System.out.println("Maior de idade!");
} else {
    System.out.println("Menor de idade!");
}
```

### Switch Case

```java
switch (numero) {
    case 1:
        System.out.println("Um");
        break;
    case 2:
        System.out.println("Dois");
        break;
    default:
        System.out.println("Outro");
}
```

---

## 🔁 Laços de Repetição

### for — quando se sabe o número de iterações

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i); // imprime 0, 1, 2, 3, 4
}
```

### while — quando se sabe a condição de parada

```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
```

### do...while — executa pelo menos uma vez

```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
```

> 💡 **Diferença principal:** no `do...while`, o bloco é executado **antes** de verificar a condição.

---

## 📦 Vetores (Arrays)

Coleção **unidimensional** de elementos do mesmo tipo. Índice começa em **0**.

```java
// Declaração e atribuição manual
int[] numeros = new int[5];
numeros[0] = 10;
numeros[1] = 20;
// ...

// Percorrendo com for
for (int i = 0; i < numeros.length; i++) {
    System.out.println("Índice " + i + " = " + numeros[i]);
}
```

### Leitura de vetor pelo teclado

```java
int[] numeros = new int[5];
Scanner sc = new Scanner(System.in);

for (int i = 0; i < numeros.length; i++) {
    System.out.println("Digite o elemento " + i + ":");
    numeros[i] = sc.nextInt();
}
```

---

## 🔢 Matrizes

Coleção **bidimensional** — acessada por dois índices `[linha][coluna]`.

```java
// Declaração
int[][] matriz = new int[3][3];

// Atribuição
matriz[0][0] = 1; matriz[0][1] = 2; matriz[0][2] = 3;
// ...

// Percorrendo com for aninhado
for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println(); // quebra de linha por linha da matriz
}
```

### Leitura de matriz pelo teclado

```java
int[][] matriz = new int[3][3];
Scanner sc = new Scanner(System.in);

for (int i = 0; i < matriz.length; i++) {
    for (int j = 0; j < matriz[i].length; j++) {
        System.out.println("Digite o elemento [" + i + "][" + j + "]:");
        matriz[i][j] = sc.nextInt();
    }
}
```

---

## 🧩 Orientação a Objetos — Conceitos Fundamentais

### Terminologia

| Conceito | Definição | Equivalente Estruturado |
|---------|-----------|------------------------|
| **Classe** | Molde/estrutura que descreve um conjunto de objetos | — |
| **Objeto** | Instância de uma classe | — |
| **Atributo** | Característica do objeto (estado) | Variável |
| **Método** | Funcionalidade do objeto (comportamento) | Função |
| **Subclasse** | Classe filha que herda atributos e métodos da classe mãe | — |

> **Exemplo:** A classe `Carro` define atributos como modelo, cor, ano. O objeto `Gol` é uma instância dessa classe. De uma mesma classe podem existir múltiplos objetos: `Celta`, `Corsa`, `Civic`, `Meriva`.

---

## 🏗️ Classes e Objetos em Java

### Criando uma Classe

```java
// Arquivo: Pessoa.java
public class Pessoa {
    public String nome;   // atributo público
    public int idade;     // atributo público
}
```

> ⚠️ O nome da classe **deve** ser igual ao nome do arquivo `.java`. Uma classe sem `main` não é executável sozinha — ela é apenas o "molde".

### Instanciando (criando) objetos

```java
// Arquivo: Principal.java
public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();   // instancia o objeto p1
        p1.nome = "João";
        p1.idade = 20;

        Pessoa p2 = new Pessoa();   // instancia o objeto p2
        p2.nome = "Maria";
        p2.idade = 22;

        System.out.println("Nome: " + p1.nome + " | Idade: " + p1.idade);
        System.out.println("Nome: " + p2.nome + " | Idade: " + p2.idade);
    }
}
```

### Leitura de objetos pelo teclado

```java
Scanner sc = new Scanner(System.in);

Pessoa p1 = new Pessoa();
System.out.println("Digite o nome:");
p1.nome = sc.next();
System.out.println("Digite a idade:");
p1.idade = sc.nextInt();
```

### Usando múltiplas classes no mesmo projeto

```java
// Professor.java
public class Professor {
    public String nome;
}

// Laboratorio.java
public class Laboratorio {
    public String local;
}

// Disciplina.java (executável)
public class Disciplina {
    public static void main(String[] args) {
        Professor p = new Professor();
        p.nome = "Ricardo da Silva";

        Laboratorio lab = new Laboratorio();
        lab.local = "Sala 108";

        System.out.println("Professor: " + p.nome);
        System.out.println("Local: " + lab.local);
    }
}
```

---

## 🏗️ Construtores

Um **construtor** é um método especial executado automaticamente no momento em que um objeto é criado com `new`. Seu papel é definir o **estado inicial válido** do objeto.

Características principais:
- Tem o **mesmo nome da classe**
- **Não possui tipo de retorno** (nem `void`)
- É chamado automaticamente pelo `new`

### Construtor Padrão (sem parâmetros)

Se nenhum construtor for declarado, o Java cria automaticamente um construtor vazio (padrão). Assim que você declara qualquer construtor, o padrão deixa de existir automaticamente.

```java
public class Pessoa {
    public String nome;
    public int idade;

    // Construtor padrão (sem parâmetros)
    public Pessoa() {
        this.nome = "Sem nome";
        this.idade = 0;
    }
}

// Uso
Pessoa p = new Pessoa(); // nome = "Sem nome", idade = 0
```

### Construtor com Parâmetros

Permite exigir que os dados obrigatórios sejam passados no momento da criação do objeto, evitando estados incompletos.

```java
public class Pessoa {
    public String nome;
    public int idade;

    // Construtor com parâmetros
    public Pessoa(String nome, int idade) {
        this.nome = nome;   // 'this' referencia o atributo do objeto
        this.idade = idade;
    }
}

// Uso — dados obrigatórios na criação
Pessoa p = new Pessoa("João", 20);
```

### Sobrecarga de Construtores

Uma classe pode ter **mais de um construtor**, desde que tenham parâmetros diferentes (quantidade ou tipos). O Java identifica qual usar pelo que foi passado no `new`.

```java
public class Produto {
    public String nome;
    public double preco;

    // Construtor 1 — sem preço
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
    }

    // Construtor 2 — com preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

// Uso
Produto p1 = new Produto("Caneta");         // usa construtor 1
Produto p2 = new Produto("Caderno", 15.90); // usa construtor 2
```

> 💡 **Dica:** o construtor é o lugar certo para inicializar atributos `private`, garantindo que o objeto nunca exista em estado inválido.

---

## 🔒 Encapsulamento

Encapsulamento é o empacotamento do **estado** (atributos) e do **comportamento** (métodos) de um objeto dentro de uma classe, com controle de acesso. Seu objetivo é proteger os dados e garantir a integridade do sistema.

### Modificadores de Acesso

Palavras-chave que determinam o nível de visibilidade dos membros (atributos e métodos) de uma classe:

| Símbolo UML | Palavra-chave Java | Descrição |
|-------------|-------------------|-----------|
| `+` Público | `public` | Acesso total — qualquer classe |
| `#` Protegido | `protected` | Acesso por herança e mesmo pacote |
| `~` Padrão | `default` / package | Acesso pelo mesmo pacote |
| `-` Privado | `private` | Acesso restrito à própria classe |

### Matriz de Visibilidade

| Modificador | Própria Classe | Mesmo Pacote | Subclasse | Global |
|-------------|:--------------:|:------------:|:---------:|:------:|
| `public`    | ✅ | ✅ | ✅ | ✅ |
| `protected` | ✅ | ✅ | ✅ | ❌ |
| `default`   | ✅ | ✅ | ❌ | ❌ |
| `private`   | ✅ | ❌ | ❌ | ❌ |

> 💡 **Boa prática:** atributos devem ser `private`; o acesso externo se dá via métodos getters/setters. O encapsulamento em sua forma mais pura utiliza atributos `private`.

### Getters e Setters

Métodos públicos que permitem o acesso e a modificação controlada dos atributos privados:

- **Getter** (`get`) — retorna o valor atual de um atributo
- **Setter** (`set`) — recebe um parâmetro e altera o valor de um atributo (frequentemente com validações internas)

A nomenclatura padrão é: prefixo `get` ou `set` + nome do atributo com a primeira letra maiúscula (**CamelCase**). Getters retornam o tipo do atributo; setters são `void`.

```java
public class Pessoa {
    private String nome;
    private int idade;

    // Construtor — define o estado inicial válido
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
```

> A palavra-chave **`this`** referencia o atributo do objeto atual, diferenciando-o do parâmetro recebido.

### Usando a classe encapsulada

```java
public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Rafael Bisogno", 22);

    // Acesso indireto via Getters (correto)
    System.out.println(pessoa.getNome());

    // pessoa.nome = "Rodrigo"; // ERRO: atributo private — compilação falha

    // Alteração controlada via Setters (correto)
    pessoa.setNome("Rodrigo Ramos");
    pessoa.setIdade(25);
}
```

### Diagrama UML de Classes

```
┌──────────────────────────────┐
│         NomeDaClasse         │  ← Identidade (nome da classe)
├──────────────────────────────┤
│  - atributo : Tipo           │  ← Estado (atributos encapsulados)
├──────────────────────────────┤
│  + metodo() : retorno        │  ← Comportamento (métodos de acesso)
└──────────────────────────────┘
```

### Por que encapsular?

Encapsular traz três benefícios fundamentais para a arquitetura de software:

**Integridade dos dados** — evita alterações acidentais ou estados inconsistentes. O objeto controla suas próprias regras de negócio.

**Ocultamento da complexidade** — o usuário da classe só precisa conhecer a interface pública (o "como usar"), ignorando a implementação interna (o "como funciona").

**Manutenção segura** — o código interno pode ser refatorado ou modificado no futuro sem quebrar o restante do sistema que utiliza a classe.

---

## 🧬 Herança

Herança é o mecanismo de **generalização e especialização** de classes. Seu objetivo técnico primário é a reutilização de software e a manutenção centralizada — alterações na superclasse refletem em cascata nas subclasses.

A subclasse herda atributos e comportamentos da superclasse, preservando a capacidade de adicionar características próprias.

```
Superclasse (Base)
       △
       │
Subclasse (Derivada)
```

### A Regra do "É um"

A herança estabelece estritamente uma relação lógica do tipo **"é um"** (is-a). Se a entidade A não pode ser substituída logicamente pela entidade B, a herança falha como modelo de design.

| Relação "É um" (Herança) ✅ | Relação "Tem um" (Composição) ❌ |
|:---------------------------:|:-------------------------------:|
| `PessoaJuridica` **é uma** `Pessoa` | `Motor` **não é um** `Carro` (ele pertence a um carro) |
| `Onibus` **é um** `Carro` | — |

### Sintaxe: o comando `extends`

Em Java, a herança é declarada na assinatura da classe utilizando a palavra reservada `extends`:

```java
public class Onibus extends Carro {
    protected String modelo;
    // A classe Onibus herda imediatamente os atributos e métodos da classe Carro.
}
```

### Visibilidade: o papel do `protected`

A herança exige uma quebra parcial e segura do encapsulamento. O modificador `protected` é a chave: **permite acesso exclusivo para subclasses**, bloqueando o acesso global.

```java
// Classe Base
class Desenho {
    protected String nomeAutor;
}

// Classe Derivada
class Desenho2D extends Desenho {
    public void exibe() {
        // Acesso direto permitido pelo 'protected'
        System.out.println(this.nomeAutor);
    }
}
// Sem o protected, a subclasse exigiria getters públicos ou a compilação falharia.
```

### Construtores na Herança

Construtores **não são herdados**. A classe base precisa existir na memória antes da classe derivada ser preenchida. A ordem de execução é:

1. Instância da Subclasse é solicitada
2. Chamada propagada para a Superclasse (Bottom-Up)
3. Construtor da Superclasse executado
4. Construtor da Subclasse finalizado (Top-Down)

### O comando `super()`

`super()` serve para invocar explicitamente o construtor da superclasse.

**Regra de Ouro:** quando explicitado, `super()` deve obrigatoriamente ser a **primeira instrução** dentro do construtor da subclasse. Se omitido, o compilador Java insere `super()` implicitamente (chamando o construtor vazio).

```java
public Desenho2D(int largura, int altura) {
    super(); // Invoca o construtor da classe base
    this.largura = largura;
    this.altura = altura;
}
```

### Roteamento de Dados com `super()`

É possível passar argumentos para o construtor da superclasse, delegando a inicialização dos atributos herdados para a classe mãe. A subclasse só se preocupa em inicializar seus próprios atributos locais:

```java
public PessoaJuridica(String nome, int idade, String cnpj) {
    super(nome, idade); // Roteia para o construtor da superclasse
    this.cnpj = cnpj;  // Inicializa o atributo local
}
```

### Herança Múltipla — Limitação do Java

Java **não permite** que uma classe utilize `extends` para herdar diretamente de mais de uma classe simultaneamente. O motivo técnico é prevenir ambiguidades de implementação — o chamado **"Problema do Diamante"**: se duas superclasses possuem um método `X` com o mesmo nome, a subclasse não saberia qual versão utilizar.

### Soluções Arquiteturais

**Herança em Cascata** — é possível criar infinitos níveis de herança direta. A herda de B, que herda de C:

```java
class Desenho { ... }
class Desenho2D extends Desenho { ... }
class Quadrado extends Desenho2D { ... }
```

**Interfaces** — a implementação múltipla de comportamentos sem estado é feita separadamente via `implements`, driblando a restrição do `extends`:

```java
public class MinhaClasse extends ClasseBase implements Interface1, Interface2 { ... }
```

### Exemplo completo: Ecossistema de Herança

```java
// Superclasse
public class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }
}

// Subclasse
public class Gerente extends Funcionario {
    protected double bonus;

    public Gerente(String nome, double bonus) {
        super(nome);         // Inicializa a superclasse (sempre na primeira linha)
        this.bonus = bonus;  // Inicializa o atributo local
    }
}
```

---

## 📝 Paradigmas de Programação (Contexto)

- **Imperativas → Procedurais:** C, COBOL, Pascal
- **Imperativas → Orientada a Objetos:** Java, C++, Python, C#  ← *estamos aqui*
- **Declarativas → Funcionais:** Erlang, R
- **Declarativas → Lógicas:** Prolog, LISP
