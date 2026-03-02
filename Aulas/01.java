package pkg;
import java.util.Scanner;

/* Revisando fundamentos de java
* 2. Tipos de dados: Java possui vários tipos de dados, como int, char, float, double, boolean, etc.
* 3. Operadores: Java suporta operadores aritméticos (+, -, *, /), operadores de comparação (==, !=, >, <), e operadores lógicos (&&, ||).
* 4. Estruturas de controle: Java possui estruturas de controle como if-else, switch-case, for, while, do-while.
* 5. Métodos: São blocos de código que realizam uma tarefa específica e podem ser reutilizados. Exemplo: public static void main(String[] args) { ... }
* 6. Classes e objetos: Java é uma linguagem orientada a objetos, o que significa que tudo é um objeto. As classes são moldes para criar objetos.
* 7. Pacotes: São usados para organizar classes e evitar conflitos de nomes. Exemplo: package pkg;
* 8. Comentários: São usados para explicar o código e não são executados pelo programa. Exemplo:
*/
public class Principal {

public static void main(String[] args) {

* System.out.println("Ola Mundo"); int idade; idade = 18;
* System.out.printf("Idade é: %d\n", idade);
* System.out.println("Minha idade é: " + idade);
*
* char letra = 'r'; int anos = 1975; System.out.println("A letra é:" + letra);
*
* System.out.println("A idade é: " + anos);
*
* float preco; preco = 3.57f; double preco2; preco2 = 4.33;
* System.out.println("O preço em float: " + preco);
* System.out.println("O preco em dulble:" + preco2);
*
* final double pi; // final serve para declarar uma constante, ou seja, um
* valor que não pode ser alterado depois de atribuído pi = 3.1415;
* System.out.println("O valor de pi é: " + pi);


* teclado.nextLine();
*
* String nome; System.out.println("Digite seu nome:"); nome =
* teclado.nextLine(); System.out.println("nome digitado: " + nome); Scanner
* teclado = new Scanner(System.in);


* int idade; System.out.println("Digite sua idade:"); idade =
* teclado.nextInt(); System.out.println("Idade Digitada é: " + idade);
* if(idade >= 18) { System.out.println("Você é maior de idade."); } else {
* System.out.println("Você é menor de idade."); } int opcao;
* System.out.println("Digite uma opção:");
* System.out.println("1 - Para cadastrar");
* System.out.println("2 - Para editar");
* System.out.println("3 - Para excluir"); System.out.println("0 - para sair");
*
* opcao = teclado.nextInt();
*
* switch (opcao) { case 1:
* System.out.println("Opção de cadastro selecionada."); break; case 2:
* System.out.println("Opção de edição selecionada."); break; case 3:
* System.out.println("Opção de exclusão selecionada."); break; case 0:
* System.out.println("Saindo do programa."); break; }


 float preco;
System.out.println("Digite o preço do produto:");
* preco = teclado.nextFloat();
* System.out.println("O preço do produto é: " + preco);
* double numero;
* System.out.println("Digite um numero:");
* numero = teclado.nextDouble();
* System.out.println("O numero digitado é: " + numero);
*
* char c;
* System.out.println("Digite uma caractere:");
* c = teclado.next().charAt(0); System.out.println("O caractere digitado é: " + c);
*/
}

}