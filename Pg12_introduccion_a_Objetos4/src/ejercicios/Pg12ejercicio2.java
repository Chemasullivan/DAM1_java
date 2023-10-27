package ejercicios;

import ejercicios.Pg12ejercicio1.Libro;

public class Pg12ejercicio2 {

	public static void main(String[] args) {
		

	}
	
	public static class Libro {
		private String nombre;
		private String autor;
		private String editorial;
		
	public Libro() {
	
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Libro(String nombre, String autor, String editorial) {
		this.nombre=nombre;
		this.autor=autor;
		this.editorial=editorial;
		}                   
	public boolean iguales(Libro OtroLibro) {
		return (this.nombre.equals(OtroLibro.nombre) && (this.autor.equals(OtroLibro.autor)) && (this.editorial.equals(OtroLibro.editorial)));
	}
	
	public int isMenor(Libro libro) {
		if (this.iguales(libro))
		return 0;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	}
	
	
	
	
	
	
	}

