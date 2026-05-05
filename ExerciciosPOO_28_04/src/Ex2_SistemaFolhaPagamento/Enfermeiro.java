package Ex2_SistemaFolhaPagamento;

public class Enfermeiro extends FuncionarioHospitalar {

    private String setor;
    private double percentualInsalubridade;

    public Enfermeiro(String nome, String matricula, double salarioBase, String setor) {
        super(nome, matricula, salarioBase);
        this.setor = setor;
    }

    public void setPercentualInsalubridade(double p) {
        if (p != 0.10 && p != 0.20 && p != 0.40) {
            throw new ValorInvalidoException("Percentual de insalubridade não reconhecido pelo sindicato.");
        }
        this.percentualInsalubridade = p;
    }

    @Override
    public double calcularSalarioFinal() {

        double bonus = getSalarioBase() * percentualInsalubridade;

        int extras = getHorasTrabalhadasMensais() - 160;
        double horasExtra = 0;

        if (extras > 0) {
            horasExtra = extras * 50;
        }

        return getSalarioBase() + bonus + horasExtra;
    }
}
