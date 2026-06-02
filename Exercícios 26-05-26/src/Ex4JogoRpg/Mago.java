package Ex4JogoRpg;

public class Mago extends Personagem implements Magico {

    public Mago(String nome, int pontosVida) {
        super(nome, pontosVida);
    }

    @Override
    public void atacar(Personagem alvo) throws AlvoInvalidoException {
        if (alvo.estaDerrotado()) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }

        System.out.println(getNome() + " atacou " + alvo.getNome());
        alvo.setPontosVida(alvo.getPontosVida() - 10);
    }

    @Override
    public void lancarFeitico(Personagem alvo) throws AlvoInvalidoException {
        if (alvo.estaDerrotado()) {
            throw new AlvoInvalidoException(alvo.getNome() + " já está fora de combate!");
        }

        System.out.println(getNome() + " lançou feitiço em " + alvo.getNome());
        alvo.setPontosVida(alvo.getPontosVida() - 25);
    }
}
