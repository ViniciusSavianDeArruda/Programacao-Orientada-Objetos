//8 - Crie uma classe Triangulo com três lados privados. 
//O setter de cada lado deve validar a "Desigualdade Triangular" (a soma de dois lados deve ser sempre maior que o terceiro).
//Se a alteração de um lado invalidar o triângulo, a operação deve ser cancelada.

package Exercicio9;
public class Triangulo {

    private double lado1;
    private double lado2;
    private double lado3;

    // GETTERS
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // SETTERS
    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // MÉTODO PARA MOSTRAR OS VALORES
    public void mostrar() {
        System.out.println("Lado 1: " + lado1);
        System.out.println("Lado 2: " + lado2);
        System.out.println("Lado 3: " + lado3);
    }
}