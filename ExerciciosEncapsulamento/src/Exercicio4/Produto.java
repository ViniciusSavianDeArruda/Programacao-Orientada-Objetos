//4 - Na classe Produto , o atributo quantidadeEmEstoque deve ser privado. 
//Crie métodos adicionarEstoque(int qtd) e removerEstoque(int qtd) . O método de remoção não pode deixar o estoque ficar negativo.

package Exercicio4;

public class Produto {
	private int quantidadeEmEstoque;
	
	public void adicionarEstoque(int qtd) {
		if(qtd > 0) {
			this.quantidadeEmEstoque = this.quantidadeEmEstoque + qtd;
			
		}
		
	}
	
	public void removerEstoque(int qtd) {
		if(qtd > 0 && quantidadeEmEstoque >= qtd) {
			this.quantidadeEmEstoque = this.quantidadeEmEstoque - qtd;
		}
	}
	
	//metodo get = pegar algo
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
}
