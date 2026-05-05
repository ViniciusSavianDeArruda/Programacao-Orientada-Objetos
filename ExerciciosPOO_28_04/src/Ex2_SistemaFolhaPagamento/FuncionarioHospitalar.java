package Ex2_SistemaFolhaPagamento;

public abstract class FuncionarioHospitalar {

    private String nome;
    private String matricula;
    private double salarioBase;
    private int horasTrabalhadasMensais;

    public FuncionarioHospitalar(String nome, String matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
        this.horasTrabalhadasMensais = 0;
    }

    public String getNome() { return nome; }
    public String getMatricula() { return matricula; }
    public double getSalarioBase() { return salarioBase; }
    public int getHorasTrabalhadasMensais() { return horasTrabalhadasMensais; }

    public void setNome(String nome) { this.nome = nome; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 1412.0) {
            throw new ValorInvalidoException("Salário base não pode ser inferior ao mínimo legal.");
        }
        this.salarioBase = salarioBase;
    }

    public void setHorasTrabalhadasMensais(int horas) {
        if (horas < 0 || horas > 300) {
            throw new ValorInvalidoException("Carga horária inválida. O limite humano é 300 horas.");
        }
        this.horasTrabalhadasMensais = horas;
    }

    public abstract double calcularSalarioFinal();

    public void exibirResumoMensal() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Horas: " + horasTrabalhadasMensais);
        System.out.println("Salário final: " + calcularSalarioFinal());
    }
}