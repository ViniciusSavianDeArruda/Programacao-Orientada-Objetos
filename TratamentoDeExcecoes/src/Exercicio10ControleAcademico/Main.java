package Exercicio10ControleAcademico;

public class Main {

	public static void main(String[] args) {
		 BoletimService service = new BoletimService();

	        try {

	            service.gerarBoletim(-1); 

	        } catch (AlunoNaoEncontradoException e) {

	            System.out.println("Mensagem para o usuário: " + e.getMessage());
	        }

	        System.out.println("Sistema finalizado");
	    }
	}

