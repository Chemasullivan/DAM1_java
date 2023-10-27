package PG07ejercicios;

public class Pg07ejercicio9 {

	public static void main(String[] args) {
		
		int [] tabla = {3,6,8,5,4,9};
		media(tabla);
		
		double [] tabla2 = {3.5,5.4,6.7,1.4,8.6};
		System.out.println(media(tabla2));
		
	}
	
	private static void media(int[]datos) {
		
		int suma=0;
		int media;
		for(int i=0; i<datos.length; i++) {
			suma = suma + datos[i];
		}
		media=suma/datos.length;
		System.out.println(media);
	}
	
	private static double media(double[]datos) {
		
		double suma=0;
		for(int i=0; i<datos.length; i++) {
			suma = suma + datos[i];
		}
		return suma/datos.length;
	}
	
	
	
	
}
