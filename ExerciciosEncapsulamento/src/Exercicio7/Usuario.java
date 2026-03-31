//7 - Crie uma classe Usuario com nome e senha . 
//O método getSenha() deve retornar a senha mascarada (ex: "********") por segurança, enquanto o setSenha deve exigir no mínimo 8 caracteres.

package Exercicio7;
public class Usuario {
	private String nome;
	private String senha;
	
	//get retorna o valor(senha mascarada) = pegar algo da classe
	public String getSenha(){
		String mascara = "";
		
		for(int i = 0; i < senha.length();i++) {
			mascara += "*";
		}
		return mascara;
	}
	
	//set = quero dar um valor para a classe
	public void setSenha(String senha) {
		if(senha.length() >= 8) {
			this.senha = senha;
		}else {
			System.out.println("Senha deve ter pelo menos 8 caracteres");
		}
	}

}
