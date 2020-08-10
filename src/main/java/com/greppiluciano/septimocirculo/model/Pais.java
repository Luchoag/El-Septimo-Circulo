package com.greppiluciano.septimocirculo.model;

public class Pais {

	private int cod_pais;
	private String nombre;
	
	public Pais() {
		
	}

	public Pais(int cod_pais, String nombre) {
		this.cod_pais = cod_pais;
		this.nombre = nombre;
	}

	public int getCod_pais() {
		return cod_pais;
	}

	public void setCod_pais(int cod_pais) {
		this.cod_pais = cod_pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
