package models;

public class PlanoMensal extends Plano {

    public PlanoMensal() {
        super("Mensal", 120);
    }

    @Override
    public double calcularValor() {
        return getValorBase();
    }
}