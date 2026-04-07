package Exercicio3;

public class Carro extends Veiculo {
	
	public Carro(int velocidade) {
		super(velocidade);
	}
	
	public void acelerar(int valor) {
		velocidade += valor;
	}

}
