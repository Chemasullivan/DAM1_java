package PG07ejercicios;

public class Pg07ejercicio7 {

	public static void main(String[] args) {
		
		int [] tabla = {6,4,8,7,5,9,1,3,2,10};
		ordenar(tabla);
		
	}
	private static void ordenar(int[]datos) {
		
		int i=0; int j=0;  int aux=0; 
		/**
		do {
			for (i=j; i<datos.length; i++) { //mete la primera i=1 porque empieza a comprobar desde el segundo puesto.
			if (datos[i]<datos[j]) {
				aux = datos[j]; datos[j]=datos[i]; datos[i]=aux;}
			}j++;
			}
		while(j<10); //se pone 9 porque el ultimo no hace falta hacerlo ya que se quedara al mayor como ultimo.
		
		for(i=0; i<datos.length; i++) {
			System.out.print(datos[i] + " "); } */
		for(j=0; j<datos.length-1; j++) {
			for(i=j+1; i<datos.length; i++) {
				if (datos[i]<datos[j]) {
					aux=datos[j]; datos[j]= datos[i]; datos[i]=aux; }
				}
		}
		for (i=0; i<datos.length; i++) {
			System.out.print(datos[i] + " "); 
		} 
	} 
}
