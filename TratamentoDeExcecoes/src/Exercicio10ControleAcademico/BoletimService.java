package Exercicio10ControleAcademico;

import java.sql.SQLException;

public class BoletimService {
	
	private BancoDados banco = new BancoDados();

    public void gerarBoletim(int matricula) throws AlunoNaoEncontradoException {

        try {

            String aluno = banco.buscarAluno(matricula);
            System.out.println("Gerando boletim para: " + aluno);

        } catch (SQLException e) {

            throw new AlunoNaoEncontradoException("Aluno não encontrado no sistema");
        }
    }

}
