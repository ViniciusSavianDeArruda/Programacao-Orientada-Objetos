package ProvaMelhorada;

public class Notebook extends Computador {

	private static final double CUSTO_BATERIA = 500;

	public Notebook(String modelo, String numeroSerie, double custoBase)
			throws ViolacaoOrcamentariaException {
		super(modelo, numeroSerie, custoBase);
	}

	@Override
	public void aplicarUpgrade(int quantidade) {

		// erro anterior: podia aceitar valor negativo
		// melhoria: validação para evitar regra inválida de negócio

		if (quantidade > 0 && quantidade <= 100) {
			adicionarCusto(quantidade * CUSTO_BATERIA);
		}
	}

	@Override
	public String toString() {
		return "notebook\n" + super.toString();
	}
}