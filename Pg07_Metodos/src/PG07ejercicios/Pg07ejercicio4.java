package PG07ejercicios;

public class Pg07ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println(azaroso());
		
		
	}
	private static int azaroso() {
		
		double numero;
		numero=(Math.random()*100)+1;
		
		return (int) numero;
	}
}
