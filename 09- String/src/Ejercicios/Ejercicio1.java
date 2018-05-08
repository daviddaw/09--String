	package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String cadena;
		System.out.println("Escribe una palabra(cadena)");
		cadena=in.next();
		System.out.println(cadena.length());
		System.out.println(cadena.charAt(cadena.length()/2));
		//System.out.println(cadena.getChars(0, 3, dst, dstBegin););
		System.out.println("mitad 1");
		System.out.println(cadena.substring(0, cadena.length()/2));
		System.out.println("mitad 2");
		System.out.println(cadena.substring(cadena.length()/2+1, cadena.length()));
	}

}
