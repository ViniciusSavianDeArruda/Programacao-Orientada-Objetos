package models;

public class PlanoAnual extends Plano {

    public PlanoAnual() {
        super("Anual", 120);
    }

    @Override
    public double calcularValor() {
        return getValorBase() * 0.75;
    }
}