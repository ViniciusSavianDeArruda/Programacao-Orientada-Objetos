package Exercicio8TranscricaoPartituras;

public class Main {

    public static void main(String[] args) {

        Partitura p = new Partitura();

        try {
            p.registrarAcorde("H#"); 

        } catch (AcordeInvalidoException e) {
            System.out.println("Erro na partitura: " + e.getMessage());
        }

        System.out.println("Fim do programa");
    }
}