package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cadena;
		char caracter;
		System.out.println("Te dare una cadena");
		cadena="hola ana belen";
		System.out.println("hola ana belen");
		System.out.println("Ahora escribe un caracter");
		caracter=in.next().charAt(0);
		
		System.out.print(caracter+" se  encuentra en las posiciones ");
		
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)==(caracter)) {
				System.out.print(i+"  ");
			}
			
			
		}
		//cadena1.equals(cadena2)
		
		
		
		
		
		
	}

}
