//6)Crie uma classe Forma com um atributo cor . 
//Crie uma subclasse Circulo que adiciona o atributo raio . Implemente construtores que inicializem ambos os atributos.
package Exercicio6;

public class Forma {
	private String cor;

	public Forma(String cor) {
		this.cor = cor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
