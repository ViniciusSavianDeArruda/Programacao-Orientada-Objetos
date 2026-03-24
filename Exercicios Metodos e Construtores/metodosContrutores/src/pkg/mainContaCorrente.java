package pkg;

public class mainContaCorrente {

	public static void main(String[] args) {
		
		contaCorrente novaConta = new contaCorrente();
		
		novaConta.definirSaldoInicial(1000);
		System.out.println("Saldo Inicial:" + novaConta.saldo);
		
		novaConta.sacar(500);
		novaConta.depositar(50);
		System.out.println("Saldo:" + novaConta.saldo);
		
		novaConta.sacar(600);
		System.out.println("Saldo Final:" + novaConta.saldo);
		
	}

}
