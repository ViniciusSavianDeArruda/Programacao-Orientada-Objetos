package Ex5PlataformaStreaming;

public abstract class Midia {

	private String titulo;
	private int duracaoSegundos;

	public Midia(String titulo, int duracaoSegundos) {
		this.titulo = titulo;
		this.duracaoSegundos = duracaoSegundos;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public abstract void reproduzir();

}
