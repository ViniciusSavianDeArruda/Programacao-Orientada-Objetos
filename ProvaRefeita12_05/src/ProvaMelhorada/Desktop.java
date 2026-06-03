package ProvaMelhorada;

public class Desktop extends Computador {

	private static final double CUSTO_RAM = 300;

	public Desktop(String modelo, String numeroSerie, double custoBase)
			throws ViolacaoOrcamentariaException {
		super(modelo, numeroSerie, custoBase);
	}

	@Override
	public void aplicarUpgrade(int quantidade) {

		// erro anterior: não havia validação de entrada
		// melhoria: evita valores inválidos ou negativos

		if (quantidade > 0 && quantidade <= 100) {
			adicionarCusto(quantidade * CUSTO_RAM);
		}
	}

	@Override
	public String toString() {
		return "desktop\n" + super.toString();
	}
}