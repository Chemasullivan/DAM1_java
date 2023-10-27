package PG07ejercicios;

public class PG07MasEjercicios1 {

	public static void main(String[] args) {
		
	int [] vector = {1,3,5,7,9,3,7,1,2,0,1,0};
	
	masRepetido(vector);
	}
	
	private static void masRepetido(int [] tabla) {
		
		int contador=0; int numVecesMayor=0; int numMasRepetido=0;
		int j=0;
		for(j=0; j<tabla.length; j++) {
			
		for (int i=j+1; i<tabla.length; i++) {
			if (tabla[j]==tabla[i]) {contador++;}
		}
			if (numVecesMayor < contador) { numVecesMayor=contador; numMasRepetido = tabla[j]; }
			contador=0;
		}
		System.out.println("numero mas repetido " + numMasRepetido);

}
		
}