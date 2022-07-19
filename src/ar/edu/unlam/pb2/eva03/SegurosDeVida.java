package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class SegurosDeVida  extends SegurosGenerales{
	private Integer NUMERO_DE_POLIZA;
	private Persona asegurado;
	private  Double SUMA_ASEGURADA;
	private Double PRIMA;
	
	private Boolean robado;
	
	
	
	
	
	public SegurosDeVida(Integer NUMERO_DE_POLIZA, Persona  asegurado, Double  SUMA_ASEGURADA, Double   prima) {
		this.NUMERO_DE_POLIZA= NUMERO_DE_POLIZA;
		this.asegurado=asegurado;
		this.SUMA_ASEGURADA=SUMA_ASEGURADA;
		this.PRIMA=prima;
		
		
	}
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
		
		return this.asegurado;
	}

	public Double getPremio() {
		
		return this.PRIMA*1.21;
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
