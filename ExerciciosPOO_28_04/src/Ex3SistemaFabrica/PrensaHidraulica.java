package Ex3SistemaFabrica;

public class PrensaHidraulica extends MaquinaIndustrial {

    private double temperaturaAtual = 25.0;

    public PrensaHidraulica(String numeroSerie) {
        super(numeroSerie);
    }

    public void acionarRefrigeracao() {
        temperaturaAtual = 25.0;
    }

    @Override
    public boolean produzirLote(int quantidade) throws Exception {

        if (!isLigada()) {
            throw new MaquinaDesligadaException("Máquina desligada");
        }

        if (temperaturaAtual >= 90.0) {
            throw new SuperaquecimentoException("Máquina superaquecida");
        }

        double energia = quantidade * 2.0;

        temperaturaAtual += quantidade * 1.5;

        registrarProducao(quantidade, energia);

        System.out.println("Prensa produziu " + quantidade + " peças");

        return true;
    }
}