package ar.edu.unlam.pb2.eva03;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CompaniaDeSeguro {

	
	public   List<SegurosGenerales> polizasEmitidas;
	private String comapania;

	public CompaniaDeSeguro(String string) {
		this.comapania=string; 
		this.polizasEmitidas= new ArrayList<>();
	}

	public void agregarPoliza(PolizaAccidentesPersonales polizaAccidentesPersonales) {
		this.polizasEmitidas.add(polizaAccidentesPersonales);
		
	}

	public void agregarPoliza(PolizaDeAuto polizaDeAuto) {
		this.polizasEmitidas.add(polizaDeAuto);
		
	}

	public void agregarPoliza(PolizaCombinadoFamiliar polizaCombinadoFamiliar) {
		this.polizasEmitidas.add(polizaCombinadoFamiliar);
		
	}

	public void denunciarSiniestro(int i) throws PolizaInexistente {
		
		
		
		getPoliza(i).denunciarAccidente();
		
	}

	public SegurosGenerales getPoliza(Integer i) throws PolizaInexistente{
		Integer este= 8;
		if(obtenerLaCantidadDePolizasEmitidas()>=i) {
			return polizasEmitidas.get((i-1));
		}
		throw new PolizaInexistente("Poliza inexistente");
	}

	public Integer obtenerLaCantidadDePolizasEmitidas() {
		
		return this.polizasEmitidas.size();
	}
	

}
