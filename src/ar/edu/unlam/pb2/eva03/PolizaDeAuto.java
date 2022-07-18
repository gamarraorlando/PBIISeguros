package ar.edu.unlam.pb2.eva03;

public class PolizaDeAuto extends SegurosGenerales {

	private final Integer NUMERO_DE_POLIZA;
	private Persona asegurado;
	private final  Double SUMA_ASEGURADA;
	private  final Double PRIMA;
	private Boolean accidente;
	private Boolean robado;

	public PolizaDeAuto(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		this.NUMERO_DE_POLIZA= nUMERO_DE_POLIZA;
		this.asegurado=asegurado;
		this.SUMA_ASEGURADA= sUMA_ASEGURADA;
		this.PRIMA=pRIMA; 
		this.accidente=false;
		this.robado=false;
		
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Integer getNUMERO_DE_POLIZA() {
		return NUMERO_DE_POLIZA;
	}

	public Double getSUMA_ASEGURADA() {
		return SUMA_ASEGURADA;
	}

	public Double getPRIMA() {
		return PRIMA;
	}

	@Override
	public Double getPremio() {
		
		return (this.PRIMA*1.21);
	}

	@Override
	public Integer getGetNumeroDePoliza() {
		
		return this.NUMERO_DE_POLIZA;
	}

	@Override
	protected boolean tuvoAlgunAccidente() {
		
		return this.accidente;
	}

	@Override
	protected void denunciarAccidente() {
		this.accidente=true;
		
	} 
	public Boolean fueRobado() {
		return tuvoAlgunAccidente();
	}

}
