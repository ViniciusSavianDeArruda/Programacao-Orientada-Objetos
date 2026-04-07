package Exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();
		
		System.out.println("Animal:");
		animal.emitirSom();
		
		System.out.println("\nCachorro:");
		cachorro.emitirSom();
		
		System.out.println("\nGato:");
		gato.emitirSom();

	}

}
