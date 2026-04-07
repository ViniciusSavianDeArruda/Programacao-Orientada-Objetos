package Exercicio4;

public class Main {

	public static void main(String[] args) {
		
		Funcionario gerente = new Gerente();
		Funcionario vendedor = new Vendedor();
		
		
		System.out.println("Salario Gerente:"+ gerente.calcularSalario());
		System.out.println("Salario Vendedor:"+ vendedor.calcularSalario());
	}

}
