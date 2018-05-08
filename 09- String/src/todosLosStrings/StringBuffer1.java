package todosLosStrings;

import java.util.Scanner;

public class StringBuffer1 {

public void ejemplos(Scanner in) {
	int opcion;
	StringBuffer s1;
	String string;
	char[] a;
	int i;
	s1=new StringBuffer("una cadena");
	do {
		do {
			System.out.println(
					"Elige una opción:" +
			"\n	1. SB Metodos Relacionados con el tamaño." +
			"\n	2. SB Metodos Relacionados con los caracteres charAt/setCharAt/getChars/deleteCharAt/indexOf/append/insert" +
			"\n	3. SB Metodos Relacionados con los caracteres Reverse/Delete/Replace"+ 
			"\n	4. Atras.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 4);

		switch (opcion) {
		case 1:
			
			System.out.println(s1.length());//10
			System.out.println(s1.capacity());//10+16=26
			s1.setLength(6);//caracteres usados 6 pero capacidad 26
			System.out.println(s1);//una ca
			s1.ensureCapacity(50);//capacidad mayor que 50 26*2=54
			System.out.println(s1.capacity());
			System.out.println("convierte el StringBuffer a String");
			string=new String(s1.toString());
			System.out.println(string);
			break;
		case 2:
			string="a";
			System.out.println(s1.charAt(4));//print caracter posicion4
			s1.setCharAt(4, 'f');//pone f en la posicion4
			System.out.println(s1.charAt(4));
			System.out.println(" ");
			a=new char[100];
			s1.getChars(0, s1.length(), a, 0);
			for ( i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			s1.getChars(0, 2, a, 5);
			for ( i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println(" ");

			;
			System.out.println(s1.indexOf("a"));//string vale a
			
			System.out.println(s1.indexOf("na",4));//vale na
			System.out.println("Eliminamos un caracter");
			System.out.println(s1.deleteCharAt(s1.length()-1));
			System.out.println("anexar datos es como concatenar");
			String s3= "BC"+22;
			String s4=new StringBuffer().append("BC").append(22).toString();
			System.out.println(s3);
			System.out.println(s4);

			System.out.println("insert para cadena sin limites");
			s1= new StringBuffer("Una cadena sin limites");
			s1.insert(s1.length(), 345);
			System.out.println(s1);//Imprime "Una cadena sin límites345"
			break;
		case 3:
       System.out.println("StringBuffer reverse(): invierte la cadena de caracteres");		
			StringBuffer s10=new StringBuffer("ABCDE");
			System.out.println(s10);
			System.out.println(s10.reverse()); // EDCBA
			System.out.println("StringBuffer delete(int x, int y): elimina los caracteres entre las posiciones x e y (y no incluido)");
			StringBuffer s11=new StringBuffer("Ana Isabel");
			System.out.println(s11);
			System.out.println (s11.delete(3,7)); //Anabel
			System.out.println("StringBuffer replace(int x, int y, String s): sustituye los caracteres entre las posiciones x e y por el string s (y no incluido)");
			
			StringBuffer s12=new StringBuffer("Ana Isabel");
			System.out.println(s12);
			System.out.println(s12.replace(4,10,"Belen"));// Ana Belen
			break;

		default:
			break;
		}

	} while (opcion != 4);//

}



}
