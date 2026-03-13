//5 - Crie uma classe chamada Produto com os atributos:
//nome
//preço
//quantidadeEmEstoque
//Crie uma classe executável que:
//Solicite os valores ao usuário pelo teclado.
//Crie um objeto do tipo Produto.
//Calcule o valor total em estoque (preço × quantidade).
//Exiba todas as informações do produto e o valor total em estoque.
package pkg;
import java.util.Scanner;
public class ExecProduto {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		Produto p = new Produto();

		System.out.println("Digite o nome do produto:");
		p.nome = teclado.nextLine();

		System.out.println("Digite o preço do produto:");
		p.preco = teclado.nextDouble();

		System.out.println("Digite a quantidade em estoque:");
		p.quantidadeEmEstoque = teclado.nextInt();

		double valorTotal = p.preco * p.quantidadeEmEstoque;

		System.out.println("\nInformações do Produto");
		System.out.println("Nome: " + p.nome);
		System.out.println("Preço: " + p.preco);
		System.out.println("Quantidade em estoque: " + p.quantidadeEmEstoque);
		System.out.println("Valor total em estoque: " + valorTotal);

		teclado.close();

	}

}
