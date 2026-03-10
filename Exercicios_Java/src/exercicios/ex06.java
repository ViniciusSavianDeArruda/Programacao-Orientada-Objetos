//5 - Escreva um programa Java que use um vetor para ler 10 números inteiros lidos do usuário e depois imprima o maior e o menor valor.
package exercicios;
import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double[] numeros = new double[10];
		
		System.out.println("Digite 10 numeros inteiros:");
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Numero " + (i + 1) + ":");
			numeros[i] = teclado.nextDouble();
		}
		
		double maior = numeros[0];
		double menor = numeros[0];
		
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		
		System.out.println("Maior numero: " + maior);
		System.out.println("Menor numero: " + menor);

		teclado.close();
	}

}
