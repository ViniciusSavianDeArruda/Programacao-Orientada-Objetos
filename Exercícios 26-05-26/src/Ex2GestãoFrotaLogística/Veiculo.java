package Ex2GestãoFrotaLogística;

public abstract class Veiculo {
	private String placa;
	private double capacidadeCarga;
	
	public Veiculo(String placa, double capacidadeCarga) {
		super();
		this.placa = placa;
		this.capacidadeCarga = capacidadeCarga;
	}

	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	protected void registrarManutencao() {
		System.out.println("Registrando Manutencao da placa:" + placa);
		
	}
	
public abstract void iniciarViagem();	
}
