//11) Crie uma classe ItemMenu com nome e preco . Crie uma subclasse Sobremesa que adiciona um booleano contemAcucar .
package Exercicio11;

public class ItemMenu {
	private String nome;
	private double preco;
	

	public ItemMenu(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
