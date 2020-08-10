package com.greppiluciano.septimocirculo.model;

public class Editorial {

	private int cod_editorial;
	private String nombre;
	
	public Editorial() {
	
	}

	public Editorial(int cod_editorial, String nombre) {
		this.cod_editorial = cod_editorial;
		this.nombre = nombre;
	}

	public int getCod_editorial() {
		return cod_editorial;
	}

	public void setCod_editorial(int cod_editorial) {
		this.cod_editorial = cod_editorial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
