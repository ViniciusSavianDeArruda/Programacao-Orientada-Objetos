package pkg;

public class contaCorrente {
	double saldo;
	
	public void definirSaldoInicial(double valor) {
		saldo = valor;
	}
	public void sacar(double valor) {
		saldo -= valor;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
}
