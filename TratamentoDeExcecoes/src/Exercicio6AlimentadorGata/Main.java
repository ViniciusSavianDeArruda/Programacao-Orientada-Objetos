package Exercicio6AlimentadorGata;

public class Main {

	public static void main(String[] args) {
		
		AlimentadorPet alimentador = new AlimentadorPet();
		
		try {
			alimentador.liberarRacao(120);
		}catch(IllegalArgumentException e) {
            System.out.println("Erro de entrada: " + e.getMessage());

        } catch (IllegalStateException e) {
            System.out.println("Erro de estado: " + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    
	}

}
