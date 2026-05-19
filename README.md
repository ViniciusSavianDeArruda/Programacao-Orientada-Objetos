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

## ⚡ Membros Estáticos (`static`)

A palavra-chave `static` indica que um membro **pertence à classe**, e não a uma instância específica. Isso significa que ele existe independentemente de qualquer objeto criado — não é necessário usar `new` para acessá-lo.

> 💡 É exatamente o que o `main` é: `public static void main` — o Java o chama diretamente na classe, sem criar nenhum objeto.

### Atributo Estático

Um atributo `static` é **compartilhado entre todos os objetos** da classe. Há uma única cópia na memória, independentemente de quantas instâncias existam.

```java
public class Contador {
    public static int total = 0; // pertence à classe, não ao objeto

    public Contador() {
        total++; // toda instância incrementa o mesmo contador
    }
}

// Uso
Contador c1 = new Contador();
Contador c2 = new Contador();
Contador c3 = new Contador();

System.out.println(Contador.total); // → 3
```

> ⚠️ Atributos estáticos são acessados via `NomeClasse.atributo`, não via referência de objeto. Acessar por objeto (`c1.total`) funciona, mas é considerado má prática pois esconde que o dado é compartilhado.

### Método Estático

Um método `static` pode ser chamado diretamente pela classe, **sem instanciar nenhum objeto**. É amplamente utilizado para funções utilitárias e auxiliares.

```java
public class Calculadora {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static double media(double[] valores) {
        double soma = 0;
        for (double v : valores) soma += v;
        return soma / valores.length;
    }
}

// Uso — sem new, diretamente pela classe
int resultado = Calculadora.somar(3, 5);       // → 8
double m = Calculadora.media(new double[]{4, 6, 8}); // → 6.0
```

### Constante Estática (`static final`)

A combinação `static final` define uma **constante de classe** — um valor imutável compartilhado globalmente. Por convenção, o nome é escrito em `MAIÚSCULAS_COM_UNDERLINE`.

```java
public class Matematica {
    public static final double PI      = 3.14159265;
    public static final double EULER   = 2.71828182;
}

// Uso
System.out.println(Matematica.PI);    // → 3.14159265
System.out.println(Matematica.EULER); // → 2.71828182
```

### Bloco de Inicialização Estático

Executado **uma única vez**, no momento em que a classe é carregada pela JVM. Útil para inicializar atributos estáticos com lógica mais complexa.

```java
public class Configuracao {
    public static final String AMBIENTE;

    static {
        // bloco executado uma vez quando a classe é carregada
        String env = System.getenv("APP_ENV");
        AMBIENTE = (env != null) ? env : "desenvolvimento";
        System.out.println("Classe carregada. Ambiente: " + AMBIENTE);
    }
}
```

### Regras e Restrições do `static`

| O que membros `static` **podem** fazer | O que membros `static` **não podem** fazer |
|----------------------------------------|--------------------------------------------|
| Acessar outros membros `static` da classe | Usar a palavra-chave `this` |
| Ser chamados via `NomeClasse.membro()` | Acessar atributos de instância diretamente |
| Existir sem nenhum objeto criado | Ser sobrescritos com `@Override` (podem ser ocultados, não sobrescritos) |
| Ser `public`, `private` ou `protected` | Chamar métodos de instância sem uma referência de objeto |

```java
public class Exemplo {
    private int valorInstancia = 10;      // atributo de instância
    private static int valorEstatico = 20; // atributo estático

    public static void metodoEstatico() {
        System.out.println(valorEstatico);  // ✅ acessa membro estático
        // System.out.println(valorInstancia); // ❌ ERRO de compilação
        // System.out.println(this.valorInstancia); // ❌ ERRO: 'this' não existe aqui
    }

    public void metodoInstancia() {
        System.out.println(valorInstancia);  // ✅ acessa membro de instância
        System.out.println(valorEstatico);   // ✅ também pode acessar estático
    }
}
```

### Instância vs. Estático — Comparativo

| Dimensão | Membro de Instância | Membro Estático (`static`) |
|----------|:-------------------:|:--------------------------:|
| Pertence a | Cada objeto individualmente | À classe como um todo |
| Requer `new` para existir | ✅ Sim | ❌ Não |
| Acesso | `objeto.membro` | `Classe.membro` |
| Cópias na memória | Uma por objeto criado | Uma única, compartilhada |
| Pode usar `this` | ✅ Sim | ❌ Não |
| Uso típico | Estado e comportamento do objeto | Utilitários, contadores, constantes |

### Exemplo Completo: Controle de Instâncias

```java
public class Produto {
    // Atributo estático — compartilhado: conta todos os produtos criados
    private static int totalProdutos = 0;

    // Atributos de instância — cada produto tem os seus
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome  = nome;
        this.preco = preco;
        totalProdutos++; // incrementa o contador global a cada new
    }

    // Método estático — não depende de nenhum objeto específico
    public static int getTotalProdutos() {
        return totalProdutos;
    }

    // Método de instância — depende dos dados do objeto
    public void exibir() {
        System.out.println(nome + " — R$ " + preco);
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        System.out.println(Produto.getTotalProdutos()); // → 0

        Produto p1 = new Produto("Caneta", 2.50);
        Produto p2 = new Produto("Caderno", 15.90);
        Produto p3 = new Produto("Mochila", 89.99);

        p1.exibir(); // → Caneta — R$ 2.5
        p2.exibir(); // → Caderno — R$ 15.9

        System.out.println(Produto.getTotalProdutos()); // → 3
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

## 🔄 Override (Sobrescrita de Métodos)

Quando uma subclasse herda um método da superclasse, ela pode **reescrever** esse método para ter um comportamento especializado. Isso é o **override** — o método da subclasse substitui o da superclasse para aquele tipo de objeto.

### Como funciona

```java
// Superclasse
public class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de animal...");
    }
}

// Subclasse
public class Cachorro extends Animal {

    @Override
    public void emitirSom() {
        System.out.println("Au au!"); // comportamento especializado
    }
}

// Uso
Animal a = new Animal();
a.emitirSom();   // → "Som genérico de animal..."

Cachorro c = new Cachorro();
c.emitirSom();   // → "Au au!"
```

### A anotação `@Override`

É colocada antes do método sobrescrito. É opcional, mas altamente recomendada pois:

- Avisa o compilador que a intenção é sobrescrever um método da superclasse
- Se o nome do método estiver errado, o **compilador avisa** em vez de criar um método novo silenciosamente

### Regras do Override

| Regra | Detalhe |
|-------|---------|
| **Nome** | Deve ser idêntico ao da superclasse |
| **Parâmetros** | Devem ser os mesmos |
| **Retorno** | Deve ser o mesmo (ou compatível) |
| **Acesso** | Não pode ser mais restritivo que o original |

### Usando `super` junto com Override

É possível sobrescrever **e ainda aproveitar** o comportamento original da superclasse usando `super.nomeDoMetodo()`:

```java
public class Gerente extends Funcionario {

    @Override
    public void apresentar() {
        super.apresentar();  // executa o método da superclasse primeiro
        System.out.println("E sou o gerente do setor!");
    }
}
```

### Override vs Sobrecarga (Overload)

| | **Override** | **Sobrecarga (Overload)** |
|---|---|---|
| Onde? | Entre classes (herança) | Na mesma classe |
| Nome | Mesmo | Mesmo |
| Parâmetros | **Mesmos** | **Diferentes** |
| Objetivo | Especializar comportamento | Dar opções de uso |

> 💡 **Dica:** a sobrecarga já foi vista na seção de Construtores — o mesmo conceito se aplica a métodos comuns. O override é exclusivo da herança.

---

## 🧩 Classes Abstratas

Uma **classe abstrata** é um molde incompleto — ela define uma estrutura e pode conter comportamentos concretos, mas **não pode ser instanciada diretamente**. Seu propósito é servir como base obrigatória para subclasses, impondo um contrato de implementação.

A palavra-chave é `abstract`, aplicada tanto à classe quanto aos métodos que devem ser obrigatoriamente implementados pelas subclasses.

```
┌──────────────────────────────────────────────┐
│           <<abstract>>  Forma               │
│  ──────────────────────────────────────────  │
│  # cor : String                             │  ← Atributo herdável
│  ──────────────────────────────────────────  │
│  + getCor() : String                        │  ← Método concreto (herdado)
│  + calcularArea() : double  {abstract}      │  ← Método abstrato (contrato)
└──────────────────────────────────────────────┘
                     △
          ┌──────────┴──────────┐
          │                     │
   ┌──────────────┐     ┌──────────────┐
   │   Circulo    │     │  Retangulo   │
   │ ──────────── │     │ ──────────── │
   │ + calcularArea()   │ + calcularArea()
   └──────────────┘     └──────────────┘
```

### Declarando uma Classe Abstrata

```java
public abstract class Forma {
    protected String cor;

    public Forma(String cor) {
        this.cor = cor;
    }

    // Método concreto — tem implementação, é herdado normalmente
    public String getCor() {
        return this.cor;
    }

    // Método abstrato — sem corpo; obriga a subclasse a implementar
    public abstract double calcularArea();
}
```

> ⚠️ Uma classe que contém **ao menos um método `abstract`** deve obrigatoriamente ser declarada como `abstract`. O inverso não é verdadeiro: uma classe `abstract` pode não ter nenhum método abstrato.

### Implementando Subclasses

Toda subclasse **concreta** (não-abstrata) que herda de uma classe abstrata é obrigada a implementar **todos** os métodos abstratos. Caso contrário, ela também deverá ser declarada `abstract`.

```java
public class Circulo extends Forma {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

public class Retangulo extends Forma {
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura) {
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
```

### Por que não é possível instanciar uma classe abstrata?

```java
Forma f = new Forma("Azul"); // ERRO de compilação: Forma is abstract; cannot be instantiated
```

A classe abstrata existe para ser **generalização**, não para gerar objetos. Ela modela o conceito, não a entidade concreta. Um `Circulo` existe; uma `Forma` genérica, sem especificação, não faz sentido como objeto real.

### Polimorfismo com Classes Abstratas

A referência do tipo da superclasse abstrata pode apontar para qualquer subclasse concreta. O método executado é sempre o da subclasse real do objeto — isso é **polimorfismo em tempo de execução**.

```java
public class Main {
    public static void main(String[] args) {

        Forma f1 = new Circulo("Vermelho", 5.0);
        Forma f2 = new Retangulo("Azul", 4.0, 6.0);

        System.out.println(f1.getCor());         // → Vermelho
        System.out.println(f1.calcularArea());   // → 78.53...  (Circulo)
        System.out.println(f2.calcularArea());   // → 24.0      (Retangulo)
    }
}
```

> 💡 Essa capacidade de referenciar subclasses via tipo abstrato é o fundamento do **baixo acoplamento** — o código que usa `Forma` não precisa saber se está lidando com um `Circulo` ou `Retangulo`.

### Método Abstrato vs. Método Concreto

| Característica | Método Abstrato | Método Concreto |
|----------------|:--------------:|:---------------:|
| Corpo `{ }` | ❌ Proibido | ✅ Obrigatório |
| Palavra-chave | `abstract` | — |
| Herdado como está | ❌ Deve ser sobrescrito | ✅ Pode ser usado diretamente |
| Pode ser `private` | ❌ Nunca | ✅ Sim |
| Objetivo | Impor contrato às subclasses | Oferecer comportamento reutilizável |

```java
// Método abstrato — apenas assinatura
public abstract double calcularArea();

// Método concreto — tem implementação
public void exibirInfo() {
    System.out.println("Cor: " + this.cor + " | Área: " + calcularArea());
}
```

### Cadeia Abstrata: Subclasse também Abstrata

Se uma subclasse não implementar todos os métodos abstratos herdados, ela deve ser declarada `abstract` também. A obrigação se propaga pela cadeia até a primeira classe concreta.

```java
public abstract class Poligono extends Forma {
    protected int lados;

    public Poligono(String cor, int lados) {
        super(cor);
        this.lados = lados;
    }

    public abstract double calcularPerimetro();
}

public class Quadrado extends Poligono {
    private double lado;

    public Quadrado(String cor, double lado) {
        super(cor, 4);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
```

### Classe Abstrata vs. Interface — Quando usar cada uma

| Dimensão | Classe Abstrata | Interface |
|----------|:--------------:|:---------:|
| Palavra-chave | `abstract class` | `interface` |
| Herança/Implementação | `extends` (1 única) | `implements` (múltiplas) |
| Pode ter atributos de instância | ✅ Sim | ❌ Apenas `static final` |
| Pode ter construtores | ✅ Sim | ❌ Não |
| Pode ter métodos concretos | ✅ Sim | ✅ Sim (desde Java 8, com `default`) |
| Relação semântica | **"É um"** — compartilha identidade | **"Pode fazer"** — compartilha capacidade |
| Uso ideal | Hierarquia com estado e comportamento parcial compartilhado | Contrato de comportamento sem estado |

```java
// Classe Abstrata — compartilha identidade e estado
public abstract class Veiculo {
    protected int velocidadeMaxima;
    public abstract void mover();
}

// Interface — define uma capacidade
public interface Recarregavel {
    void recarregar();
}

// Combinando os dois
public class CarroEletrico extends Veiculo implements Recarregavel {
    @Override
    public void mover() { System.out.println("Movendo silenciosamente..."); }

    @Override
    public void recarregar() { System.out.println("Carregando bateria..."); }
}
```

### Exemplo Completo: Sistema de Funcionários

```java
// Superclasse abstrata
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularBonus();

    public void exibirContracheque() {
        System.out.println("Funcionário : " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Bônus       : R$ " + calcularBonus());
        System.out.println("Total       : R$ " + (salarioBase + calcularBonus()));
    }
}

// Subclasse concreta 1
public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * 0.10;
    }
}

// Subclasse concreta 2
public class Diretor extends Funcionario {
    public Diretor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return salarioBase * 0.50;
    }
}

// Programa principal
public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Vendedor("Ana", 2000.0, 15000.0);
        Funcionario f2 = new Diretor("Carlos", 8000.0);

        f1.exibirContracheque();
        System.out.println("---");
        f2.exibirContracheque();
    }
}
```

**Saída:**
```
Funcionário : Ana
Salário Base: R$ 2000.0
Bônus       : R$ 1500.0
Total       : R$ 3500.0
---
Funcionário : Carlos
Salário Base: R$ 8000.0
Bônus       : R$ 4000.0
Total       : R$ 12000.0
```

### Síntese: Quando usar Classe Abstrata?

Use `abstract class` quando:

**Hierarquia com identidade compartilhada** — as subclasses representam variações de um mesmo conceito (`Forma → Circulo`, `Funcionario → Gerente`).

**Estado comum** — os objetos derivados compartilham atributos que fazem sentido centralizar na superclasse (`nome`, `salarioBase`, `cor`).

**Comportamento parcialmente definido** — existe lógica comum reutilizável (métodos concretos) e lógica que cada subclasse deve especializar (métodos abstratos).

**Impedir instância direta** — quando criar um objeto do tipo genérico não faz sentido semântico no domínio do problema.

> 💡 **Regra prática:** se você se pegar duplicando atributos e métodos em várias classes relacionadas, provavelmente há uma classe abstrata esperando para ser criada.

---

## ⚠️ Principais Exceções em Java

Em Java, uma **exceção** é um evento anômalo que interrompe o fluxo normal de execução. O sistema de exceções é uma infraestrutura arquitetural — não apenas uma convenção sintática — projetada para separar a lógica de negócio da lógica de recuperação de falhas.

### Taxonomia: A Hierarquia de Throwable

```
java.lang.Throwable
├── java.lang.Error                  ← Não tratável (falhas críticas da JVM)
└── java.lang.Exception              ← Tratável
    ├── RuntimeException  [Unchecked]
    │   ├── NullPointerException
    │   ├── ArrayIndexOutOfBoundsException
    │   ├── ArithmeticException
    │   ├── ClassCastException
    │   └── IllegalArgumentException
    └── IOException, SQLException... [Checked]
```

| Nível | Classe | Descrição |
|-------|--------|-----------|
| Topo | `Throwable` | Raiz de toda a hierarquia |
| Irrecuperável | `Error` | Falhas críticas da JVM — nunca capturar |
| Recuperável | `Exception` | Cenários dos quais o programa pode se recuperar |
| Falha de lógica | `RuntimeException` | Erros de programação — subclasse de Exception |

### Checked vs. Unchecked — O Contrato Arquitetural

| Dimensão | Checked | Unchecked |
|----------|---------|-----------|
| **Herança Base** | Estendem `Exception` (exceto `RuntimeException`) | Estendem `RuntimeException` |
| **Verificação do Compilador** | Obrigatória — exige `try-catch` ou `throws` | Opcional — compilador não obriga o tratamento |
| **Natureza da Falha** | Fatores externos imprevistos (rede, arquivo) | Erros lógicos de programação |
| **Ação Recomendada** | Recuperação ativa ou mitigação do erro | Correção do código-fonte (bug-fix) |
| **Exemplos** | `IOException`, `SQLException` | `NullPointerException`, `ArithmeticException` |

### Exceções Unchecked (Erros de Lógica)

#### `NullPointerException`
Ocorre quando a JVM tenta acessar um método ou atributo em uma referência que aponta para `null`.

```java
String texto = null;
int tamanho = texto.length(); // Dispara NullPointerException
```

#### `IndexOutOfBoundsException`
Indica que um índice de alguma estrutura ordenável (Array, String, List) está fora dos limites válidos.

#### `ArithmeticException`
Lançada quando ocorre uma condição matemática impossível durante o processamento.

```java
int a = 10;
int b = 0;
System.out.println(a / b); // Lança ArithmeticException: / by zero
```

#### `IllegalArgumentException`
Exceção lançada proativamente para indicar que um método recebeu um argumento com valor inapropriado. Padrão **Fail-Fast**.

```java
throw new IllegalArgumentException("Idade inválida");
```

#### `IllegalStateException`
Sinaliza que um método foi invocado num momento ilegal — o objeto não está no estado correto para processar a operação.

### Exceções Checked (Contingências Externas)

#### `IOException`
Sinaliza falha ou interrupção nas operações de Entrada/Saída. **Exige** bloco `try-catch` ou declaração `throws`.

#### `SQLException`
Lançada para erros no acesso a banco de dados ou problemas correlatos a transações relacionais.

### Exceções Customizadas

```java
// Caminho Checked — força o chamador a tratar
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}

// Caminho Unchecked — chamador não é obrigado a capturar
class IdadeInvalidaException extends RuntimeException {
    public IdadeInvalidaException(String mensagem) {
        super(mensagem);
    }
}
```

### Cheat Sheet: Matriz de Síntese

| Exceção | Categoria | Significado Resumido | Escopo da Causa |
|---------|-----------|---------------------|-----------------|
| `NullPointerException` | Unchecked | Referência nula de memória | Lógica/Desenvolvedor |
| `IndexOutOfBoundsException` | Unchecked | Violação de limites de Array/Lista | Lógica/Desenvolvedor |
| `ArithmeticException` | Unchecked | Falha matemática (ex: Div/0) | Lógica/Desenvolvedor |
| `IllegalArgumentException` | Unchecked | Parâmetro de método inválido | Validação de Contrato |
| `IllegalStateException` | Unchecked | Estado de vida do objeto corrompido | Controle de Fluxo/Objeto |
| `IOException` | Checked | Interrupção em leitura/escrita | Ambiente/Arquivo/Rede |
| `SQLException` | Checked | Falha transacional em BD | Infraestrutura/Banco |
| Custom Exceptions | Depende | Violação de regra de negócios | Arquitetura de Domínio |

---

## 🛡️ Tratamento de Exceções em Java

O tratamento de exceções é uma **infraestrutura arquitetural** projetada para separar a lógica de negócio da lógica de recuperação de falhas, garantindo a integridade do estado da aplicação diante de anomalias.

### O Fluxo try-catch

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

### O bloco `finally`

Executado **sempre**, independentemente de sucesso ou falha. Usado para liberar recursos.

```java
try {
    // lógica de negócio
} catch (IOException e) {
    // tratamento
} finally {
    // executado SEMPRE — sucesso ou falha
    recurso.close();
}
```

### `throw` vs. `throws` — A Ação vs. O Contrato

| | `throw` | `throws` |
|---|---------|---------|
| **O quê** | Executa a falha — sinaliza condição anômala | Declara as exceções que o método pode disparar |
| **Escopo** | Dentro do corpo do método | Na assinatura do método |

```java
// throw — dentro do corpo
throw new IllegalArgumentException("Valor nulo");

// throws — na assinatura
public void lerArquivo() throws IOException {
    ...
}
```

### Gestão de Recursos: try-with-resources (Java 7+)

```java
// ✅ Java 7+ — limpo e seguro
try (Scanner leitor = new Scanner(arquivo)) {
    // leitor.close() é chamado automaticamente ao sair do bloco
} catch (IOException e) {
    // tratamento
}
```

### Síntese Arquitetural: O Cenário Ideal

```java
public void processarDados() throws OperacaoFalhouException {
    try (Scanner leitor = new Scanner(arquivo)) {
        if (!valido) {
            throw new RegraNegocioException();
        }
    } catch (IOException | SQLException e) {
        throw new OperacaoFalhouException("Falha na leitura", e);
    }
}
```

> 💡 A resiliência não significa evitar falhas, mas construir uma infraestrutura onde, mesmo diante do inevitável, o software falhe de forma **controlada, recuperável e documentada**.

---

## 📝 Paradigmas de Programação (Contexto)

- **Imperativas → Procedurais:** C, COBOL, Pascal
- **Imperativas → Orientada a Objetos:** Java, C++, Python, C#  ← *estamos aqui*
- **Declarativas → Funcionais:** Erlang, R
- **Declarativas → Lógicas:** Prolog, LISP
