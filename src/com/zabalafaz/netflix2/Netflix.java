package com.zabalafaz.netflix2;

public class Netflix {
//Atributos globales
	private String titulo;
	private String genero;
	private String creador;
	private double duracion;
	boolean visto;
	
	
	
//Metodo constructor 
	public Netflix(String titulo, String genero, String creador, double duracion, boolean visto) {
		this.titulo= titulo;
		this.genero= genero;
		this.creador= creador;
		this.duracion= duracion;
		this.visto= false;
	}
//Metodo constructor 2(sobreescritura)	
public Netflix(String titulo, String genero) {
	this.titulo=titulo;
	this.genero=genero;
}	
	
//Metodo toString
	public String toString() {
		String mensaje= "Titulo: "+titulo+"\n"+"Genero: "+genero+"\n"+"Creador: "+creador+"\n"+"Duracion: "+duracion+" minutos"+"\n";
		return mensaje;
	}
//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	
}
