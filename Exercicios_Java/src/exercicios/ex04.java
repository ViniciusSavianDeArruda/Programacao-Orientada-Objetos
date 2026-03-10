//10 - Escreva um programa Java que use um laço para calcular a média de vários números reais lidos do usuário até que seja lido o número 0.
package exercicios;
import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero, somatorio = 0, media;
        int contador = 0;

        while (true) {
            System.out.println("Digite números reais (digite 0 para encerrar):");
            numero = teclado.nextDouble();

            if (numero == 0) {
                break;
            }

            somatorio += numero;
            contador++;
        }

        media = somatorio / contador;
        System.out.println("A média dos números digitados é: " + media);

        teclado.close();
    }

}


