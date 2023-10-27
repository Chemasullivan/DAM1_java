package PG07ejercicios;

public class PG07MasEjercicios1v2 {


	public static void main(String[] args) {
		
		int[] datos = { 1,4,5,6,72,3,4,1,5,4,5,8};
		System.out.println(masRepetido(datos));

	}
	
	private static int masRepetido(int[] datos) {
		
		int candidato = datos[0]; //asigna ya el primer numero como el candidato
		int apCandidato = apariciones(datos, datos[0]); //aqui esta recorriendo el array contando cuantas veces aparece el numero.
		
		for (int i=1; i<datos.length;i++) {
			
			int apCandidatoI = apariciones(datos,datos[i]);
		
			if (apCandidatoI>apCandidato || 
				apCandidatoI == apCandidato && datos[i]>candidato)
			{
				candidato = datos[i];
				apCandidato = apCandidatoI;
			}
		}
		
		return candidato;
	}	
	
	private static int apariciones(int[] datos, int dato) {
		
		int contador =0; 
		for (int i=0; i<datos.length; i++) 
		if (dato == datos[i]) contador++;	
		
		return contador;
	}
	
}



