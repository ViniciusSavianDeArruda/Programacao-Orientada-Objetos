//2. Escala Musical (ArrayIndexOutOfBoundsException)
//Crie um programa que inicialize um vetor de Strings com as notas de uma escala musical: {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"}. 
//Peça ao usuário para digitar um número de 1 a 7 para exibir a nota correspondente. Lembre-se que os índices do vetor vão de 0 a 6.
//Use try-catch para evitar que o programa quebre se o usuário digitar 8 ou 0.

package Exercico2EscalaMusical;
import java.util.Scanner;

public class EscalaMusical {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] notas = {"Dó", "Ré", "Mi", "Fá", "Sol", "Lá", "Si"};
		
		System.out.print("Digite um número de 1 a 7: ");
		int numero = teclado.nextInt();
		
		try {
			int indice = numero -1;
			
			System.out.println("Nota: "+ notas[indice]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro: numero ivalido! Digite entre 1 e 7");
		}
		teclado.close();
	}
	
}
