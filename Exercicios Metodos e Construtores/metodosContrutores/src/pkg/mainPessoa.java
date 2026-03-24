package pkg;
import java.util.Scanner;

public class mainPessoa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha o tipo do construtor:");
		System.out.println("Construtor A: Digite 1-Nome e idade:");
		System.out.println("Constutor B: Digite 2-apenas idade:");
		
		int opcao = teclado.nextInt();
        teclado.nextLine();
        
        if(opcao == 1) {
        	 System.out.println("Digite o nome:");
             String nome = teclado.nextLine();

             System.out.println("Digite a idade:");
             int idade = teclado.nextInt();

             pessoa p = new pessoa(nome, idade);
             
        }else if(opcao == 2) {
        	System.out.println("Digite a idade:");
            int idade = teclado.nextInt();

            pessoa p = new pessoa(idade);
        }
        
        teclado.close();

	}

}
