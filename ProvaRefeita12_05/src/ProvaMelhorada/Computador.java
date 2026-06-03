
package ProvaMelhorada;

public abstract class Computador {

	// erro anterior: atributos eram protected e podiam ser alterados diretamente
	// melhoria: encapsulamento com private
	private String modelo;
	private String numeroSerie;
	private double custoBase;
	private double custosAdicionais;

	public static final double LIMITE_MAXIMO = 15000;

	public Computador(String modelo, String numeroSerie, double custoBase)
			throws ViolacaoOrcamentariaException {

		// erro anterior: não havia validação de entrada
		// melhoria: validação de dados inválidos antes de criar objeto

		if (modelo == null || modelo.trim().isEmpty()) {
			throw new IllegalArgumentException("modelo inválido");
		}

		if (numeroSerie == null || numeroSerie.trim().isEmpty()) {
			throw new IllegalArgumentException("serie inválida");
		}

		if (custoBase < 0) {
			throw new ViolacaoOrcamentariaException("custo não pode ser negativo");
		}

		if (custoBase > LIMITE_MAXIMO) {
			throw new ViolacaoOrcamentariaException("limite excedido");
		}

		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.custoBase = custoBase;
		this.custosAdicionais = 0;
	}

	// melhoria: acesso controlado aos dados (encapsulamento correto)
	public String getModelo() {
		return modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	// erro anterior: lógica espalhada
	// melhoria: cálculo centralizado
	public double calcularCustoFinal() {
		return custoBase + custosAdicionais;
	}

	// erro anterior: subclasses alteravam custo diretamente
	// melhoria: método protegido controla alteração
	protected void adicionarCusto(double valor) {
		if (valor > 0) {
			custosAdicionais += valor;
		}
	}

	// polimorfismo: cada tipo implementa seu upgrade
	public abstract void aplicarUpgrade(int quantidade);

	@Override
	public String toString() {

		// melhoria: sobrescrita para exibir ficha técnica
		return "modelo: " + modelo +
				"\nserie: " + numeroSerie +
				"\ncusto base: " + custoBase +
				"\ncustos adicionais: " + custosAdicionais +
				"\ncusto final: " + calcularCustoFinal();
	}
}