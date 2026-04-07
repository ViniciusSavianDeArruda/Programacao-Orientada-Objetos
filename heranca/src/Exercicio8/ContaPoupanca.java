package Exercicio8;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	@Override
	public void render() {
		saldo += saldo * 0.01;
	}
	

}
