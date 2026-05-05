package Ex2_SistemaFolhaPagamento;

public class Medico extends FuncionarioHospitalar {

    private String especialidade;
    private double valorPorPlantao;
    private int quantidadePlantoes;

    public Medico(String nome, String matricula, double salarioBase,
                  String especialidade, double valorPorPlantao, int quantidadePlantoes) {
        super(nome, matricula, salarioBase);
        this.especialidade = especialidade;
        this.valorPorPlantao = valorPorPlantao;
        this.quantidadePlantoes = quantidadePlantoes;
    }

    public void setQuantidadePlantoes(int q) {
        if (q < 0) {
            throw new ValorInvalidoException("Plantões não podem ser negativos.");
        }
        this.quantidadePlantoes = q;
    }

    @Override
    public double calcularSalarioFinal() {
        return getSalarioBase() + (valorPorPlantao * quantidadePlantoes);
    }
}