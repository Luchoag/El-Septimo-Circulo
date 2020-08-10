package com.greppiluciano.septimocirculo.model;

public class Autor {

	private int cod_autor;
	private String nombre;
	
	public Autor () {
		
	}

	public Autor(int cod_autor, String nombre) {
		this.cod_autor = cod_autor;
		this.nombre = nombre;
	}

	public int getCod_autor() {
		return cod_autor;
	}

	public void setCod_autor(int cod_autor) {
		this.cod_autor = cod_autor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
