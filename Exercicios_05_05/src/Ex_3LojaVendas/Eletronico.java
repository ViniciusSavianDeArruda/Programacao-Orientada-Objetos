package Ex_3LojaVendas;

public class Eletronico extends Produto implements Tributavel {
	
	 public Eletronico(String descricao, double valorOriginal) {
	        super(descricao, valorOriginal);
	    }
	 
	 	@Override
	    public double calcularImposto() {
	        return getValorOriginal() * 0.15;
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


