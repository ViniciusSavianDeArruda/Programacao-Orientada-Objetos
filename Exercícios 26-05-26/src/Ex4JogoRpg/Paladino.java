package Ex4JogoRpg;

public class Paladino extends Personagem implements Curandeiro {

    public Paladino(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar(Personagem alvo) throws AlvoInvalidoException {
        if (alvo.estaDerrotado()) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }

        System.out.println(getNome() + " atacou " + alvo.getNome());
        alvo.setPontosVida(alvo.getPontosVida() - 15);
    }

    @Override
    public void curarAliado(Personagem aliado) throws AlvoInvalidoException {
        if (aliado.estaDerrotado()) {
            throw new AlvoInvalidoException(aliado.getNome() + " já está fora de combate!");
        }

        System.out.println(getNome() + " curou " + aliado.getNome());
        aliado.setPontosVida(aliado.getPontosVida() + 20);
    }
}
