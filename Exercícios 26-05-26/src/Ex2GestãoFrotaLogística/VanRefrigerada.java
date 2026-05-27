package Ex2GestãoFrotaLogística;

public class VanRefrigerada extends Veiculo implements Rastreador, Refrigerado {
	private double temperatura;

	public VanRefrigerada(String placa, double capacidadeCarga) {
		super(placa, capacidadeCarga);
	}

	@Override
	public String obterLocalizacao() {
		return "Centro de Distribuição";
	}

	@Override
	public void iniciarViagem() {

		System.out.println(
			"Van refrigerada iniciou a viagem."
		);
	}

	@Override
	public void ajustarTemperatura(double graus)
			throws TemperaturaCriticaException {

		if (graus > 10.0 || graus < -20.0) {

			throw new TemperaturaCriticaException(
				"Temperatura crítica! "
				+ "A carga pode ser comprometida."
			);
		}

		this.temperatura = graus;

		System.out.println(
			"Temperatura ajustada para " + graus + "°C"
		);
	
	}
}
