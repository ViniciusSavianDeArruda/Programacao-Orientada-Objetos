/*1 - Faça um programa para leitura de dois números e após faça as quatro operações
matemáticas (Soma, Subtração, Multiplicação e divisão)*/
// 9 -Altere o exercício 1 e faça um menu utilizando switch case

package exercicios;
import java.util.Scanner;

public class OperacoesMatematicas {
	public static void main(String[] args) {
		
		//utlizando a forma do exercicio 9
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("Escolha a operação: ");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		
		int escolha = teclado.nextInt();
		switch (escolha) {
			case 1:
				System.out.println("Soma: " + (num1 + num2));
				break;
			case 2:
				System.out.println("Subtração: " + (num1 - num2));
				break;
			case 3:
				System.out.println("Multiplicação: " + (num1 * num2));
				break;
			case 4:
				if (num2 != 0) {
					System.out.println("Divisão: " + (num1 / num2));
				} else {
					System.out.println("Erro: Divisão por zero não é permitida.");
				}
				break;
			default:
				System.out.println("Opção inválida.");
				
				
		//utlizando a forma do exercicio 1
		/*Scanner teclado = new Scanner(System.in);
				
		System.out.println("Digite o primeiro número: ");
		double num1 = teclado.nextDouble();
				
		System.out.println("Digite o segundo número: ");
		double num2 = teclado.nextDouble();
				
		double soma = num1 + num2;
		double subtracao = num1 - num2;
		double multiplicacao = num1 * num2;
		double divisao = num1 / num2;
				
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		*/
			
		}
		
	}
}
		
	

