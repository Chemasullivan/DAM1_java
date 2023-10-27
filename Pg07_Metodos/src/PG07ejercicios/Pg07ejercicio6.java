package PG07ejercicios;

public class Pg07ejercicio6 {

	public static void main(String[] args) {

		System.out.println(aleatorio(50,10));
		
	}
	private static int aleatorio(int numMax, int numMin) {
		
		return (int) (Math.random()*(numMax-numMin)+numMin);
	}
}
