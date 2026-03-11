package pkg;
import java.util.Scanner;

public class execPessoa {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		pessoa p = new pessoa();
		
		System.out.println("Digite o nome da pessoa:");
		p.nome = teclado.nextLine();
		
		System.out.println("Digite a idade:");
		p.idade = teclado.nextInt();
		teclado.nextLine(); 

		System.out.println("Digite o gênero:");
		p.genero = teclado.nextLine();

		System.out.println("\nDados da Pessoa");
		System.out.println("Nome: " + p.nome);
		System.out.println("Idade: " + p.idade);
		System.out.println("Gênero: " + p.genero);

		teclado.close();
		
	}

}
