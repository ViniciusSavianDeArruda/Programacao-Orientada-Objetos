//7 -Crie uma classe Termometro que armazena a temperatura em celsius . 
//Crie um getFahrenheit() que faz a conversão e um setFahrenheit(double f) que converte para Celsius antes de armazenar.
package Exercicio8;

public class Termometro {
	private double celsius;

    // retorna em Fahrenheit
    public double getFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    // recebe Fahrenheit e converte para Celsius
    public void setFahrenheit(double f) {
        this.celsius = (f - 32) * 5/9;
    }
}
