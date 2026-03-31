package Exercicio4;

public class MainProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		
		p.adicionarEstoque(10);
		p.removerEstoque(3);
		
		System.out.println(p.getQuantidadeEmEstoque());

	}

}
