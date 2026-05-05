package Ex3SistemaFabrica;

public class BracoRoboticoMontagem extends MaquinaIndustrial {

    private double percentualCalibracao = 100.0;

    public BracoRoboticoMontagem(String numeroSerie) {
        super(numeroSerie);
    }

    public void recalibrar() {
        percentualCalibracao = 100.0;
    }

    @Override
    public boolean produzirLote(int quantidade) throws Exception {

        if (!isLigada()) {
            throw new MaquinaDesligadaException("Máquina desligada");
        }

        if (percentualCalibracao < 20.0) {
            throw new EquipamentoDescalibradoException("Baixa calibração");
        }

        double energia = 15.0;

        percentualCalibracao -= quantidade * 0.5;
        if (percentualCalibracao < 0) percentualCalibracao = 0;

        registrarProducao(quantidade, energia);

        System.out.println("Robô produziu lote de " + quantidade);

        return true;
    }
}