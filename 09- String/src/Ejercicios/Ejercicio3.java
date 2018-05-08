package Ejercicios;
/**
 * 3.	Dada una cadena por teclado, decidir si es palíndroma, es decir si se lee igual de izquierda a derecha que de derecha a izquierda. Eliminad primero los espacios intermedios y haced luego la evaluación: 
•	Ejemplo: “dabale arroz a la zorra el abad” :  “dabalearrozalazorraelabad” y 

 * @author David Palanco
 *
 */
public class Ejercicio3 {


	public static void main(String[] args) {
		//quitar espacios replace(char a, char a_new)	Sustituye el carácter a por el a_new en toda la cadena
		char caracter;
		caracter=' ';
		StringBuffer cadena2;
		StringBuffer cadena1=new StringBuffer("dabale arroz a la zorra el abad");
		System.out.println(cadena1);
		cadena2=cadena1.reverse();
		System.out.println(cadena2);
		
		
		

		
		for (int i = 0; i < cadena1.length(); i++) {
			if (cadena1.charAt(i)==(caracter)) {
				System.out.print(i+"  ");
				cadena1=cadena1.replace(i, i+1, "");
			}
			
			
		}
		System.out.println(" ");
		
		for (int i = 0; i < cadena2.length(); i++) {
			
			if (cadena2.charAt(i)==(caracter)) {
				System.out.print(i+"  ");
				cadena2=cadena2.replace(i, i+1, "");
			}
			
			
		}int i;
/*	       for (i <= ((cadena1.length()/2)+1); i=0; i--) {
	   		System.out.println(cadena1.charAt(i));
	   	}*/
	       
	       
		if (cadena1.equals(cadena2)) {
			System.out.println("son palindromos");
		}else {
			System.out.println("No son palindromos");
		}
		
		for (int j = 0; j < 5; j++) {
			System.out.println(j);
		}
		
		for (int j = 5; j > 0; j--) {
			System.out.println(j);
		}


		
/*		cadena=cadena.replace(" ", "");
		System.out.println(cadena);*/

	}

}
