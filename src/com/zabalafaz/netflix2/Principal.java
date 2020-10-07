package com.zabalafaz.netflix2;
//Importacion interfaz list
import java.util.ArrayList;
public class Principal {
	public static void main(String[] args) {
		
		try {  
			ArrayList<Peliculas>pelicula= new ArrayList<Peliculas>();
		    pelicula.add(new Peliculas("Lo que el viento se llevo","Romance/Belico", "Victor Fleming", 238, false, 1939));
		    pelicula.add(new Peliculas("Blade Runner", "Ciencia ficcion", "Ridley Scott", 120, false, 1982));
		    pelicula.get(1).marcarVisto();
		    pelicula.get(1).esVisto();
		    pelicula.get(1).tiempoVisto(5.2);
		    pelicula.add(new Peliculas("2001: Odisea en el espacio", "Ciencia ficcion", "Stanley Kubric", 160, false, 1968));
		    pelicula.get(2).marcarVisto();
		    pelicula.get(2).esVisto();
		    pelicula.get(2).tiempoVisto(3.4);
		    pelicula.add(new Peliculas("Pulp fiction", "Crimen/ Comedia", "Quentin Tarantino", 178, false, 1994));
		    pelicula.add(new Peliculas("Pacto siniestro", "Suspenso", "Alfred Hitchcock", 103, false, 1951));
		    
		    ArrayList<Series>serie= new ArrayList<Series>();
		    serie.add(new Series("Star treck", "ciencia Ficcion", "Gene Roddenberry", 60, false, 6));
		    serie.add(new Series("It crowd", "Comedia", "Graham Linehan", 45, false, 4));
		    serie.get(1).marcarVisto();
		    serie.get(1).tiempoVisto(3.6);
		    serie.add(new Series("Cosmos", "Documental", "Carl Sagan", 45, false, 1));
		    serie.add(new Series("Stranger Things", "Misterio", "Matt Duffer", 30, false, 3));
		    serie.add(new Series("Dark", "Suspenso", "Baran do Odar", 40, false, 3));
		    serie.get(4).marcarVisto();
		    serie.get(4).tiempoVisto(12.4);
		    
		    
		 
		  System.out.println("LISTADO DE PELICULAS DISPONIBLES");
			   for (int i = 0;i<5;i++) {
			    	System.out.println("*"+pelicula.get(i).getTitulo());
			    }
		  System.out.println("\n");
		  System.out.println("LISTADO DE SERIES DIPONIBLES");
			    for(int j=0; j<5; j++) {
			    	System.out.println("*"+serie.get(j).getTitulo());
			   }
			    
			System.out.println("\n");
			System.out.println("PELICULAS Y SERIES VISUALIZADAS");
			for (int i=0;i<5;i++) {
				if (pelicula.get(i).visto==true){
					System.out.println(pelicula.get(i).esVisto());
					} 
			}
		    System.out.println("\n");
		    for (int j=0;j<5;j++) {
				if (serie.get(j).visto==true){
					System.out.println(serie.get(j).esVisto());
					}
			}
		    System.out.println("\n");
		   
		    int temporada= 0;
		    int estreno= 0;
	        int serieTemporada= 0;
	        int peliculaEstreno= 0;
	        
	        for (int k=0;k<5;k++) {
	        	if (pelicula.get(k).getAño()>estreno) {
	        	estreno = pelicula.get(k).getAño();
	        	peliculaEstreno = k;
	        	}
	        	
	        	if (serie.get(k).getTemporadas()>temporada) {
	        		temporada = serie.get(k).getTemporadas();
	        		serieTemporada = k;
	        	}
	        }
		    System.out.println("SERIE CON MAS TEMPORADAS:");
		    System.out.println(serie.get(serieTemporada).toString());
		    System.out.println("\n");
		    System.out.println("PELICULAS MAS RECIENTE:");
		    System.out.println(pelicula.get(peliculaEstreno).toString());
			
		} catch (IndexOutOfBoundsException arrayE) { 
			System.out.println("Estas intentado accesar a una localidad que no esta definida");
		} catch (NullPointerException arrayF) {
			System.out.println("Existe alguna variable que no fue inicializada");
		}catch (Exception E) { 
			System.out.println("Ocurrio algun error");
			E.printStackTrace(); 
		}finally {
			System.out.println("\n"+"Esperamos que disfrute la seleccion de series y peliculas que hemos creado para usted!");
		}
		
	}
}	

	
	
 
 


