package ar.edu.unlam.pb2.eva03;

import java.util.Set;
import java.util.TreeSet;

public class PolizaAccidentesPersonales extends SegurosDeVida {

	private Integer NUMERO_DE_POLIZA;
	private Persona asegudado;
	private Double SUMA_ASEGURADA;
	private Double PRIMA;
	private Set<Persona> beneficiario;

	public PolizaAccidentesPersonales(Integer nUMERO_DE_POLIZA, Persona asegurado, Double sUMA_ASEGURADA,
			Double pRIMA) {
		
	this.NUMERO_DE_POLIZA= nUMERO_DE_POLIZA;
	this.asegudado=asegurado;
	this.SUMA_ASEGURADA=sUMA_ASEGURADA;
	this.PRIMA=pRIMA;
	this.beneficiario= new TreeSet<>();
	
	}

	public Integer getNUMERO_DE_POLIZA() {
		return NUMERO_DE_POLIZA;
	}

	public void setNUMERO_DE_POLIZA(Integer nUMERO_DE_POLIZA) {
		NUMERO_DE_POLIZA = nUMERO_DE_POLIZA;
	}

	public Persona getAsegudado() {
		return  this.asegudado;
	}

	public void setAsegudado(Persona asegudado) {
		this.asegudado = asegudado;
	}

	public Double getSUMA_ASEGURADA() {
		return SUMA_ASEGURADA;
	}

	public void setSUMA_ASEGURADA(Double sUMA_ASEGURADA) {
		SUMA_ASEGURADA = sUMA_ASEGURADA;
	}

	public Double getPRIMA() {
		return PRIMA;
	}
	public Double getPremio() {
		return PRIMA*1.2;
	}
	

	public void setPRIMA(Double pRIMA) {
		PRIMA = pRIMA;
	}
	public void agregarBeneficiario(Persona beneficiario) {
		this.beneficiario.add(beneficiario);
	}
	

}

