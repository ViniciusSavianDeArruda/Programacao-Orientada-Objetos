package Exercicio1;

public class MainContaBancaria {

	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setLimite(300);
		conta.sacar(50);
		conta.sacar(200);
		
		System.out.println(conta.getSaldo());
		
	}

}
