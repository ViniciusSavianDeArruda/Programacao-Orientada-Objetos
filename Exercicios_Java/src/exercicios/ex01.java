//4 - Escreva um programa Java que use um laço para somar os números de 1 a 100.
package exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int soma = 0;
		for(int i = 1; i <=100; i++) {
			soma +=i;
		}
		System.out.println("A soma dos números de 1 a 100 é: " + soma);
		
		teclado.close();
		
	}

}


