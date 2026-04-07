package Exercicio6;

public class Circulo extends Forma {
	private int raio;

	public Circulo(String cor, int raio) {
		super(cor);
		this.raio = raio;
	}
	
	//getters returnar raio o valor de raio
	public int getRaio() {
		return raio;
	}
	
	//setters pegar o valor de raio
	public void setRaio(int raio) {
		this.raio = raio;
	}
	

}
