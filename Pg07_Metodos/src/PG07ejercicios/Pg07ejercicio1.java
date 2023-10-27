package PG07ejercicios;

public class Pg07ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(devuelveMayor(3, 2, 1));
		
	}	
		private static int devuelveMayor(int a, int b, int c) {	
		int mayor = a;
		if (b>a && b>c) mayor=b;
		if (c>a && c>b) mayor=c;
		return mayor;
	}
		
}