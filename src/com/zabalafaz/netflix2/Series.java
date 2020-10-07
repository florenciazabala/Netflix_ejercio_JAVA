package com.zabalafaz.netflix2;

public class Series extends Netflix implements IVisualizable{
public Series(String titulo, String genero, String creador, double duracion, boolean visto, int temporadas) {
		super(titulo, genero, creador, duracion, visto);
		this.temporadas= temporadas;
	}

//Atributos	
 private int temporadas;
 
 
//Getters y Setters
public int getTemporadas() {
	return temporadas;
}

public void setTemporadas(int temporadas) {
	if(temporadas>1) {
		this.temporadas = temporadas;
	}
	else {
		this.temporadas= 1;
	}
	
}

//toString

@Override
public String toString() {
	String mensaje2= "Temporadas: "+temporadas+"";
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
	return "Serie: \nTitulo: "+getTitulo()+" \nGenero: "+getGenero()+" \nTiempo visto: "+tiempo+"";
	
}
 

}
