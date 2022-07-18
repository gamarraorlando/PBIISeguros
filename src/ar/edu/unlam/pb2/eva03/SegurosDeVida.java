package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class SegurosDeVida  extends SegurosGenerales{
	private Boolean accidente;
	private Set<Persona> asegurados;
	public SegurosDeVida () {
		this.asegurados= new TreeSet<Persona>();
		this.accidente=false;
	}

	public void agregarBeneficiario(Persona hijo, TipoDeBeneficiario hijo2) {
	
		
	}

	public Integer obtenerCantidadDeBeneficiarios() {
	Integer cantidad=2;
 	
		return cantidad;
	}

	public Persona getAsegurado() {
		
		return null;
	}

	public Double getPremio() {
		
		return null;
	}

	@Override
	public Integer getGetNumeroDePoliza() {
	
		return this.numeroDePoliza;
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
