package Ex5PlataformaStreaming;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<Midia> playlist = new ArrayList<>();

		playlist.add(new Musica("Bohemian Rhapsody", 354));
		playlist.add(new Filme("Interestelar", 10140));
		playlist.add(new Podcast("Tecnologia Hoje", 1800));

		for (Midia midia : playlist) {

			if (midia instanceof Baixavel) {

				try {

					((Baixavel) midia).realizarDownload(false);

				} catch (FalhaNoDownloadException e) {

					System.out.println(e.getMessage());

				}

			}

			midia.reproduzir();
			System.out.println();
		}
	}
}
