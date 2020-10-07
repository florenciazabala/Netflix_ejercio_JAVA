package com.zabalafaz.netflix2;

public class Peliculas extends Netflix implements IVisualizable{

public Peliculas(String titulo, String genero, String creador, double duracion, boolean visto, int a�o) {
		super(titulo, genero, creador, duracion, visto);
		this.a�o= a�o;
		
	}

//Atributos	
 private int a�o;
 double d;

 
//Getters y Setters 

public int getA�o() {
	return a�o;
}

public void setA�o(int a�o) {
	this.a�o = a�o;
}

//toString
@Override
public String toString() {
	String mensaje2= "A�o: "+a�o+"";
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
