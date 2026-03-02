package pkg;

import java.util.Scanner;

/*
 * Revisando fundamentos de Java:
 * - Tipos de dados (int, char, float, double, boolean, String)
 * - Operadores
 * - Estruturas de controle (if, switch)
 * - Entrada de dados com Scanner
 * - Constantes com final
 */

public class Principal {

	public static void main(String[] args) {

		// Criando objeto Scanner para ler dados do teclado
		Scanner teclado = new Scanner(System.in);

		// Exibindo mensagem simples
		System.out.println("Ola Mundo");

		// Declarando e inicializando variável inteira
		int idade = 18;
		System.out.printf("Idade é: %d\n", idade);
		System.out.println("Minha idade é: " + idade);

		// Declarando variável char e outra int
		char letra = 'r';
		int anos = 1975;

		System.out.println("A letra é: " + letra);
		System.out.println("A idade é: " + anos);

		// Declarando float e double
		float precoFloat = 3.57f; // float precisa da letra 'f'
		double precoDouble = 4.33;

		System.out.println("O preço em float: " + precoFloat);
		System.out.println("O preço em double: " + precoDouble);
]
		// Declarando constante
		final double PI = 3.1415;
		System.out.println("O valor de pi é: " + PI);

		// Entrada de nome (String)
		System.out.println("Digite seu nome:");
		String nome = teclado.nextLine();
		System.out.println("Nome digitado: " + nome);

		// Entrada de idade com estrutura condicional
		System.out.println("Digite sua idade:");
		int idadeUsuario = teclado.nextInt();
		System.out.println("Idade digitada é: " + idadeUsuario);

		if (idadeUsuario >= 18) {
			System.out.println("Você é maior de idade.");
		} else {
			System.out.println("Você é menor de idade.");
		}

		// Menu usando switch-case
		System.out.println("Digite uma opção:");
		System.out.println("1 - Para cadastrar");
		System.out.println("2 - Para editar");
		System.out.println("3 - Para excluir");
		System.out.println("0 - Para sair");

		int opcao = teclado.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Opção de cadastro selecionada.");
			break;

		case 2:
			System.out.println("Opção de edição selecionada.");
			break;

		case 3:
			System.out.println("Opção de exclusão selecionada.");
			break;

		case 0:
			System.out.println("Saindo do programa.");
			break;

		default:
			System.out.println("Opção inválida.");
		}

		// Entrada de float
		System.out.println("Digite o preço do produto:");
		float precoProduto = teclado.nextFloat();
		System.out.println("O preço do produto é: " + precoProduto);

		// Entrada de double
		System.out.println("Digite um número:");
		double numero = teclado.nextDouble();
		System.out.println("O número digitado é: " + numero);

		// Entrada de caractere
		System.out.println("Digite um caractere:");
		char c = teclado.next().charAt(0);
		System.out.println("O caractere digitado é: " + c);

		// Fechando o Scanner
		teclado.close();
	}
}