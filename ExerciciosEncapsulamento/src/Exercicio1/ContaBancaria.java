//1 - Crie uma classe ContaBancaria com os atributos privados saldo e limite . Implemente um setter para o limite que não permita valores negativos. 
//O método sacar(double valor) deve permitir o saque apenas se o valor for menor ou igual à soma do saldo + limite.

package Exercicio1;

public class ContaBancaria {
	private double saldo;
	private double limite;
	
	//seter nao permite valor negativo
	public void setLimite(double limite) {
		
		if(limite < 0 ) {
			this.limite = 0;
		}else {
			this.limite = limite;
			
		}
	}
	
	public void sacar(double valor) {
		
		if(valor <= saldo + limite ) {
			this.saldo = this.saldo - valor;
		}else {
			System.out.println("Saldo Insuficiente");
		}
	}

	public double getSaldo() {
		return saldo;
	}
}
