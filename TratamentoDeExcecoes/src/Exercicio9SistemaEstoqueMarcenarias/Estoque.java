package Exercicio9SistemaEstoqueMarcenarias;

public class Estoque {

    private double quantidadeMdf;
    private double quantidadeMacaudiba;

    public Estoque(double mdf, double macaudiba) {
        this.quantidadeMdf = mdf;
        this.quantidadeMacaudiba = macaudiba;
    }

    public void cortarPeca(String tipo, double metros) {

        if (tipo.equalsIgnoreCase("mdf")) {

            if (metros > quantidadeMdf) {
                throw new MadeiraInsuficienteException("MDF insuficiente no estoque!");
            }

            quantidadeMdf -= metros;
            System.out.println("Peça de MDF cortada: " + metros + "m");
        }

        else if (tipo.equalsIgnoreCase("macaudiba")) {

            if (metros > quantidadeMacaudiba) {
                throw new MadeiraInsuficienteException("Macaudiba insuficiente no estoque!");
            }

            quantidadeMacaudiba -= metros;
            System.out.println("Peça de Macaudiba cortada: " + metros + "m");
        }

        else {
            throw new IllegalArgumentException("Tipo de madeira inválido!");
        }
    }
}
