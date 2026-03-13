//4 - Crie uma classe Livro com os atributos título, autor e ano de publicação. Imprima as informações do livro na tela.
package pkg;
import java.util.Scanner;

public class livro {
	String titulo;
	String autor;
	int anoPublicacao;
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		livro l = new livro();
		
		System.out.println("Digite o título do livro:");
		l.titulo = teclado.nextLine();
		
		System.out.println("Digite o autor do livro:");
		l.autor = teclado.nextLine();
		
		System.out.println("Digite o ano de publicação:");
		l.anoPublicacao = teclado.nextInt();
		
		System.out.println("\nInformações do Livro");
		System.out.println("Título: " + l.titulo);
		System.out.println("Autor: " + l.autor);
		System.out.println("Ano de publicação: " + l.anoPublicacao);
		
		teclado.close();
		
	}
	
}



