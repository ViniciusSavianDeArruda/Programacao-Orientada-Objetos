package Ex_3LojaVendas;

public class Alimento extends Produto{

	public Alimento(String descricao, double valorOriginal) {
		super(descricao, valorOriginal);
		
	}
	
	 	@Override
	    public double aplicarDesconto(double porcentagem) {

	        if (porcentagem < 0 || porcentagem > 50) {
	            throw new IllegalArgumentException("Desconto inválido");
	        }

	        return getValorOriginal() -
	               (getValorOriginal() * porcentagem / 100);
	    }
	
}
