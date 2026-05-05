package Ex1_SistemaGestaoFrota;

public abstract class NaveEspacial {
	private String identificador;
	private double combustivelMax;
	private double combustivelAtual;
	private double velocidadeBase;
	
	public NaveEspacial(String identificador, double combustivelMax, double velocidadeBase) {
		this.identificador = identificador;
		this.combustivelMax = combustivelMax;
		this.combustivelAtual = combustivelMax;
		this.velocidadeBase = velocidadeBase;
		
	}
	
	
	// getters e setters
	
	public String getIdentificador() {
        return identificador;	
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public double getCombustivelMaximo() {
        return combustivelMax;
    }

    public void setCombustivelMaximo(double combustivelMaximo) {
        this.combustivelMax = combustivelMaximo;
    }

    public double getCombustivelAtual() {
        return combustivelAtual;
    }
    
    public void setCombustivelAtual(double combustivelAtual) {
    	if(combustivelAtual < 0 || combustivelAtual > combustivelMax) {
    		throw new CombustivelInvalidoException("Valor de combustível inválido!");
    	}
    	this.combustivelAtual = combustivelAtual;
    }
    
    public abstract double calcularConsumo(double distanciaEmAnosLuz);
    
    public void viajar(double distancia) throws CombustivelInsuficienteException {
        double consumo = calcularConsumo(distancia);

        if (combustivelAtual >= consumo) {
            combustivelAtual -= consumo;
            System.out.println("A nave " + identificador +
                    " viajou " + distancia +
                    " anos-luz. Combustível restante: " + combustivelAtual);
        } else {
            throw new CombustivelInsuficienteException("Combustível insuficiente para a viagem!");
        }
    }
    	
    }
    

