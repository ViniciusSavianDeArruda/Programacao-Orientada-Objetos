package Ex1SistemaEcommerce;

public interface Avaliavel {
    
    default void adicionarAvaliacao(int nota) throws NotaInvalidaException {
        if(nota < 1 || nota > 5) {
            throw new NotaInvalidaException("A nota deve ser entre 1 e 5.");
        }
        System.out.println("Nota avaliada: " + nota);
    }
}