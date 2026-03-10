//3 - Escreva um programa Java que use um vetor para ler as notas de 5 alunos e depois calcule e imprima a média das notas.
package exercicios;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		double[] notas = new double[5];
		double soma = 0, media;
		
		System.out.println("Notas alunos");
		for(int i = 0; i < notas.length; i++ ) {
			System.out.println("Digite a nota do aluno " + (i+1) + ":");
			notas[i] = teclado.nextDouble();
			soma += notas[i];
		}
			
			System.out.println("Media dos alunos:");
			media = soma / notas.length;
			
			System.out.println("A média das notas é: " + media);
			
			teclado.close();
	}

}

