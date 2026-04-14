//1. Calculadora (ArithmeticException)
//Crie um programa que peça ao usuário dois números inteiros e realize a divisão do primeiro pelo segundo. 
//Utilize um bloco try-catch para capturar a ArithmeticException caso o usuário tente dividir por zero, exibindo a mensagem: 
//"Erro matemático: impossível dividir por zero!".

package Exercicio1Calculadora;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		try {
			
			System.out.println("Digite um numero inteiro:");
			int num1 = teclado.nextInt();
			
			System.out.println("Digite outro numero inteiro:");
			int num2 = teclado.nextInt();
			
			int resultado = num1 / num2;
			
			System.out.println("Resultado:" + resultado);	
			
		}catch (ArithmeticException e ) {
			System.out.println("ERRO matematico: impossivel dividir por zero");
		}
		
		teclado.close();
	}

}
