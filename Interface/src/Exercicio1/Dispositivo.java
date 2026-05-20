package Exercicio1;

public abstract class Dispositivo {
	protected String marca;

	public Dispositivo(String marca) {
		this.marca = marca;
	}
	
	public void exibirMarca() {
		System.out.println("Marca do dispositivo:" + this.marca);
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public abstract void ligar();

}
