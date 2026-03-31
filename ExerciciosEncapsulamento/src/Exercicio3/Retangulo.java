//3 - Crie uma classe Retangulo com largura e altura privados. Crie um método getArea() que calcula o valor no momento da chamada.
package Exercicio3;

public class Retangulo {
	private double largura;
	private double altura;
	
	public double getArea() {
		return largura * altura;
	}
	//metodo set de largura e altura
	public void setLargura(double largura) {
		if(largura > 0) {
			this.largura = largura;
		}
	}
		
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}

}
