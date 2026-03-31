package Exercicio7;

public class MainUsuario {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		
		user.setSenha("admin123");
		
		System.out.println(user.getSenha());
	}

}
