package Ex1SistemaEcommerce;

public class ProdutoDigital extends Produto implements Avaliavel {
	public ProdutoDigital(String nome, double preco) {
		super(nome, preco);
	}

	@Override
	public double calcularFrete() {
		return 0.0;
	}


}
