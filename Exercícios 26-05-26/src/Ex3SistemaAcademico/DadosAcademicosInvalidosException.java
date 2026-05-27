package Ex3SistemaAcademico;

public class DadosAcademicosInvalidosException extends RuntimeException {
    public DadosAcademicosInvalidosException(String mensagem) {
        super(mensagem);
    }
}