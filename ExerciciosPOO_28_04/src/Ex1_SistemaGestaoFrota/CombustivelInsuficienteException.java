package Ex1_SistemaGestaoFrota;

public class CombustivelInsuficienteException extends Exception {

    public CombustivelInsuficienteException(String mensagem) {
        super(mensagem);
    }
}