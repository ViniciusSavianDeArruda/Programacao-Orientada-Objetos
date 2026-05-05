package Ex2_SistemaFolhaPagamento;

public class Administrativo extends FuncionarioHospitalar {

    private String departamento;
    private boolean cargoDeGestao;

    public Administrativo(String nome, String matricula, double salarioBase,
                          String departamento, boolean cargoDeGestao) {
        super(nome, matricula, salarioBase);
        this.departamento = departamento;
        this.cargoDeGestao = cargoDeGestao;
    }

    @Override
    public double calcularSalarioFinal() {
        if (cargoDeGestao) {
            return getSalarioBase() + 1500;
        }
        return getSalarioBase();
    }
}