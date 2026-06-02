package Ex4JogoRpg;

public abstract class Personagem {

    private String nome;
    private int pontosVida;

    public Personagem(String nome, int pontosVida) {
        this.nome = nome;
        setPontosVida(pontosVida);
    }

    public String getNome() {
        return nome;
    }

    public int getPontosVida() {
        return pontosVida;
    }

    public void setPontosVida(int pontosVida) {
        if (pontosVida < 0) {
            this.pontosVida = 0;
        } else {
            this.pontosVida = pontosVida;
        }
    }

    public boolean estaDerrotado() {
        return pontosVida == 0;
    }

    public abstract void atacar(Personagem alvo) throws AlvoInvalidoException;
}
