//2. Crie uma classe Pessoa com atributos nome e idade.
//Crie a classe Aluno que herda de Pessoa e adiciona matricula.
//Mostre os dados no main.

package Exercicio2;

public class Pessoa {
	protected String nome;
	protected int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
}
