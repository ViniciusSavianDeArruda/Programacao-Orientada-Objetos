package Ex_2Restaurante;

public class Pedido {
	private ItemCardapio[]itens;
	private int quantidade;
	
	public Pedido() {
		itens = new ItemCardapio[10];
		quantidade = 0;
	}
	
	public void adicionarItem(ItemCardapio item) {
		if(quantidade < itens.length) {
			itens[quantidade] = item;
			quantidade ++;
		}else {
			System.out.println("Pedido Cheio");
		}
	}
	
	public double fecharConta() {
		double total = 0;
		
		for (int i = 0; i < quantidade; i++) {
			total += itens[i].calcularPrecoFinal();
			
		}
	
		return total;

	}

}
