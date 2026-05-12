package Ex_3LojaVendas;

public abstract class Produto {

    private String descricao;
    private double valorOriginal;

    public Produto(String descricao, double valorOriginal) {
        this.descricao = descricao;
        this.valorOriginal = valorOriginal;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public abstract double aplicarDesconto(double porcentagem);
}