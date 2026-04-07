package Exercicio5;

public class Main {

	public static void main(String[] args) {
		
		ProdutoEletronico p = new ProdutoEletronico("Tablet", 3500, 12);
		
		System.out.println("Nome do produto:" + p.getNome());
		System.out.println("Preco do produto:" + p.getPreco());
		System.out.println("Garantia do produto:" + p.getGarantia());

	}

}
