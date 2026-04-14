package Exercicio10ControleAcademico;

public class AlunoNaoEncontradoException extends Exception {
	 public AlunoNaoEncontradoException(String mensagem) {
	        super(mensagem);
	    }
	 
	 public AlunoNaoEncontradoException(String mensagem, Throwable causa) {
	        super(mensagem, causa);
	    }

}
