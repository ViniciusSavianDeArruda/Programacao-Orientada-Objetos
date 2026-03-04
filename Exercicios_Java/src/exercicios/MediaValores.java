/*3 - Escrever um algoritmo para ler quatro valores float, calcular a sua média,
e escrever na tela os que são superiores à média.
*/

package exercicios;
import java.util.Scanner;

public class MediaValores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        float valor1 = teclado.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float valor2 = teclado.nextFloat();

        System.out.print("Digite o terceiro valor: ");
        float valor3 = teclado.nextFloat();

        System.out.print("Digite o quarto valor: ");
        float valor4 = teclado.nextFloat();

        // cálculo da média
        float media = (valor1 + valor2 + valor3 + valor4) / 4;

        System.out.printf("\nMédia dos valores: %.2f\n", media);
        System.out.println("Valores superiores à média:");

        if (valor1 > media) {
            System.out.println("Valor 1: " + valor1);
        }

        if (valor2 > media) {
            System.out.println("Valor 2: " + valor2);
        }

        if (valor3 > media) {
            System.out.println("Valor 3: " + valor3);
        }

        if (valor4 > media) {
            System.out.println("Valor 4: " + valor4);
        }

    }
}
