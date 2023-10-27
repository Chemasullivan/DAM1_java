package PG07ejercicios;

public class Pg07ejercicio5 {

	public static void main(String[] args) {
	
		System.out.println(aleatorio(20));
		
	}
	private static int aleatorio(int numMax) {
		
		
		return (int) (Math.random()*(numMax)+1);
	}
}
