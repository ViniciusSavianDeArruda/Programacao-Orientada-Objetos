package aula02;

import java.util.Scanner;

public class pricipal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        
        // Leitura de inteiro
        int numero;
        System.out.println("Digite um numero inteiro:");
        numero = teclado.nextInt();
        System.out.println("Inteiro digitado: " + numero);

        // Leitura de double
        double numeroDecimal;
        System.out.println("Digite um numero decimal:");
        numeroDecimal = teclado.nextDouble();
        System.out.println("Double digitado: " + numeroDecimal);

        // Limpar buffer do teclado
        teclado.nextLine();

        // Leitura de String (linha completa)
        String palavra;
        System.out.println("Digite uma frase:");
        palavra = teclado.nextLine();
        System.out.println("String digitada: " + palavra);

      
         //Usado quando sabemos o número de repetições
        for (int i = 0; i < 10; i++) {

            if (i == 7) {
                break; // Interrompe o laço
            }

            if (i == 5) {
                continue; // Pula para a próxima repetição
            }

            System.out.println("Valor de i (for): " + i);
        }

         //Usado quando NÃO sabemos exatamente quantas vezes o laço irá repetir
        int i = 0;
        while (i < 5) {
            System.out.println("Valor de i (while): " + i);
            i++;
        }


       //Executa pelo menos UMA vez, mesmo que a condição seja falsa
        int j = 0;
        do {
            System.out.println("Valor de j (do-while): " + j);
            j++;
        } while (j < 5);


        teclado.close();
    }
}

	
















