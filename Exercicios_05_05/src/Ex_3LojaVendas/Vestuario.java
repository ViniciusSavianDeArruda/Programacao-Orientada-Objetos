package Ex_3LojaVendas;

public class Vestuario extends Produto implements Tributavel {
	
	public Vestuario(String descricao, double valorOriginal) {
        super(descricao, valorOriginal);
    }
	
	 	@Override
	    public double calcularImposto() {
	        return getValorOriginal() * 0.05;
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
