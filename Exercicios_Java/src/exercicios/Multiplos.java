//7 - Escreva um algoritmo que leia dois valores pelo teclado e informe se os mesmos são múltiplos um do outro ou não.

package exercicios;
import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int valor1 = teclado.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int valor2 = teclado.nextInt();
		
		if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
			System.out.println("Os valores " + valor1 + " e " + valor2 + " são múltiplos um do outro.");
		} else {
			System.out.println("Os valores " + valor1 + " e " + valor2 + " não são múltiplos um do outro.");
		}

	}

}
