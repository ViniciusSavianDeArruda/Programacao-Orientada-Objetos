package Ex3SistemaAcademico;

public class AlunoPosGraduacao extends MembroAcademico implements Pesquisador {

    public AlunoPosGraduacao(String nome, String matricula) {
        super(nome, matricula);
    }

    @Override
    public void mostrarFuncao() {
        System.out.println(getNome() + " é aluno de pós-graduação.");
    }

    @Override
    public void publicarArtigo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new DadosAcademicosInvalidosException("Título do artigo inválido!");
        }
        System.out.println(getNome() + " publicou o artigo: " + titulo);
    }
}
