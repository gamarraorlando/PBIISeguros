package ar.edu.unlam.pb2.eva03;

import java.util.Comparator;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private Integer DNI;
	private int edad;

	public Persona(String string, int i, int j) {
		this.nombre= string;
		this.DNI=i;
		this.edad=j;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + DNI;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (DNI != other.DNI)
			return false;
		return true;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Persona o) {
		
		return this.DNI.compareTo(o.DNI);
	}



	

}
