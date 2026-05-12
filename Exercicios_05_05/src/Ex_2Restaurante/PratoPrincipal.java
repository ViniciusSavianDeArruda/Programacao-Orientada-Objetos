package Ex_2Restaurante;

public class PratoPrincipal extends ItemCardapio {
	private int tempoPreparo;
	
	public PratoPrincipal(String nome,double precoBase, int tempoPreparo) {
		super(nome, precoBase);
		this.tempoPreparo = tempoPreparo;
		
	}

	public int getTempoPreparo() {
		return tempoPreparo;
	}

	@Override
	public double calcularPrecoFinal() {
		return getPrecoBase();
	}
}
