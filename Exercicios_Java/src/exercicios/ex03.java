// 8 - Escreva um programa Java que use um laço para ler vários nomes de cidades do usuário até que o nome "São Paulo" seja lido.
package exercicios;
import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String cidade;
        
        do {
        	System.out.println("Digite o nome de uma cidade (ou São Paulo para sair): ");
        	cidade = teclado.nextLine();
        	
        }while (!cidade.equalsIgnoreCase("São Paulo"));
        
        System.out.println("Programa encerrando...");
        
        teclado.close();
    }
}





