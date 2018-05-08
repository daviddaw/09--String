package todosLosStrings;

import java.util.Scanner;

public class BusquedaCadenas {



	public void ejemplos(Scanner in) {
		int opcion;
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Busqueda de cadenas."  + "\n	2. Atras.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 2);

			switch (opcion) {
			case 1:

				String s5 = new String("aeiou");
				System.out.println(s5.indexOf("b"));
				System.out.println(s5.indexOf("b")>=0);
				System.out.println(s5.indexOf("a", 3));
				System.out.println("--------");
				System.out.println(s5.indexOf("u"));
				System.out.println(s5.indexOf("u")>=0);
				System.out.println(s5.indexOf("u", 3));
				
				
				break;


			default:
				break;
			}

		} while (opcion != 2);//

	}
}
