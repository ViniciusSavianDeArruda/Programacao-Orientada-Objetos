package Ex3SistemaFabrica;

public class InjetorPlastico extends MaquinaIndustrial {

    private double kgMateriaPrima = 0;

    public InjetorPlastico(String numeroSerie) {
        super(numeroSerie);
    }

    public void abastecerPlastico(double kg) {
        if (kg < 0) {
            throw new IllegalArgumentException("Quantidade inválida");
        }
        this.kgMateriaPrima += kg;
    }

    @Override
    public boolean produzirLote(int quantidade) throws Exception {

        if (!isLigada()) {
            throw new MaquinaDesligadaException("Máquina desligada");
        }

        double necessario = quantidade * 0.2;

        if (kgMateriaPrima < necessario) {
            throw new FaltaMateriaPrimaException("Sem matéria-prima");
        }

        kgMateriaPrima -= necessario;

        double energia = quantidade * 0.5;

        registrarProducao(quantidade, energia);

        System.out.println("Injetora produziu " + quantidade + " peças");

        return true;
    }
}