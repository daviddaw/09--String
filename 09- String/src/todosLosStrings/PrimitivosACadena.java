package todosLosStrings;

import java.util.Scanner;

public class PrimitivosACadena {

public void ejemplos(Scanner in) {
	int opcion;
	String s1,s2,s3,s4,s5,s6,s7;
	int num = 7;
	boolean encontrado =true;
	char c ='s';
	float f=3.5F;
	double d=6.5;
	char[] datos=new char[4];
	for (int i = 0; i < datos.length; i++) {
		datos[i]='a';
	}
	s7="bbbb";
	char[] datos1=s7.toCharArray();
	
	do {
		do {
			System.out.println("Elige una opción para convertir a String." +
		"\n	" +
		"\n	1. De entero ." +
		"\n	2. De boolean." +
		"\n	3. De char." +
		"\n	4. De float." +
		"\n	5. De double." +
		"\n	6. De Char[]." +
		"\n	7. Atras.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 7);

		switch (opcion) {
		case 1:
			s1=String.valueOf(num);
			System.out.println("Ejemplo:    	s1=String.valueOf(num);      ");
			System.out.println("Pasamos el numero a String "+s1);
			System.out.println(" ");
			
			break;
		case 2:
			s2=String.valueOf(encontrado);
			System.out.println("Pasamos el boolean a String "+s2);
			break;
		case 3:
			s3=String.valueOf(c);
			System.out.println("Pasamos el caracter a String "+s3);

			break;

		case 4:
			s4=String.valueOf(f);
			System.out.println("Pasamos el float a String "+s4);
			break;
		case 5:
			s5=String.valueOf(d);
			System.out.println("Pasamos el double a String "+s5);
			break;
		case 6:
			s6=String.valueOf(datos);
			System.out.println("Pasamos el array de caracteres a String "+s6);
			s6=String.valueOf(datos1);
			System.out.println("Pasamos el array de caracteres a String "+s6);
			break;
			
		default:
			break;
		}

	} while (opcion != 7);//

}

}
