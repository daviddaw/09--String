package todosLosStrings;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Strings strings = new Strings();
		SubStrings  subStrings= new SubStrings();
		BusquedaCadenas busquedaCadenas = new BusquedaCadenas();
		ModificaCadenas modifica =new ModificaCadenas();
		PrimitivosACadena primiCad = new PrimitivosACadena();
		Wrappers wraper =new Wrappers();
		StringBuffer1 sb1 = new StringBuffer1();

		
	  
		int opcion;
			do {
				do {
					System.out.println("Elige una opción:" +
				"\n	1. imprimir partes de cadena o comparar cadenas con Strings" +
				"\n	2. imprimir partes de una cadena con SubStrings." +
				"\n	3. Busqueda dentro de cadenas IndexOf." +
				"\n	4. Modificacion de cadenas (remplazo)." +
				"\n	5. valueOf() de tipos primitivos a String." +
				"\n	6. Wrappers o Envoltorios." +
				"\n	7. Stringbuferr." +
				"\n	8. Atras.");
					opcion = in.nextInt();
				} while (opcion < 1 || opcion > 8);//incuyo el atras

			switch (opcion) {
				case 1:
					System.out.println(1);
					strings.ejemplos(in);
					break;
				case 2:
					
					subStrings.ejemplos(in);
					break;
				case 3:
					
					busquedaCadenas.ejemplos(in);
					break;
				case 4:
				
					modifica.ejemplos(in);
					break;
				case 5:
					
					primiCad.ejemplos(in);
					break;
				case 6:
					wraper.ejemplo(in);
					break;
				case 7:
					
					sb1.ejemplos(in);
					break;

				default:
					break;
				}

			} while (opcion != 8);//si es atras se rompe

		
	
	
	


	

	
		

		

	
	}



}
