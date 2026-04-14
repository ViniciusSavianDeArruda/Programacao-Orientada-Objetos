package Exercicio8TranscricaoPartituras;

public class Partitura {

    public void registrarAcorde(String acorde) throws AcordeInvalidoException {

        if (acorde == null || acorde.isEmpty()) {
            throw new AcordeInvalidoException("Acorde vazio!");
        }

        if (!acorde.matches(".*[CDEFGAB].*")) {
            throw new AcordeInvalidoException("Acorde inválido!");
        }

        System.out.println("Acorde registrado: " + acorde);
    }
}