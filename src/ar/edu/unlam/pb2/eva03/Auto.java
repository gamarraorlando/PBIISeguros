package ar.edu.unlam.pb2.eva03;

public class Auto {

	private String marca;
	private String modelo;
	private int ano;
	private Double SUMA_ASEGURADA;

	public Auto(String string, String string2, int i, Double sUMA_ASEGURADA) {
		this.marca=string;
		this.modelo=string2;
		this.ano=i;
		this.SUMA_ASEGURADA=sUMA_ASEGURADA;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Double getSUMA_ASEGURADA() {
		return SUMA_ASEGURADA;
	}
	

}
