package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import ejercicios.Pg12ejercicio4.Libro;

public class Pg12ejercicio5 {

	public static void main(String[] args) {
		Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);

        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        
        Collections.sort(libros, new comparadorAutor()); //asi se hace la ordenacion, libros y una instancia que usa el metodo de comparacion.
        imprimir(libros);
        Collections.sort(libros, new comparadorTitulo());
        imprimir(libros);
	}
	//nueva clase comparator para crear un metodo que compare por autor.
	public static class comparadorAutor implements Comparator<Libro> {
		
		public int compare(Libro L1, Libro L2) { //se crea el metodo con el criterio de comparacion
		if (L1.getAutor().compareTo(L2.getAutor())==0)
			return L1.getTitulo().compareTo(L2.getTitulo());
		else 
			return L1.getTitulo().compareTo(L2.getTitulo());
	}
}	
	//nueva clase comparator para crear un metodo que compare por titulo.
	public static class comparadorTitulo implements Comparator<Libro> {
		
		public int compare(Libro L1, Libro L2) {
			return L1.getTitulo().compareTo(L2.getTitulo());
		}
	}
	
	private static void imprimir(ArrayList<Libro> libro) {
    	for(Libro L : libro) {System.out.println(L);}
	}	
	
public static class Libro {
	private String titulo;
	private String autor;
	private int anyo;


	/*public int compareTo(Libro L) {
		return this.titulo.compareTo(L.titulo);	
	}*/
	
	public Libro() {
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getEditorial() {
		return anyo;
	}
	public void setEditorial(int anyo) {
		this.anyo = anyo;
	}
	public Libro(String nombre, String autor, int anyo) {
		this.titulo=nombre;
		this.autor=autor;
		this.anyo=anyo;
		}                   
	public boolean iguales(Libro OtroLibro) {
		return (this.titulo.equals(OtroLibro.titulo) && (this.autor.equals(OtroLibro.autor)));
	}
	
	public boolean isMenor(Libro libro) {
		return (this.titulo.compareTo(libro.titulo)<=0) ? true : false;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + titulo + ", autor=" + autor + ", editorial=" + anyo + "]";
	}
	
}
}


	

