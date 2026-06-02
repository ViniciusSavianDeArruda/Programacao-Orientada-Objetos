package Ex2GestãoFrotaLogística;

public class Main {

	public static void main(String[] args) {

		CaminhaoPadrao caminhao = new CaminhaoPadrao("ABC-1234", 5000);

		VanRefrigerada van = new VanRefrigerada("XYZ-9876", 2000);

		System.out.println("Caminhão");

		caminhao.iniciarViagem();

		System.out.println(
			"Localização: " + caminhao.obterLocalizacao()
		);

		System.out.println("\nVan Refrigerada");

		van.iniciarViagem();

		System.out.println(
			"Localização: "
			+ van.obterLocalizacao()
		);

		try {

			van.ajustarTemperatura(15.0);

		} catch (TemperaturaCriticaException e) {

			System.out.println(
				"Erro: " + e.getMessage()
			);
		}

		try {

			van.ajustarTemperatura(2.0);

		} catch (TemperaturaCriticaException e) {

			System.out.println(
				"Erro: " + e.getMessage()
			);
		}
	}
}