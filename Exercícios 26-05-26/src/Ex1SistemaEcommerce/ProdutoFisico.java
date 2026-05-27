package Ex1SistemaEcommerce;

public class ProdutoFisico extends Produto implements Avaliavel {
	public ProdutoFisico(String nome, double preco) {
		super(nome, preco);
	}
	
	@Override
	public double calcularFrete() {
		return getPreco() * 0.10; 
	}	
}
