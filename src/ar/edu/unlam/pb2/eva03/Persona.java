package ar.edu.unlam.pb2.eva03;

public class Persona {

	private String nombre;
	private int DNI;
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

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
