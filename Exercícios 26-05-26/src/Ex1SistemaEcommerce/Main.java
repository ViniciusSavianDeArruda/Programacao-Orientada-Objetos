package Ex1SistemaEcommerce;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Produto> carrinho = new ArrayList<>();

		System.out.println("Sistema E-commerce");

		try {

			ProdutoFisico produto1 = new ProdutoFisico("Calça", 2000);

			carrinho.add(produto1);

			System.out.print("Digite uma avaliação para " + produto1.getNome() + " (1 a 5): ");

			int avaliacao = sc.nextInt();

			produto1.adicionarAvaliacao(avaliacao);

		} catch (NotaInvalidaException e) {

			System.out.println("Erro na avaliação: " + e.getMessage());

		} catch (IllegalArgumentException e) {

			System.out.println("Erro no preço: " + e.getMessage());
		}

		try {

			ProdutoDigital produto2 = new ProdutoDigital("Telefone", 1000);

			carrinho.add(produto2);

			System.out.print("Digite uma avaliação para " + produto2.getNome() + " (1 a 5): ");

			int avaliacao = sc.nextInt();

			produto2.adicionarAvaliacao(avaliacao);

		} catch (NotaInvalidaException e) {

			System.out.println("Erro na avaliação: " + e.getMessage());

		} catch (IllegalArgumentException e) {

			System.out.println("Erro no preço: " + e.getMessage());
		}

		System.out.println("\nProdutos no Carrinho");

		double total = 0;

		for (Produto produto : carrinho) {

			double frete = produto.calcularFrete();

			double subtotal = produto.getPreco() + frete;

			total += subtotal;

			System.out.println(
				"Produto: " + produto.getNome()
				+ " | Preço: R$" + produto.getPreco()
				+ " | Frete: R$" + frete
				+ " | Subtotal: R$" + subtotal
			);
		}

		System.out.println("\nTotal da compra: R$" + total);

		sc.close();
	}
}