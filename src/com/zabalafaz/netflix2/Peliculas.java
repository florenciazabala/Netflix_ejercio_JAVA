package com.zabalafaz.netflix2;

public class Peliculas extends Netflix implements IVisualizable{

public Peliculas(String titulo, String genero, String creador, double duracion, boolean visto, int año) {
		super(titulo, genero, creador, duracion, visto);
		this.año= año;
		
	}

//Atributos	
 private int año;
 double d;

 
//Getters y Setters 

public int getAño() {
	return año;
}

public void setAño(int año) {
	this.año = año;
}

//toString
@Override
public String toString() {
	String mensaje2= "Año: "+año+"";
	return super.toString()+mensaje2;
}

//Interfaz
@Override
public boolean marcarVisto() {
	super.visto=true;
	return super.visto;
}


double tiempo;
@Override
public double tiempoVisto (double tiempo) {
	this.tiempo= tiempo;
	return tiempo;
}
@Override
public String esVisto() {
	return "Pelicula: \nTitulo: "+getTitulo()+" \nGenero: "+getGenero()+" \nTiempo visto: "+tiempo+"";
	
}


 
}
