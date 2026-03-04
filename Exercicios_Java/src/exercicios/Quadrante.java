/*4 - Escreva um algoritmo que leia um ponto (x,y) pelo teclado e informe em
qual quadrante o ponto se encontra no plano cartesiano ou se o ponto está
sobre um dos eixos.*/

package exercicios;
import java.util.Scanner;

public class Quadrante {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a coordenada x: ");
		double x = teclado.nextDouble();
		
		System.out.print("Digite a coordenada y: ");
		double y = teclado.nextDouble();
		
		if (x > 0 && y > 0) {
			System.out.println("O ponto (" + x + ", " + y + ") está no primeiro quadrante.");
		} else if (x < 0 && y > 0) {
			System.out.println("O ponto (" + x + ", " + y + ") está no segundo quadrante.");
		} else if (x < 0 && y < 0) {
			System.out.println("O ponto (" + x + ", " + y + ") está no terceiro quadrante.");
		} else if (x > 0 && y < 0) {
			System.out.println("O ponto (" + x + ", " + y + ") está no quarto quadrante.");
		} else if (x == 0 && y != 0) {
			System.out.println("O ponto (" + x + ", " + y + ") está sobre o eixo Y.");
		} else if (y == 0 && x != 0) {
			System.out.println("O ponto (" + x + ", " + y + ") está sobre o eixo X.");
		} else {
			System.out.println("O ponto (" + x + ", " + y + ") é a origem.");
		
		}
		
	}
}
		