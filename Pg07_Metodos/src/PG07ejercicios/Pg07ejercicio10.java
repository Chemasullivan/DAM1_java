package PG07ejercicios;

public class Pg07ejercicio10 {

	public static void main(String[] args) {
		
		int [] primos = numPrimos();
		
		for (int i=0; i<primos.length; i++) {
			System.out.print(primos[i] + " ");
		}

	}
	
	
	
	private static boolean esPrimo(int x) {
		if (x<2) return false;
		for (int divisor=2; divisor<=x/2; divisor++) if (x % divisor == 0) return false;
		return true;
	}

	private static int [] numPrimos() {
		int contador=0;
		for (int i=0; i<100; i++) {
			if (esPrimo(i)) contador++; 
		}
		
		int [] tablaPrimos = new int[contador];
		
		int indice=0;
		for (int i=0; i<100; i++) {
			if (esPrimo(i)) {tablaPrimos [indice] = i;
							indice++;}
		}
		
	return tablaPrimos;
	}
	
	
	
	
	
}
