package com.greppiluciano.septimocirculo.model;

public class Libro {
	
	private int cod_libro;
	private String titulo;
	private int cod_autor;
	private int fecha_lanzamiento;
	private int cod_pais;
	private int cod_editorial;
	
	
	public Libro() {
		
	}
	
	public Libro(int cod_libro, String titulo, int cod_autor, int fecha_lanzamiento, int cod_pais, int cod_editorial) {
		super();
		this.cod_libro = cod_libro;
		this.titulo = titulo;
		this.cod_autor = cod_autor;
		this.fecha_lanzamiento = fecha_lanzamiento;
		this.cod_pais = cod_pais;
		this.cod_editorial = cod_editorial;
	}


	public int getCod_libro() {
		return cod_libro;
	}


	public void setCod_libro(int cod_libro) {
		this.cod_libro = cod_libro;
	}



	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getCod_autor() {
		return cod_autor;
	}


	public void setCod_autor(int cod_autor) {
		this.cod_autor = cod_autor;
	}


	public int getFecha_lanzamiento() {
		return fecha_lanzamiento;
	}


	public void setFecha_lanzamiento(int fecha_lanzamiento) {
		this.fecha_lanzamiento = fecha_lanzamiento;
	}


	public int getCod_pais() {
		return cod_pais;
	}


	public void setCod_pais(int cod_pais) {
		this.cod_pais = cod_pais;
	}


	public int getCod_editorial() {
		return cod_editorial;
	}


	public void setCod_editorial(int cod_editorial) {
		this.cod_editorial = cod_editorial;
	}
	
	
	
}
