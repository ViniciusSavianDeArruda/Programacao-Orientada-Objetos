package Exercicio12;

public class Main {

    public static void main(String[] args) {

        Ebook ebook = new Ebook("Java para Iniciantes", "Carlos Silva", 5.5);

        System.out.println("Título: " + ebook.getTitulo());
        System.out.println("Autor: " + ebook.getAutor());
        System.out.println("Tamanho (MB): " + ebook.getTamanhoArquivoMB());
    }
}