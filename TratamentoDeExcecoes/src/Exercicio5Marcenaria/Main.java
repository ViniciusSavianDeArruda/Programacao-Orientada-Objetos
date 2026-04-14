package Exercicio5Marcenaria;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        Marcenaria m = new Marcenaria();

        try {
            m.lerProjeto();

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());

        } finally {
            System.out.println("Limpando a bancada e desligando as máquinas...");
        }
    }
}