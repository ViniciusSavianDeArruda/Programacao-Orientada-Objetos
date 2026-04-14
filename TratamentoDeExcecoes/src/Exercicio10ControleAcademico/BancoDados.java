package Exercicio10ControleAcademico;
import java.sql.SQLException;

public class BancoDados {
	 public String buscarAluno(int matricula) throws SQLException {
		 
	        if (matricula <= 0) {
	            throw new SQLException("Falha ao acessar banco de dados");
	        }

	        return "Aluno Matricula " + matricula;
	    }

}
