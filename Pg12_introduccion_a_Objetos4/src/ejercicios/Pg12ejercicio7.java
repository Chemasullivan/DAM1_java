package ejercicios;
/** Atienda a las explicaciones sobre diseño de clases orientado a objetos. 
Desarrolle las clases Cliente y Almacen de modo coherente el siguiente Modelo Entidad 
Relación. 
Cliente(1) disponeDe (N) Almacén 
Cliente(Id, Nombre, Direccion,Provincia)
Almacen (Id, IdCliente, Direccion, Provincia)
En un programa principal desarrolle el método 
private static ArrayList<Cliente> clientesConAlmacenEn(ArrayList<Cliente> clientes, String provincia);
y pruébelo
*/
import java.util.ArrayList;

public class Pg12ejercicio7 {

	public static void main(String[] args) {
		

	}
	
	public class Cliente {
		
		private static int contador=0;
		
		private String Id;
		private String nombre;
		private String Direccion;
		private String Provincia;
		private ArrayList<almacen> almacenes;
		
	public Cliente(String id, String nombre, String direccion, String provincia )	{
		
	}
		
	}
	
	public class Almacen{
		
		private String Id;
		private String IdCliente;
		private String Direccion;
		private String Provincia;
	}
}
