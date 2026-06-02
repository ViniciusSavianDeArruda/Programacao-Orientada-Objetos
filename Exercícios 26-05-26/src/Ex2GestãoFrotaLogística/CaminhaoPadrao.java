package Ex2GestãoFrotaLogística;

public class CaminhaoPadrao extends Veiculo implements Rastreador {
	
	
	public CaminhaoPadrao(String placa,
			double capacidadeCarga) {

		super(placa, capacidadeCarga);
	}

	@Override
	public String obterLocalizacao() {
		return "BR-285";
	}

	@Override
	public void iniciarViagem() {

		System.out.println(
			"Caminhão padrão iniciou a viagem."
		);
	}
}

