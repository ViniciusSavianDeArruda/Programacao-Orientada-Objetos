/*5 - Escreva um algoritmo que leia 3 valores pelo teclado e então informe qual
o maior deles*/
//Ajuste o exercício 5 de maneira que mostre os valores informados em ordem crescente

package exercicios;
import java.util.Scanner;

public class MaiorValor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = teclado.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = teclado.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = teclado.nextDouble();

        // Descobrir o maior
        double maiorValor = valor1;

        if (valor2 > maiorValor) {
            maiorValor = valor2;
        }

        if (valor3 > maiorValor) {
            maiorValor = valor3;
        }

        System.out.println("O maior valor é: " + maiorValor);

        // Ordenar em ordem crescente
        if (valor1 > valor2) {
            double temp = valor1;
            valor1 = valor2;
            valor2 = temp;
        }

        if (valor1 > valor3) {
            double temp = valor1;
            valor1 = valor3;
            valor3 = temp;
        }

        if (valor2 > valor3) {
            double temp = valor2;
            valor2 = valor3;
            valor3 = temp;
        }

        System.out.println("Valores em ordem crescente:");
        System.out.println(valor1 + " - " + valor2 + " - " + valor3);
    }
}
