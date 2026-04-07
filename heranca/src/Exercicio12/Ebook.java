package Exercicio12;

public class Ebook extends Livro {
    private double tamanhoArquivoMB;

    public Ebook(String titulo, String autor, double tamanhoArquivoMB) {
        super(titulo, autor);
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }

    public double getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    public void setTamanhoArquivoMB(double tamanhoArquivoMB) {
        this.tamanhoArquivoMB = tamanhoArquivoMB;
    }
}