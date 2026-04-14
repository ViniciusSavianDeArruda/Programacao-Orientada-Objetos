//4. Catraca do estadio
//Crie uma classe Catraca com um método validarIngresso(int idadeTorcedor, boolean isSocio). 
//Se o torcedor não for sócio do Internacional e tiver menos de 18 anos sem acompanhante, utilize a palavra-chave throw para lançar uma 
//IllegalArgumentException com a mensagem: "Acesso negado: Menores não-sócios precisam de acompanhante." 
//Crie o main para testar a chamada capturando o erro. 

package Exercico4CatracaEstadio;

public class Catraca {

	public void validarIngresso(int IdadeTorcedor, boolean isSocio) {
		if(!isSocio && IdadeTorcedor < 18) {
			throw new IllegalArgumentException("Acesso negado: Menores não-sócios precisam de acompanhante");
		}else {
			System.out.println("Acesso liberado: maior de idade");
		}
		
	}
}
