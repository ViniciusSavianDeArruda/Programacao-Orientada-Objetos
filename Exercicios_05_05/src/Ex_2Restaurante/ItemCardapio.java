package Ex_2Restaurante;

public abstract class ItemCardapio {
	private String nome;
	private double precoBase;
	
	public ItemCardapio(String nome, double precoBase) {
		super();
		this.nome = nome;
		this.precoBase = precoBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	
	
	public abstract double calcularPrecoFinal();
	
	

}
