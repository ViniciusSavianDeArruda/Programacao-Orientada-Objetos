package ProvaMelhorada;

// melhoria: criação de exceção específica para regra de negócio
// antes não existia tratamento separado para violação orçamentária

public class ViolacaoOrcamentariaException extends Exception {

	public ViolacaoOrcamentariaException(String mensagem) {
		super(mensagem);
	}
}