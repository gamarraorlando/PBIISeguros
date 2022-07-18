package ar.edu.unlam.pb2.eva03;

public class PolizaCombinadoFamiliar  extends SegurosGenerales{

	private final  Integer NUMERO_DE_POLIZA;

	private Persona asegurado;

	private  final Double SUMA_ASEGURADA;

	private final Double PRIMA;
	private Boolean accidente;

	public PolizaCombinadoFamiliar(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA, Double pRIMA) {
		this.NUMERO_DE_POLIZA=nUMERO_DE_POLIZA;
		this.asegurado=asegurado;
		this.SUMA_ASEGURADA=sUMA_ASEGURADA;
		this.PRIMA=pRIMA;
		this.accidente=false;
	}

	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
		// TODO Auto-generated method stub
		
	}

	public void agregarBienAsegurado(Vivienda casa) {
		// TODO Auto-generated method stub
		
	}

	public Object obtenerCantidadDeBeneficiario() {
		// TODO Auto-generated method stub
		return null;
	}

	public Persona getAsegurado() {
		
		return this.asegurado;
	}

	public Double getPremio() {
		
		return (this.PRIMA* 1.21);
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

}
