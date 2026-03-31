package Exercicio6;

public class MainConometro {

	public static void main(String[] args) {
		Cronometro c = new Cronometro();
		
		c.passarTempo();
		c.passarTempo();
		c.passarTempo();
		c.passarTempo();
		
		System.out.println(c.getSegundos());

	}

}
