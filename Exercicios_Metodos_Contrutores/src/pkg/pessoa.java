package pkg;

public class pessoa {
	String nome;
	int idade;
	
	//construtor A(nome e idade)
	public pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		
		System.out.println("Construtor A:" + nome + idade);
	}
	
	//Construtor B(idade)
	public pessoa(int idade) {
		this.idade = idade;
		
		System.out.println("Construtor B:" + idade);
	}
	
	
	
	
	

}
