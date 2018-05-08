package todosLosStrings;

import java.util.Scanner;

public class Wrappers {

public void ejemplo(Scanner in) {
	int opcion;
	String str1="1",str2="3.5",str3="false";
	byte n1; short n2; int n3;long n4;float n5; double n6;
	byte m1; short m2; int m3;long m4;float m5; double m6;
	byte p1; short p2; int p3;long p4;
	boolean boleano;
	boolean boleano2;
	do {
		do {
			System.out.println("Elige una opción:" +
					"\n 1. Constructores de Wrappers." +
					"\n	2. M Wraper a dato primitivo." +
					"\n	3. M Wraper a String toString." +
					"\n	4. M dato primitivo a String." +
					"\n	5. M String a Wraper parseint." +
					"\n	6. M Integer(String).intValue()." +
					"\n	7. M Integer.decode(String).intValue()." +
					"\n	8. Mas ejemplos."+
					"\n	9. Resumen."+
					"\n	10. Atras.");
			opcion = in.nextInt();
		} while (opcion < 1 || opcion > 10);

		switch (opcion) {
		case 1:
			Integer n=new Integer(32); 
			 n=new Integer("32");
			 System.out.println(" ");
			Float r=new Float(3.1416);
			 r=new Float ("3.1416"); 
			 System.out.println(" ");
			String pi=new String("3.1416");
			 r=new Float(pi);
			break;
		case 2:
			Integer e=new Integer(32); 
			 n=e.intValue(); //n=32
			 r=new Float(3.1416).floatValue(); //r=3.1416

			break;
		case 3:
			 n=new Integer("32");
			String s1= new String(n.toString());//s1=“32”
			String s2=n.toString(); //s2="32"
			 r=new Float(3.1416);
			 s1= new String(r.toString());//s1=“3.1416”
			 s1=r.toString();
			 System.out.println(s1);

			break;
		case 4:
			
			break;
		case 5:
			 str1="1"; 
			 int n10=Integer.parseInt(str1);

			break;
		case 6:
			 str1="1";
			Integer m=(new Integer(str1)).intValue();

			break;
		case 7:
			 str1="1";
			 p3=Integer.decode(str1).intValue();

			break;
		case 8:
			System.out.println("mas ejemplos");
			n1=Byte.parseByte(str1);//sin instanciar objeto ya usamos Byte.metodo(cadena)   Metodo     estatico
			m1=new Byte(str1).byteValue();//instanciando objeto new Byte(cadena).metodo()   Metodo  No estatico
			p1=Byte.decode(str1).byteValue();//mezcla de ambos                              Metodo     estatico
			n2=Short.parseShort(str1);
			m2=new Short(str1).shortValue();
			p2=Short.decode(str1).shortValue();
			n3=Integer.parseInt(str1);
			m3=new Integer(str1).intValue();
			n4=Long.parseLong(str1);
			m4= new Long(str1).longValue();
			n5=Float.parseFloat(str2);
			m5=new Float(str2).floatValue();
			n6=Double.parseDouble(str2);
			m6=new Double(str2).doubleValue();
			boleano=Boolean.parseBoolean(str3);
			boleano2=new Boolean(str3).booleanValue();
			System.out.println("--------------");

			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n4);
			System.out.println(n5);
			System.out.println(n6);
			System.out.println(boleano);
			System.out.println(m1);
			System.out.println(m2);
			System.out.println(m3);
			System.out.println(m4);
			System.out.println(m5);
			System.out.println(m6);
			System.out.println(boleano2);
			break;
		case 9:
			System.out.println("int (similar para Short, Byte, Long)\r\n" + 
					"A String: String.valueOf(int)\r\n" + 
					"De String: Integer.parseInt(String) // met. Estático\r\n" + 
					"De String: new Integer(String).intValue()  //met. No Estático\r\n" + 
					"De String: Integer.decode(String).intValue();// no válido para Float ni Double\r\n" + 
					"float\r\n" + 
					"A String: String.valueOf(float)\r\n" + 
					"De String: Float.parsefloat(String)\r\n" + 
					"De String: new Float(String).floatValue()\r\n" + 
					"double\r\n" + 
					"A String: String.valueOf(double)\r\n" + 
					"De String: Double.parseDouble(String)\r\n" + 
					"De String: new Double(String).doubleValue()\r\n" + 
					" boolean\r\n" + 
					"A String: String.valueOf(boolean)\r\n" + 
					"De String: new Boolean(String).booleanValue()\r\n" + 
					"");
			break;

		default:
			break;
		}

	} while (opcion != 10);//

}
}



