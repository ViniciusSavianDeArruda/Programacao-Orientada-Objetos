package Exercico4CatracaEstadio;

public class Main {

	public static void main(String[] args) {
		
		Catraca c = new Catraca();
		
		int idade = 18;
		boolean isSocio= false;
		
		try {
			c.validarIngresso(idade, isSocio);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
