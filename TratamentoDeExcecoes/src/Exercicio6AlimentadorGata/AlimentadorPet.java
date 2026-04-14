// 6. O Alimentador da gata
//Crie uma classe AlimentadorPet com o método liberarRacao(int quantidadeGramas). A capacidade máxima da tigela da gata é de 100 gramas. 
//Se o sistema tentar liberar uma quantidade negativa, lance IllegalArgumentException. Se tentar liberar mais de 100 gramas, lance IllegalStateException ("A tigela vai transbordar!"). 
//Trate ambas as exceções no main usando blocos catch separados. 

package Exercicio6AlimentadorGata;

public class AlimentadorPet {
	
	
	public void liberarRacao(int quantidadeGramas) {
		if(quantidadeGramas < 0) {
			throw new IllegalArgumentException("Quantidade inválida: não pode ser negativa!");
		}
		
		if(quantidadeGramas > 100) {
			throw new IllegalStateException("A tigela vai transbordar!");
		}
		
		 System.out.println("Ração liberada com sucesso!");
	}

}
