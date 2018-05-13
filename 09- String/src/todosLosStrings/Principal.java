package todosLosStrings;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Strings strings = new Strings();
		SubStrings  subStrings= new SubStrings();
		BusquedaCadenas busquedaCadenas = new BusquedaCadenas();
		ModificaCadenas modifica =new ModificaCadenas();
		PrimitivosACadena primiCad = new PrimitivosACadena();
		Wrappers wraper =new Wrappers();
		StringBuffer1 sb1 = new StringBuffer1();

		
	  
		int opcion;
			do {
				
				do {
					System.out.println("Elige una opción:" +
				"\n	1. imprimir partes de cadena o comparar cadenas con  Strings" +
				"\n	2. imprimir partes de una cadena con SubStrings." +
				"\n	3. Busqueda dentro de cadenas IndexOf." +
				"\n	4. Modificacion de cadenas (remplazo)." +
				"\n	5. valueOf() de tipos primitivos a String." +
				"\n	6. Wrappers o Envoltorios." +
				"\n	7. Stringbuferr." +
				"\n	8. Ejemplos de todas las conversiones." +
				"\n	9. Atras.");
					opcion = in.nextInt();
				} while (opcion < 1 || opcion > 9);//incuyo el atras

			switch (opcion) {
				case 1:
					strings.ejemplos(in);
					break;
				case 2:
					
					subStrings.ejemplos(in);
					break;
				case 3:
					
					busquedaCadenas.ejemplos(in);
					break;
				case 4:
				
					modifica.ejemplos(in);
					break;
				case 5:
					
					primiCad.ejemplos(in);
					break;
				case 6:
					wraper.ejemplo(in);
					break;
				case 7:
					
					sb1.ejemplos(in);
					break;
				case 8:
					
					ejemplos(in);
					break;

				default:
					break;
				}

			} while (opcion != 9);//si es atras se rompe
	
	}
      //submenu completo de conversiones
	private static void ejemplos(Scanner in) {	
		int opcion;	
		do {
			do {
				//texto para que el visitante lea las opciones
		System.out.println("Elige una opcion:" +
				"\n1. Cambios entre enteros y cadenas en ambas direcciones."+
				"\n2. Cambios entre caracteres y cadenas en ambas direcciones."+
				"\n3. Cambios entre doubles y cadenas en ambas direcciones."+
				"\n4. Cambios entre float y cadenas en ambas direcciones."+
				"\n5. Cambios entre boolean y cadenas en ambas direcciones."+
				"\n9.Salir");
		opcion=in.nextInt();//aqui recogemos la opcion
		switch (opcion) {
		case 1:
			      ambasDireccionesStringInt(in);	      
			break;
		case 2:
		      ambasDireccionesStringChar(in);	      
		break;	
		case 3:
		      ambasDireccionesStringDouble(in);	      
		break;
		case 4:
		      ambasDireccionesStringFloat(in);	      
		break;
		case 5:
		      ambasDireccionesStringBoolean(in);	      
		break;
			
		default:
			break;
		}
			} while (opcion<1 || opcion>9);
			System.out.println("Para salir pulsa 9");
	} while (opcion !=9 );
		
	}

	private static void ambasDireccionesStringBoolean(Scanner in) {
		int opcion;
		do {
			
		System.out.println(
		"\n1. Convertir  de String a boolean.\r\n"+
		"-----------------------------------------\n"+
		"Boolean boolean = Boolean.valueOf(cadena);\r\n" + 
		"// o\r\n" + 
		"boolean boolean = Boolean.parseBoolean(cadena);\r\n" + 
		"Ejemplo:\r\n" + 
		"\r\n" + 
		"Boolean boolean = Boolean.valueOf(\"true\");\r\n" + 
		"// o\r\n" + 
		"boolean boolean = Boolean.parseBoolean(\"false\");\n"+
		"otra manera\n"+
		
        "De String: new Boolean(String).booleanValue()\r\n" +
		
	
		"\n2. Convertir de boolean a String\r\n" + 
		"----------------------------------------\n"+
		
        "String cadena = String.valueOf(b);\r\n" + 
        "// o\r\n" + 
        "String cadena = Boolean.toString(b);\r\n" + 
        "Ejemplo:\r\n" + 
        "\r\n" + 
        "boolean b = true;\r\n" + 
        "String cadena = String.valueOf(b);\r\n" + 
        "// o\r\n" + 
        "boolean b = false;\r\n" + 
        "String cadena = Boolean.toString(b);\n"+
		"Para continuar pulsa 1");
		
		opcion=in.nextInt();
		} while (opcion!=1);
		
	}
	
	
	private static void ambasDireccionesStringFloat(Scanner in) {
		int opcion;
		do {
			
		System.out.println(
		"\n1. Convertir  de String a float.\r\n"+
		"-----------------------------------------\n"+
		"float flotante = Float.parseFloat(cadena);\r\n" + 
		"Ejemplo:\r\n" + 
		"\r\n" + 
		"float importe = Float.parseFloat(\"900.5\");\n"+
        "otra manera\n"+
        "De String: new Float(String).floatValue()\r\n" + 
		
		"\n2. Convertir de float a String\r\n" + 
		"----------------------------------------\n"+
        "String cadena = Float.toString(flotante);\r\n" + 
        "Ejemplo:\r\n" + 
        "\r\n" + 
        "String total = Float.toString(900.1f);\n"+
        "A String: String.valueOf(float)\r\n" + 

		"Para continuar pulsa 1");
		
		opcion=in.nextInt();
		} while (opcion!=1);
		
		
		
	}
	private static void ambasDireccionesStringDouble(Scanner in) {
		int opcion;
		do {
			
		System.out.println(
		"\n1. Convertir  de String a double).\r\n"+
		"-----------------------------------------\n"+
		"double doble = Double.parseDouble(cadena);\r\n" + 
		"Ejemplo:\r\n" + 
		"\r\n" + 
		"double doble = Double.parseDouble(\"900.1\"); /n"+
		"otra manera\n"+
		
		"De String: new Double(String).doubleValue()\r\n" + 
		"\n"+
		"\n2. Convertir de double a String\r\n" + 
		"----------------------------------------\n"+
		"String cadena = String.valueOf(doble);\r\n" + 
		"Ejemplo:\r\n" + 
		"double totalDoble = 900.5;\r\n" + 
		"String totalString = String.valueOf(doble);\n"+

		"Para continuar pulsa 1");
		
		opcion=in.nextInt();
		} while (opcion!=1);
		
		
	}
			
	private static void ambasDireccionesStringChar(Scanner in) {
		int opcion;
		do {
			
		System.out.println(
		"\n1a. Convertir  de String a char.\r\n"+
		"-----------------------------------------\n"+
		"char caracter = cadena.charAt(0); //Solo primer caracter\r\n" +
		"Ejemplo\n"+
		"String codigo= \"E\";\r\n" + 
		"char caracter = codigo.charAt(0);"+
		"\n1b. Convertir  de String a array de char.\r\n"+
		"-----------------------------------------\n"+
		"String codigo= \"España\";\r\n" +
		"char[] arrayDeCaracteres =codigo.toCharArray()\n"+
		"otra manera\n"+
		"con un bucle for hasta codigo.lengt\n"+
 
		
	
		"\n2. Convertir de char a String\r\n" + 
		"-----------------------------------------\n"+
		"String cadena = Character.toString(char);\r\n" + 
		"Ejemplo:\r\n" + 
		"\r\n" + 
		"char codigo = 'A';\r\n" + 
		"String cadena = Character.toString(codigo);"+
		"\nPara continuar pulsa 1");
		
		opcion=in.nextInt();
		} while (opcion!=1);
		
	}
	private static void ambasDireccionesStringInt(Scanner in) {
		int opcion;
		do {
			
		System.out.println(
		"\n1. Convertir  de String a Integer(int).\r\n"+
		"-----------------------------------------\n"+
		"Integer entero = Integer.valueOf(cadena);\n" + 
		"Integer a = Integer.valueOf(\"900\");\n\n" + 
		" otra manera\r\n\n" + 
		"int entero = Integer.parseInt(cadena);met. Estático\\r\\n\n" + 
		"int b = Integer.parseInt(\"900\");\n\n" +
		" otra manera\r\n\n" +
		"De String a int: new Integer(String).intValue()  //met. No Estático\r\n" + 
		" otra manera\r\n\n" +
		"De String a int: Integer.decode(String).intValue();// no válido para Float ni Double\r\n" + 
	
		

		"\n2. Convertir de Integer(int) a String\r\n" + 
		"----------------------------------------\n"+
		"String cadena = Integer.toString(entero);\r\n" + 
		"String importe = Integer.toString(900);\r\n\n" + 
		"// otra manera\r\n\n" + 
		"String cadena = String.valueOf(entero);\r\n" +
		"int entero = 900;\r\n" + 
		"String mensaje = String.valueOf(entero);\n"+
		"Para continuar pulsa 1");
		
		
		opcion=in.nextInt();
		} while (opcion!=1);
		
	}



}
