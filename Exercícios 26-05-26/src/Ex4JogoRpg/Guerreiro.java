package Ex4JogoRpg;

public class Guerreiro extends Personagem {

	public Guerreiro(String nome, int pontosVida) {
		super(nome, pontosVida);
	}

	@Override
	public void atacar(Personagem alvo) throws AlvoInvalidoException {
		if (alvo.estaDerrotado()) {
			throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
		}

		System.out.println(getNome() + " atacou " + alvo.getNome());
		alvo.setPontosVida(alvo.getPontosVida() - 20);
	}
}
