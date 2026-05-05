package Ex1_SistemaGestaoFrota;

public class NaveCargueira extends NaveEspacial{
	private double pesoCargaAtual;
	private double capacidadeMaxCarga;
	
	public NaveCargueira(String identificador, double combustivelMax, double velocidadeBase, double capacidadeMaxCarga) {
		super(identificador, combustivelMax, velocidadeBase);
		this.capacidadeMaxCarga = capacidadeMaxCarga;
        this.pesoCargaAtual = 0; // começa vazio
		
	}
	
	public double getPesoCargaAtual() {
        return pesoCargaAtual;
    }

    public void setPesoCargaAtual(double pesoCargaAtual) {
        if (pesoCargaAtual > capacidadeMaxCarga) {
            throw new IllegalArgumentException("Carga excede capacidade!");
        }
        this.pesoCargaAtual = pesoCargaAtual;
    }

    public double getCapacidadeMaxCarga() {
        return capacidadeMaxCarga;
    }

    public void setCapacidadeMaxCarga(double capacidadeMaxCarga) {
        this.capacidadeMaxCarga = capacidadeMaxCarga;
    }

    @Override
    public double calcularConsumo(double distancia) {
        return (distancia * 0.5) + (pesoCargaAtual * 0.2);
    }
	
	
	

}
