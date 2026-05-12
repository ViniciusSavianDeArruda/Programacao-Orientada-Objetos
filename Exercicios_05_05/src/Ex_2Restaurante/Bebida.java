package Ex_2Restaurante;

public class Bebida extends ItemCardapio {
	private boolean  isAlcoolica;
	
	public Bebida(String nome, double precoBase, boolean isAlcoolica) {
		super(nome, precoBase);
		this.isAlcoolica = isAlcoolica;
	}

	@Override
	public double calcularPrecoFinal() {
		if(isAlcoolica) {
			return getPrecoBase() * 1.10;
			
		}
		
		return getPrecoBase();
	} 
	
}
