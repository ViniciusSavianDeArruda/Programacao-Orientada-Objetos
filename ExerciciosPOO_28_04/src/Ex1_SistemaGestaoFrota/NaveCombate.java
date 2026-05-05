package Ex1_SistemaGestaoFrota;

public class NaveCombate extends NaveEspacial {

    private int numeroArmas;
    private boolean escudoAtivado;

    public NaveCombate(String identificador, double combustivelMax, double velocidadeBase,
                       int numeroArmas, boolean escudoAtivado) {
        super(identificador, combustivelMax, velocidadeBase);
        this.numeroArmas = numeroArmas;
        this.escudoAtivado = escudoAtivado;
    }

    public int getNumeroArmas() {
        return numeroArmas;
    }

    public void setNumeroArmas(int numeroArmas) {
        this.numeroArmas = numeroArmas;
    }

    public boolean isEscudoAtivado() {
        return escudoAtivado;
    }

    public void setEscudoAtivado(boolean escudoAtivado) {
        this.escudoAtivado = escudoAtivado;
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia * 0.8;

        if (escudoAtivado) {
            consumo *= 1.15; 
        }

        return consumo;
    }
}