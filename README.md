# Estudos de Java – Fundamentos da Linguagem e POO

Este repositório reúne **anotações** e **exercícios** desenvolvidos durante meus estudos de Java e Programação Orientada a Objetos (POO). O objetivo é consolidar os conceitos fundamentais da linguagem e criar uma base sólida para evoluir em desenvolvimento de software.

---

## 1️⃣ Introdução ao Java e Ambiente de Desenvolvimento

Java é uma linguagem de programação orientada a objetos, amplamente utilizada no desenvolvimento de sistemas web, aplicações corporativas, aplicativos Android e outros tipos de software.

Uma das principais características do Java é ser **multiplataforma** – um programa escrito em Java pode rodar em diferentes sistemas operacionais como **Windows**, **Linux** e **macOS** graças à sua arquitetura.

### 🔹 Processo de execução de um programa Java

O fluxo de execução de um programa Java é:

1. O código fonte é escrito em um arquivo `.java`.
2. O compilador converte esse código em Bytecode (`.class`).
3. Esse Bytecode é interpretado pela **JVM** (Java Virtual Machine).

```
Código Java (.java)
        ↓
Compilação (javac)
        ↓
Bytecode (.class)
        ↓
JVM interpreta e executa
```

Princípio:  
**Write Once, Run Anywhere**  
(*Escreva uma vez, execute em qualquer lugar*)

### 🔹 Componentes do ambiente Java

- **JVM (Java Virtual Machine)**
  - Interpreta e executa o Bytecode.
  - Gerencia memória e garante portabilidade.
- **JRE (Java Runtime Environment)**
  - Ambiente necessário para executar aplicações Java.
  - Contém a JVM, bibliotecas padrão e recursos essenciais.
- **JDK (Java Development Kit)**
  - Kit de desenvolvimento para programadores.
  - Inclui o JRE, compilador (`javac`) e ferramentas.

> **JDK = JRE + Ferramentas de desenvolvimento**

---

## 2️⃣ Lógica de Programação Básica em Java

Antes de trabalhar com POO, é preciso dominar a lógica básica.

Principais conceitos:
- Criação do primeiro programa
- Variáveis
- Entrada e saída de dados
- Estruturas condicionais

### 🔹 Primeiro programa em Java

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá mundo");
    }
}
```
| Elemento             | Função                     |
|----------------------|---------------------------|
| `class`              | Define uma classe          |
| `main`               | Método principal           |
| `System.out.println` | Imprime na tela            |

### 🔹 Tipos de variáveis

| Tipo    | Uso                           |
|---------|-------------------------------|
| int     | números inteiros              |
| float   | números decimais (simples)    |
| double  | números decimais (precisão)   |
| char    | caractere                     |
| boolean | verdadeiro ou falso           |
| String  | texto                         |

```java
int idade = 20;
double salario = 2500.50;
char letra = 'A';
String nome = "Vinicius";
```

### 🔹 Entrada de dados com Scanner

```java
import java.util.Scanner;

Scanner teclado = new Scanner(System.in);
System.out.println("Digite seu nome:");
String nome = teclado.nextLine();
```

### 🔹 Estruturas condicionais

- **If / Else**
    ```java
    if (idade >= 18) {
        System.out.println("Maior de idade");
    } else {
        System.out.println("Menor de idade");
    }
    ```
- **Switch Case**
    ```java
    switch(opcao) {
        case 1:
            System.out.println("Opção 1");
            break;
        case 2:
            System.out.println("Opção 2");
            break;
    }
    ```

---

## 3️⃣ Estruturas de Repetição

Permitem executar um bloco de código várias vezes:

### 🔹 For

```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```
- Inicialização
- Condição
- Incremento

### 🔹 While

```java
while (numero < 10) {
    System.out.println(numero);
    numero++;
}
```

### 🔹 Do While

```java
do {
    System.out.println(numero);
    numero++;
} while (numero < 10);
```

---

## 4️⃣ Vetores e Matrizes

### 🔹 Vetores (Arrays)

```java
int[] numeros = new int[5];
numeros[0] = 10;
numeros[1] = 20;
```
- Os índices começam em 0.

### 🔹 Matrizes

```java
int[][] matriz = new int[3][3];
```
- Representação: `[linha][coluna]`

---

## 5️⃣ Fundamentos da Programação Orientada a Objetos (POO)

A POO organiza o código em torno de **objetos** que representam entidades do mundo real: Carro, Pessoa, Computador, Conta bancária...

### 🔹 Classe

Um **molde** com atributos (características) e métodos (comportamentos):

```java
public class Carro {
    String marca;
    String modelo;
    int ano;
}
```

### 🔹 Objeto

Uma **instância** de uma classe:

```java
Carro carro1 = new Carro();
// carro1 é um objeto da classe Carro
```

### 🔹 Encapsulamento

Protege os dados da classe com modificadores de acesso:

| Modificador | Acesso                                         |
|-------------|------------------------------------------------|
| public      | qualquer lugar                                 |
| private     | apenas dentro da classe                        |
| protected   | dentro do pacote ou subclasses                 |

---

## 6️⃣ Anatomia de uma Classe

Uma classe típica possui:

1️⃣ Atributos  
2️⃣ Construtores  
3️⃣ Métodos

```java
public class Pessoa {
    // atributos
    String nome;
    int idade;

    // construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // método
    public void mostrarDados() {
        System.out.println(nome);
        System.out.println(idade);
    }
}
```

---

## 7️⃣ Construtores

Método especial para inicialização de objetos.

- Mesmo nome da classe
- Sem tipo de retorno
- Executado ao usar `new`

```java
public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
}

// Criando objeto
Pessoa p1 = new Pessoa("Vinicius", 20);
```

---

## 8️⃣ Sobrecarga de Construtores

Vários construtores com parâmetros diferentes:

```java
public Pessoa(String nome) {
}

public Pessoa(String nome, int idade) {
}
```

---

## 9️⃣ Palavra-chave this

Referencia o próprio objeto.
```java
public Pessoa(String nome){
    this.nome = nome;
}
```
| Variável    | Significado          |
|-------------|---------------------|
| this.nome   | atributo da classe  |
| nome        | parâmetro do método |

---

## 🔟 Métodos

Ações que o objeto realiza:

```java
public void acelerar() {
    System.out.println("O carro está acelerando");
}

carro.acelerar(); // Chamando o método
```

---

## 📌 Conclusão

O estudo de Java começa com os conceitos fundamentais de lógica de programação e evolui para o paradigma de Programação Orientada a Objetos, formando a base essencial para qualquer desenvolvedor de software.

---
