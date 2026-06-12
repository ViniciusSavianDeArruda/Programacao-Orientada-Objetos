package models;

public class PlanoTrimestral extends Plano {

    public PlanoTrimestral() {
        super("Trimestral", 120);
    }

    @Override
    public double calcularValor() {
        return getValorBase() * 0.9;
    }
}