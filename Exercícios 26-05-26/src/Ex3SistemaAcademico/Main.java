package Ex3SistemaAcademico;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MembroAcademico> membros = new ArrayList<>();

        membros.add(new Professor("Carlos", "P001"));
        membros.add(new AlunoPosGraduacao("Ana", "A001"));

        for (MembroAcademico m : membros) {

            m.mostrarFuncao();

            if (m instanceof Pesquisador) {
                try {
                    ((Pesquisador) m).publicarArtigo(""); 
                } catch (DadosAcademicosInvalidosException e) {
                    System.out.println("Erro ao publicar artigo: " + e.getMessage());
                }
            }

            if (m instanceof Avaliador) {
                try {
                    ((Avaliador) m).lancarNotas(11.0); 
                } catch (DadosAcademicosInvalidosException e) {
                    System.out.println("Erro ao lançar nota: " + e.getMessage());
                }
            }
        }
    }
}
