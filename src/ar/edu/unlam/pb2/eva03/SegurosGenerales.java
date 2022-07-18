package ar.edu.unlam.pb2.eva03;

public abstract class SegurosGenerales {

	public Integer numeroDePoliza;
	private Auto bienAsegurado;
	

	public void agregarBienAsegurado(Auto auto) {
		this.bienAsegurado=auto;
		
	}


	public Auto getAuto() {
		
		return this.bienAsegurado;
	}

	public  abstract Persona getAsegurado() ;

	public abstract Double getPremio() ;
		
	
	

	public  abstract Integer getGetNumeroDePoliza() ;
		

	public Auto getBienAsegurado() {
		return bienAsegurado;
	}


	protected abstract boolean tuvoAlgunAccidente();


	protected abstract void denunciarAccidente();

}
