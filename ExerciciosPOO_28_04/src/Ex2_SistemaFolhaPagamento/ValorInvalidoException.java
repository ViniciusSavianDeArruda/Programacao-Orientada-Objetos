package Ex2_SistemaFolhaPagamento;

public class ValorInvalidoException extends RuntimeException {

    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }
}