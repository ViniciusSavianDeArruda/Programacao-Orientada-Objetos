package Ex3SistemaAcademico;

public class Professor extends MembroAcademico implements Pesquisador, Avaliador {

    public Professor(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void mostrarFuncao() {
        System.out.println(getNome() + " é professor.");
    }

    @Override
    public void publicarArtigo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new DadosAcademicosInvalidosException("Título do artigo inválido!");
        }
        System.out.println(getNome() + " publicou o artigo: " + titulo);
    }

    @Override
    public void lancarNotas(double nota) {
        if (nota < 0 || nota > 10) {
            throw new DadosAcademicosInvalidosException("Nota inválida: " + nota);
        }
        System.out.println(getNome() + " lançou a nota: " + nota);
    }
}
