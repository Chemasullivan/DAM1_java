package ejercicios;

import java.util.ArrayList;

import ejercicios.Pg12ejercicio1.Libro;

public class Pg12ejercicio2 {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro3 = new Libro("1984", "George Orwell", 1949);
        Libro libro4 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605);
        Libro libro5 = new Libro("El señor de los anillos", "J.R.R. Tolkien", 1954);
        
        ArrayList<Libro> libros = new ArrayList<Libro>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        
        libros = ordenar(libros);
        
        for(Libro libro : libros) {System.out.println(libro);}
	}
	
	public static ArrayList<Libro> ordenar(ArrayList<Libro> L) {
		ArrayList<Libro> librosNew = new ArrayList<Libro>();
		
		int tamayo = L.size(); 
		
		for(int k=0; k<tamayo; k++) {
			Libro libroMenor = L.get(0);
		for(Libro libroA : L) if(libroA.isMenor(libroMenor)) libroMenor=libroA;
			librosNew.add(libroMenor);
			L.remove(libroMenor);
		}
		return librosNew;
	}
	
	
	public static class Libro {
		private String titulo;
		private String autor;
		private int anyo;

		
	public Libro() {
	}
	
	public String getNombre() {
		return titulo;
	}
	public void setNombre(String nombre) {
		this.titulo = nombre;
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

