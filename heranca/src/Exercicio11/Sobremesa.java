package Exercicio11;

public class Sobremesa extends ItemMenu {
	private boolean contemAcucar;
	
	public Sobremesa(String nome, double preco, boolean contemAcucar) {
		super(nome, preco);
		this.contemAcucar = contemAcucar;
	}

	public boolean getContemAcucar() {
		return contemAcucar;
	}

	public void setContemAcucar(boolean contemAcucar) {
		this.contemAcucar = contemAcucar;
	}
	
	

}
