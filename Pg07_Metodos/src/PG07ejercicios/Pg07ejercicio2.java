package PG07ejercicios;

public class Pg07ejercicio2 {

	public static void main(String[] args) {
	
	System.out.println(multiplo(15, 100));	
		
	}
		private static boolean multiplo(int a, int b) {
			
			if (b%a == 0) return true;
				return false;
		}

}
