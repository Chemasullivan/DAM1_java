package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Pg12ejercicio6 {

	public static void main(String[] args) {
		
		ArrayList <Cliente> clientes = new ArrayList<Cliente>();
	
		Cliente cliente1 = new Cliente("Antonio", "Murcia");
		Cliente cliente2 = new Cliente("Juan", "Almería");
		Cliente cliente3 = new Cliente("Luis", "Murcia");
		
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		//imprime por provincia y nombre.
		Collections.sort(clientes, new OrdenarProvinciaNombre());
		imprime(clientes);
		//imprime por nombre.
		Collections.sort(clientes);
		imprime(clientes);
		
	}
	
	
	public static class OrdenarProvinciaNombre implements Comparator<Cliente> {
		
		public int compare(Cliente c1, Cliente c2) {
			if (c1.getProvincia().compareTo(c2.getProvincia())==0) return c1.getNombre().compareTo(c2.getNombre());
			else return c1.getProvincia().compareTo(c2.getProvincia());
		}
	}
	
	public static void imprime(ArrayList<Cliente> clientes) {
		System.out.println(clientes);
	}
	
	
	public static class Cliente implements Comparable<Cliente> {
		
		private String nombre;
		private String provincia;
		
		public int compareTo(Cliente c) {
			return this.getNombre().compareTo(c.getNombre());
			
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getProvincia() {
			return provincia;
		}
		public void setProvincia(String provincia) {
			this.provincia = provincia;
		}
		
		@Override
		public String toString() {
			return "nombre=" + nombre + ", provincia=" + provincia + "\n";
		}
	
		public Cliente(String nombre, String provincia) {
			this.nombre=nombre;
			this.provincia=provincia;
		}
	
	
	
	}

}