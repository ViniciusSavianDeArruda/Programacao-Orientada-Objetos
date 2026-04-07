package Exercicio8;

public class Main {

	public static void main(String[] args) {
		ContaPoupanca c = new ContaPoupanca(2000);
		
		c.render();
		System.out.println("Saldo:" + c.saldo);

	}

}
