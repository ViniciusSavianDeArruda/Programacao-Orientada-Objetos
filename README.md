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

### Encapsulamento

É o empacotamento de atributos e métodos dentro de uma classe, com controle de acesso:

| Símbolo UML | Palavra-chave Java | Acesso |
|-------------|-------------------|--------|
| `+` Público | `public` | Qualquer classe |
| `-` Privado | `private` | Apenas a própria classe |
| `#` Protegido | `protected` | Classe e subclasses |

> 💡 **Boa prática:** atributos devem ser `private`; o acesso externo se dá via métodos getters/setters.

---

### Conceitos futuros da disciplina

- **Herança** — subclasse herda atributos e métodos da classe mãe
- **Mensagem** — troca de informação entre objetos
- **Associação** — utilização de recursos entre objetos
- **Abstração** — classe não instanciável
- **Polimorfismo** — métodos com muitas formas (sobrecarga e sobrescrita)

> A modelagem de classes segue o padrão **UML** (Unified Modeling Language): [uml.org](http://www.uml.org)

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

## 📝 Paradigmas de Programação (Contexto)

- **Imperativas → Procedurais:** C, COBOL, Pascal
- **Imperativas → Orientada a Objetos:** Java, C++, Python, C#  ← *estamos aqui*
- **Declarativas → Funcionais:** Erlang, R
- **Declarativas → Lógicas:** Prolog, LISP
