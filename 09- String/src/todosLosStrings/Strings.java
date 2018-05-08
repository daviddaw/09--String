package todosLosStrings;

import java.util.Scanner;

public class Strings {
	
	
	public void ejemplos(Scanner in) {
		int opcion;
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Contructores de String." + "\n	2. Operaciones Strings basicas." +
						"\n	3. Comparacion de cadenas(string.equals)." +"\n	4. CompareTooo." + "\n	5. Atras.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 5);

			switch (opcion) {
			case 1:
				System.out.println(1);
				constructoresDeString(in);
				break;
			case 2:
				System.out.println(2);
				operacionesStringsBasicas(in);
				break;
			case 3:
				System.out.println(2);
				comparacionCadenas(in);
				break;
				
			case 4:
				System.out.println(4);
				compareTo(in);
				break;

			default:
				break;
			}

		} while (opcion != 5);//

	}
	
	
	
	
	


	private void compareTo(Scanner in) {
		int opcion;
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. compareTo()." + "\n	2.  2." + "\n	3. Atras.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 3);

			switch (opcion) {
	case 1:
		System.out.println(2);

		String  s3,s5,/*s1,*/s2;
		System.out.println("compareTo");
		//s1="una cadena";
		s3="ena";
		s5="una";
		s2="una";
		System.out.println(s3.compareTo(s5));
		System.out.println(s5.compareTo(s2));
					
		break;

	default:
		break;
		
			}
		} while (opcion != 3);//
	}
	







	public void comparacionCadenas(Scanner in) {
	
			int opcion;
			do {
				do {
					System.out.println("Elige una opción:" + "\n	1. equalsIgnoreCase()." + "\n	2. startsWith()/endWith()." + "\n	3. Atras.");
					opcion = in.nextInt();
				} while (opcion < 1 || opcion > 3);

				switch (opcion) {
				case 1:
					System.out.println(1);
					String s3,s5,s1;
					s1="una cadena";
					s3="una";
					s5="una";
					System.out.println(s3==s5);
					System.out.println(s3.equalsIgnoreCase(s5));
					
					
					break;
				case 2:
					System.out.println(2);
					//String=s3,s5,s1;
					s1="una cadena";
					s3="ena";
					s5="una";
					System.out.println(s1.endsWith(s3));
					System.out.println(s1.startsWith(s5));
					
					break;
					
				default:
					break;
				}

			} while (opcion != 3);//

		}
		
	







	public void constructoresDeString(Scanner in) {
	    String cadena;
	    int opcion;
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. Cadena vacia." + "\n	2. Cadena Copia." + "\n	3. Array Caracteres a Cadena." +
									"\n	4. Fragmentos de Array Caracteres a Cadena." + "\n	5. Atras.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 5);

			switch (opcion) {
			case 1:
				System.out.println("como es una cadena no mostrara nada.. ");
				cadena=new String();
				System.out.println(cadena);
				break;
			case 2:
				System.out.println(2);
				String pajaro= "paloma";
				cadena=new String(pajaro);
				System.out.println(cadena);
				break;
			case 3:
				System.out.println(3);
				char[] arraydecaracteres={'a','e','i','o','u'};
				System.out.println(arraydecaracteres);
				break;
			case 4:
				System.out.println(4);
				char[] arraydecaracteres2={'m','u','s','i','c','a'};
				System.out.println(arraydecaracteres2);
				System.out.println("cogemos los 3 primeros caracteres");
				cadena=new String(arraydecaracteres2, 0, 3);
				System.out.println(cadena);
				break;


			default:
				break;
			}

		} while (opcion != 5);//

	}
	
	public void operacionesStringsBasicas(Scanner in) {
		String cadena;
		int opcion;
		cadena="una cadena";
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. length()." + "\n	2. charAt()."+
						"\n	3. getChars()."+ "\n	4. Atras.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 3);

			switch (opcion) {
			case 1:
				System.out.println(1);
				
				System.out.println(cadena.length());

				break;
			case 2:
				System.out.println(2);
				System.out.println(cadena);
				System.out.println(cadena.charAt(1));
				break;
			case 3:
				System.out.println(3);
				System.out.println(cadena);
				char[] v= new char[cadena.length()];
				cadena.getChars(4, 10, v, 2);
				for (int i = 0; i < v.length; i++) {
					System.out.print(v[i]);
					
					
					
				}
				System.out.println(" ");
				break;

			default:
				break;
			}

		} while (opcion != 3);//

	}

}
