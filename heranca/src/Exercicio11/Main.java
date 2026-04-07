package Exercicio11;

public class Main {

	public static void main(String[] args) {
		Sobremesa s = new Sobremesa("Bolo de chocolate com morango", 58, true);
		
		System.out.println("Nome:" + s.getNome());
		System.out.println("Preco:" + s.getPreco());
		System.out.println("Contem Acucar:" + s.getContemAcucar());
		

	}

}
