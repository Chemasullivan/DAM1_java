package ejercicios;

public class Pg12ejercicio1 {

	public static void main(String[] args) {
		Libro libro1 = new Libro("El maquinista", "Antonio Fernandez", "Universo");
		Libro libro2 = new Libro("Los malvados", "Enrique Tornel", "Horizonte");
		Libro libro3 = new Libro("Los malvados", "Enrique Tornel", "Horizonte");
		// similares = libro1.iguales(libro2);
		//boolean similares2 = libro2.iguales(libro3);
		//System.out.println(similares2);
		if (esElMismo(libro3, libro2)) { System.out.println("es el mismo");}
		else {System.out.println("No es el mismo");
		System.out.println(libro2.iguales(libro3));
			
		}
		
	}
	
	public static boolean esElMismo(Libro l1, Libro l2) {
		return false;
	}
	

	public static class Libro  {
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

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
	
	}
	
		
	}

