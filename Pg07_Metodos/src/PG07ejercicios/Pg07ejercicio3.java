package PG07ejercicios;

public class Pg07ejercicio3 {

	public static void main(String[] args) {
	
		System.out.println(esPrimo(5));
		
	}
		private static boolean esPrimo(int x) {
		if (x<2) return false;
		for (int divisor=2; divisor<=x/2; divisor++) if (x % divisor == 0) return false;
		return true;
	}

}
