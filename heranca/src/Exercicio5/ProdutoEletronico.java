package Exercicio5;

public class ProdutoEletronico extends Produto {
	private int garantia;

	//construtor 
	public ProdutoEletronico(String nome, double preco, int garantia) {
		super(nome, preco);
		this.garantia = garantia;
	}

	public int getGarantia() {
		return garantia;
		
	}
	
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
}
