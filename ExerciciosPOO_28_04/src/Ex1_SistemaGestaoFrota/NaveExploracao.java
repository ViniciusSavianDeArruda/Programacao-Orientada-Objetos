package Ex1_SistemaGestaoFrota;

public class NaveExploracao extends NaveEspacial {

    private boolean possuiSensoresAvancados;

    public NaveExploracao(String identificador, double combustivelMax, double velocidadeBase,
                          boolean possuiSensoresAvancados) {
        super(identificador, combustivelMax, velocidadeBase);
        this.possuiSensoresAvancados = possuiSensoresAvancados;
    }

    public boolean isPossuiSensoresAvancados() {
        return possuiSensoresAvancados;
    }

    public void setPossuiSensoresAvancados(boolean possuiSensoresAvancados) {
        this.possuiSensoresAvancados = possuiSensoresAvancados;
    }

    @Override
    public double calcularConsumo(double distancia) {
        double consumo = distancia * 0.3;

        if (possuiSensoresAvancados) {
            consumo += 50.0;
        }

        return consumo;
    }
}