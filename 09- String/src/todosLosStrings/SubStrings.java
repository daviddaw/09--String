package todosLosStrings;

import java.util.Scanner;

public class SubStrings {


	public void ejemplos(Scanner in) {
		int opcion;
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Creacion de subcadenas."  + "\n	3. Atras.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 2);

			switch (opcion) {
			case 1:
				//creacion de subcadenas
				System.out.println(1);
				String s1 =new String("Una Cadena");//se pueden usar cadenas u char
				char c1 ='a';
				System.out.println(s1.substring(3));
				System.out.println(s1.substring(1, 7));
				break;


			default:
				break;
			}

		} while (opcion != 2);//

	}

}
