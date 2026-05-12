package Ex_1SistemaVoos;

public class Voo {
	private String numeroDoVoo;
	private String destino;
	private boolean[] assentos = new boolean[100];
	
	
	public Voo(String numeroDoVoo, String destino) {
		this.numeroDoVoo = numeroDoVoo;
		this.destino = destino;
	}
	
	public String getNumeroDoVoo() {
		return numeroDoVoo;
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void reservarAssento(int numeroAssentos) throws AssentoOcupadoException{
		if(numeroAssentos < 1 || numeroAssentos > 100) {
			throw new IllegalArgumentException("Numero de assentos invalido");
			
		}
		
		int i = numeroAssentos -1;
		
		if(assentos[i]) {
			 throw new AssentoOcupadoException("Assento ocupado");
		}
		
		assentos[i] = true;
	}
	
}
