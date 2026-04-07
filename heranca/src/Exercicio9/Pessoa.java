//9) Crie uma classe Pessoa com nome e idade . Crie uma subclasse Aluno com o atributo matricula . 
//Sobrescreva o método toString() em Aluno para exibir todas as informações.
package Exercicio9;

public class Pessoa {
	private String nome;
	private int idade;
	
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
