package Pg11Ejercicios;


import java.util.ArrayList;
import Pg11Ejercicios.Pg11ejercicio5.Fecha;
import Pg11Ejercicios.Pg11ejercicio4.FechasPersona;
import Pg11Ejercicios.Pg11ejercicio5.Persona;

public class Pg11ejercicio7 {
	
	public static void main(String[] args) {
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		
		Fecha[] fechas = {new Fecha(2,1,1970), new Fecha(4,6,1987), new Fecha(6,7,1999)};
		Fecha[] fecha2 = {new Fecha(2,1,1981), new Fecha(2,8,1995), new Fecha(3,5,2000)};
		String nombre;
		Persona p;
		
		nombre = "Pepe"; p = new Persona(nombre,fechas); personas.add(p);
		nombre = "Juan"; p = new Persona(nombre,fecha2); personas.add(p);
		nombre = "Luis"; p = new Persona(nombre,fechas); personas.add(p);
		
		personas = ordenar(personas);
		
		for (Persona persona:personas) System.out.println(persona);
		
		}

	private static ArrayList<Persona> ordenar(ArrayList<Persona> personas) {

		if (personas == null) return null;

		ArrayList<Persona> personasNew = new ArrayList<Persona>();

		int tamanyo = personas.size();
		for (int k = 1; k <= tamanyo; k++) 
		{
			Persona personaMenor = personas.get(0);
            for (Persona p:personas) if (p.isMenor(personaMenor)) personaMenor = p; 
			personasNew.add(personaMenor);
			personas.remove(personaMenor);
		}
		return personasNew;
	}
	
}
