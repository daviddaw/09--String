package ej;

import java.util.Scanner;

public class Ejercicio  {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int opcion;
			
			do {
				do {
					System.out.println("Elige una ejercicio:" +
				"\n	1. Ejercicio1." +
				"\n	2. Ejercicio2." +
				"\n	3. Ejercicio3."+
							"\n	4. Atras.");
					opcion = in.nextInt();
				} while (opcion < 1 || opcion > 4);
				switch (opcion) {
				case 1:
					Ejercicio.ejercicio1(in);
					break;
				case 2:
					Ejercicio.ejercicio2(in);
					break;
				default:
					break;
				}

			} while (opcion != 3);
		in.close();


	}



	private static void ejercicio1(Scanner in) {
		String cadena;
		int opcion;
		System.out.println("Escribe una cadena");
		 cadena=in.next();
		do {
			do {
				System.out.println("Elige una opción:" + "\n	1. transformando String a array de char." + "\n	2. con subString." + "\n	3. Atras.");
				opcion = in.nextInt();
			} while (opcion < 1 || opcion > 3);


			switch (opcion) {
			case 1:
				char c = 0;
				char[] mitad1 = new char[cadena.length()];
				char[] mitad2=new char[cadena.length()];
				

				System.out.println("La longitud es "+cadena.length());
				for (int i = 0; i < cadena.length(); i++) {
					 
					 if (i<cadena.length()/2) {
						mitad1[i] += cadena.charAt(i);
					}

					 c=(cadena.charAt(cadena.length()/2));
					 if (i>cadena.length()/2) {
						 mitad2[i] += cadena.charAt(i);
					}
					//System.out.println(cadena.charAt(i));
				}
				System.out.println("recorriendo un String mediante un for y guardandolo en un array de chars   ");
				System.out.println(mitad1);
				System.out.println(c);
				System.out.println(mitad2);
				break;
			case 2:
				System.out.println(cadena.substring(0, cadena.length()/2));
				//System.out.println(cadena.substring(cadena.length()/2,(cadena.length()/2)+1));
				System.out.println(cadena.charAt(cadena.length()/2));
				System.out.println(cadena.substring(cadena.length()/2+1));
				break;

			default:
				break;
			}

		} while (opcion != 3);//
		
	}
	private static void ejercicio2(Scanner in) {
		String cadena;
		char c;
		int opcion;
		System.out.println("Escribe una cadena");
		// cadena=in.next();
		cadena="hola ana belen";
		 System.out.println("Escribe un caracter");

	
			 //c=in.next().charAt(0);
			 c='a';
	
		    
			do {
				do {
					System.out.println("Elige una opción:" + "\n	1. indexOf." + "\n	2. buuug." + "\n	3. Atras.");
					opcion = in.nextInt();
				} while (opcion < 1 || opcion > 2);


				switch (opcion) {
				case 1:
					int pos=0;
					while (cadena.indexOf(c, pos)!=-1) {//!=-1()si contiene la letra a partir de la posicion pos
						System.out.println("la letra "+c+" se encuentra en la posicion "+cadena.indexOf(c,pos));
						pos++;
					}
					
						
				
					
		
					
					

				case 2:

					break;

				default:
					break;
				}

			} while (opcion != 3);//
		
	}

}
