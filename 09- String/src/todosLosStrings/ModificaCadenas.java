package todosLosStrings;

import java.util.Scanner;

public class ModificaCadenas {

public void ejemplos(Scanner in) {
	int opcion;
	String s1="una cadena";
	String s2="de metal.";
	do {
		do {
			System.out.println("Elige una opción:" +
		"\n	1. Concatena." +
		"\n	2. Remplaza." +
		"\n	3. Mayusculas/Minusculas." +
		"\n	4. Quita blancos trim (espacios) principio o fin." +
		"\n	5. Atras.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 4);

		switch (opcion) {
		case 1:
			System.out.println(1);
			System.out.println(s1.concat(s2));
			break;
		case 2:
			System.out.println(2);
			System.out.println(s1);
			System.out.println(s1.replace('a', 'i'));
			break;
		case 3:
			String cadena="UnA CaDeNa";
			System.out.println(cadena);
			System.out.println(cadena.toUpperCase());
			System.out.println(cadena.toLowerCase());
			
			break;
		case 4:
			String perro="  el perro    ";
			System.out.println(perro);
			System.out.println(perro.trim());
			break;

		default:
			break;
		}

	} while (opcion != 3);//

}

}
