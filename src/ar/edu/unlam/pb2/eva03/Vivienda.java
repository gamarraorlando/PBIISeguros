package ar.edu.unlam.pb2.eva03;

public class Vivienda {

	private String calle;
	private String localidad;
	private String partido;
	private String provincia;

	public Vivienda(String string, String string2, String string3, String string4) {
		this.calle= string;
		this.localidad= string2;
		this.partido=string3;
		this.provincia=string4;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	} 

}
