//5 - Escreva um programa Java que use um laço para calcular o fatorial de um número inteiro.
package exercicios;
import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num, fatorial = 1;
  
      System.out.println("Digite um numero inteiro:");
      num = teclado.nextInt(); 
      
      for(int i = 1; i <= num; i++) {
          fatorial *= i;
      }
      
      System.out.println("O fatorial de " + num + " é: " + fatorial);
      
      teclado.close();
	}

}


