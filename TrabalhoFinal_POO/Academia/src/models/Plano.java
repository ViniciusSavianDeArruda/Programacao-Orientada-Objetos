package models;

import interfaces.Exibivel;

public abstract class Plano implements Exibivel {

    private String nomePlano;
    private double valorBase;

    public Plano(String nomePlano, double valorBase) {
        this.nomePlano = nomePlano;
        this.valorBase = valorBase;
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public double getValorBase() {
        return valorBase;
    }

    public abstract double calcularValor();

    @Override
    public void exibirInformacoes() {
        System.out.println(nomePlano + " - R$ " + calcularValor());
    }
}