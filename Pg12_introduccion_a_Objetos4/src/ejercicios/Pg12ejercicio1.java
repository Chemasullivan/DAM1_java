package ejercicios;

public class Pg12ejercicio1 {

	public static void main(String[] args) {
		Libro libro1 = new Libro("El maquinista", "Antonio Fernandez", "1990");
		Libro libro2 = new Libro("Los malvados", "Enrique Tornel", "2001");
		Libro libro3 = new Libro("Los malvados", "Enrique Tornel", "2001");
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
		private String anyo;
		
	public Libro() {
	
	}
	
	public String getTitulo() {
		return nombre;
	}
	public void setTitulo(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return anyo;
	}
	public void setEditorial(String editorial) {
		this.anyo = editorial;
	}
	public Libro(String nombre, String autor, String editorial) {
		this.nombre=nombre;
		this.autor=autor;
		this.anyo=editorial;
		}      
	// se usa el mertodo equals dentro de la clase, aquí se queda para siempre
	public boolean iguales(Libro OtroLibro) {
		return (this.nombre.equals(OtroLibro.nombre) && (this.autor.equals(OtroLibro.autor)) && (this.anyo.equals(OtroLibro.anyo)));
			
		}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + anyo + "]";
	}
	
	}
	
		
	}

