package proyecto1;

import java.util.InputMismatchException;
import java.util.Scanner;


	/* Programar la clase Teclado en Java para leer valores desde el teclado de forma segura.
	Dicha clase debe contener funciones estáticas con sus correspondientes manejos de excepciones, de
	forma que se pueda incluir en cualquier proyecto e invocar a estas funciones desde cualquier otra
	clase sin tener que repetir las tediosas tareas asociadas a una lectura segura de datos.
	La utilidad de esta clase será simplificar la escritura de estas operaciones, por lo que el nombre de
	las funciones lo vamos a elegir de forma que sea igualmente breve.
	Si el usuario no introduce lo deseado, se lo volveremos a pedir repetidas veces hasta que introduzca
	un valor válido*/



public class Keyboard1 {
// - Crear la clase teclado
	static Scanner keyboard = new Scanner(System.in);
	
// - Crear una función que cierre el teclado
	public static void closeKeyboard() {
		keyboard.close();
	}

// - Crear enum 
	public enum Enum{ MAYORIGUAL, MENORIGUAL, MAYOR, MENOR}

// - Creacion de segundo enum
	public enum Enum2{ AMBOSINC, AMBOSEXC, MININC, MINEXC}
	

// - Crear una función que lea un carácter
	public static char lecturaCaracter() {
		char x = ' ';
		x=keyboard.next().charAt(0);
		
		return x;
	}
// - Crear una función que lea una cadena de carácteres	
	public static String lecturaString() {
		
		String x = "";
		x=keyboard.next();
		return x;
	}
	
/* - Crear 6 funciones para lectura de un número cualquiera, una para cada tipo. 
 * - Hacer una excepción por si el usuario introduce un carácter que no sea un número le salte un error y le indique que introduzca un número.
 * - Repetir el proceso con un tipo byte, short, long, float y double.
 * 
*/
	public static int lecturaInt() {
		int x = 0;
		boolean y = true;
		do {
		try {
		x=keyboard.nextInt();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			keyboard.nextLine();
			System.out.println("Error, introduce un numero: ");
		}
		} while(y);
		return x;
	}

	public static byte lecturaByte() {
		
			byte x = 0;
			boolean y = true;
			do {
			try {
			x=keyboard.nextByte();
			y = false;
			}
			catch (InputMismatchException e) {
				y = true;
				keyboard.nextLine();
				System.out.println("Error, introduce un nï¿½mero: ");
			}
			} while(y);
			return x;
		
	}
	
	public static short lecturaShort() {
		
		short x = 0;
		boolean y = true;
		do {
		try {
		x=keyboard.nextShort();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			keyboard.nextLine();
			System.out.println("Error, introduce un nï¿½mero: ");
		}
		} while(y);
		return x;
	}
	
	public static long lecturaLong() {
		
		long x = 0;
		boolean y = true;
		do {
		try {
		x=keyboard.nextLong();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			keyboard.nextLine();
			System.out.println("Error, introduce un nï¿½mero: ");
		}
		} while(y);
		return x;
	}
	
	public static float lecturaFloat() {
		
		float x = 0;
		boolean y = true;
		do {
		try {
		x=keyboard.nextFloat();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			keyboard.nextLine();
			System.out.println("Error, introduce un nï¿½mero: ");
		}
		} while(y);
		return x;
	}
	
	public static double lecturaDouble() {
		
		double x = 0;
		boolean y = true;
		do {
		try {
		x=keyboard.nextDouble();
		y = false;
		}
		catch (InputMismatchException e) {
			y = true;
			keyboard.nextLine();
			System.out.println("Error, introduce un nï¿½mero : ");
		}
		} while(y);
		return x;
	}
	
/* - Crear 6 funciones para cada tipo para leer un número mayor, menor o igual pasado como parámetro utilizando sobrecarga
 * para que se llamen igual y crear un enum.
 * - Crear un enum al principio indicando las distintas opciones posibles, que sean mayor, menor, mayor o igual y menor o igual que el número indicado.
 * - Usar sobrecarga para que las 6 funciones se llamen igual.
 * - En cada posibilidad mostrar un error que indique número incorrecto si está fuera del rango que ha pedido la consola.
 * - No hace falta crear una excepción por si introduce un carácter inválido debido a que usaremos las funciones anteriores
 * para crear estas y ya estarían hechas las excepciones.
 * - Repetir el proceso con un tipo byte, short, long, float y double.
 */
	
	public static int parametros (Enum posibles, int x) {
		int numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaInt();
				if (numero < x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaInt();
				if (numero > x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaInt();
				if (numero <= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaInt();
				if (numero >= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}

	public static byte parametros (Enum posibles, byte x) {
		byte numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaByte();
				if (numero < x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaByte();
				if (numero > x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaByte();
				if (numero <= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaByte();
				if (numero >= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}

	public static short parametros (Enum posibles, short x) {
		short numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaShort();
				if (numero < x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaShort();
				if (numero > x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaShort();
				if (numero <= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaShort();
				if (numero >= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}

	public static long parametros (Enum posibles, long x) {
		long numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaLong();
				if (numero < x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaLong();
				if (numero > x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaLong();
				if (numero <= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaLong();
				if (numero >= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}
	
	public static float parametros (Enum posibles, float x) {
		float numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaFloat();
				if (numero < x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaFloat();
				if (numero > x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaFloat();
				if (numero <= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaFloat();
				if (numero >= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}

	public static double parametros (Enum posibles, double x) {
		double numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaDouble();
				if (numero < x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaDouble();
				if (numero > x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaDouble();
				if (numero <= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaDouble();
				if (numero >= x) {
					System.out.println("Error, numero incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}

	
/* - Crear 6 funciones, una de cada tipo para leer un número que debe estar entre un valor máximo y mínimo,
 * también usando sobrecarga para que se llamen igual.
 * - Crear un enum para enumerar las distintas opciones que tendrá el programa, serán: máximo incluido y mínimo incluido, ambos excluidos,
 * máximo incluido y mínimo excluido y máximo excluido y mínimol incluido.
 * - Si el valor mínimo es mayor que el máximo se lanzará la excepción "IllegalArgumentException();".
 * - Si el número no está entre el rango pedido, lanzar un error hasta que introduzca un número válido. 
 * - Repetir el proceso con un tipo byte, short, long, float y double.
 */
// Lectura de un número entre el valor mínimo y máximo 	
	
	public static int lecturaminmax (Enum2 valor, int x, int y) {
		int numero=0;
		if (x > y) {
			throw new IllegalArgumentException();
		}
		if (valor == Enum2.AMBOSINC) {
			do {
			numero = lecturaInt();
			if (numero < x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero > y);
		}
		
		else if (valor == Enum2.AMBOSEXC) {
			do {
			numero = lecturaInt();
			if (numero <= x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero >= y);
		}
		else if (valor == Enum2.MINEXC) {
			do {
			numero = lecturaInt();
			if (numero <= x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero > y);
		}
		else if (valor == Enum2.MININC) {
			do {
			numero = lecturaInt();
			if (numero < x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero >= y);
		}
		
		return numero; 
	}
	
	public static byte lecturaminmax (Enum2 valor, byte x, byte y) {
		byte numero=0;
		if (x > y) {
			throw new IllegalArgumentException();
		}
		if (valor == Enum2.AMBOSINC) {
			do {
			numero = lecturaByte();
			if (numero < x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero > y);
		}
		
		else if (valor == Enum2.AMBOSEXC) {
			do {
			numero = lecturaByte();
			if (numero <= x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero >= y);
		}
		else if (valor == Enum2.MINEXC) {
			do {
			numero = lecturaByte();
			if (numero <= x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero > y);
		}
		else if (valor == Enum2.MININC) {
			do {
			numero = lecturaByte();
			if (numero < x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero >= y);
		}
		
		return numero; 
	}
	
	public static short lecturaminmax (Enum2 valor, short x, short y) {
		short numero=0;
		if (x > y) {
			throw new IllegalArgumentException();
		}
		if (valor == Enum2.AMBOSINC) {
			do {
			numero = lecturaShort();
			if (numero < x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero > y);
		}
		
		else if (valor == Enum2.AMBOSEXC) {
			do {
			numero = lecturaShort();
			if (numero <= x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero >= y);
		}
		else if (valor == Enum2.MINEXC) {
			do {
			numero = lecturaShort();
			if (numero <= x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero > y);
		}
		else if (valor == Enum2.MININC) {
			do {
			numero = lecturaShort();
			if (numero < x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero >= y);
		}
		
		return numero; 
	}
	
	public static long lecturaminmax (Enum2 valor, long x, long y) {
		long numero=0;
		if (x > y) {
			throw new IllegalArgumentException();
		}
		if (valor == Enum2.AMBOSINC) {
			do {
			numero = lecturaLong();
			if (numero < x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero > y);
		}
		
		else if (valor == Enum2.AMBOSEXC) {
			do {
			numero = lecturaLong();
			if (numero <= x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero >= y);
		}
		else if (valor == Enum2.MINEXC) {
			do {
			numero = lecturaLong();
			if (numero <= x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero > y);
		}
		else if (valor == Enum2.MININC) {
			do {
			numero = lecturaLong();
			if (numero < x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero >= y);
		}
		
		return numero; 
	}
	 
	public static float lecturaminmax (Enum2 valor, float x, float y) {
		float numero=0;
		if (x > y) {
			throw new IllegalArgumentException();
		}
		if (valor == Enum2.AMBOSINC) {
			do {
			numero = lecturaFloat();
			if (numero < x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero > y);
		}
		
		else if (valor == Enum2.AMBOSEXC) {
			do {
			numero = lecturaFloat();
			if (numero <= x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero >= y);
		}
		else if (valor == Enum2.MINEXC) {
			do {
			numero = lecturaFloat();
			if (numero <= x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero > y);
		}
		else if (valor == Enum2.MININC) {
			do {
			numero = lecturaFloat();
			if (numero < x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero >= y);
		}
		
		return numero; 
	}
	
	public static double lecturaminmax (Enum2 valor, double x, double y) {
		double numero=0;
		if (x > y) {
			throw new IllegalArgumentException();
		}
		if (valor == Enum2.AMBOSINC) {
			do {
			numero = lecturaDouble();
			if (numero < x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero > y);
		}
		
		else if (valor == Enum2.AMBOSEXC) {
			do {
			numero = lecturaDouble();
			if (numero <= x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero >= y);
		}
		else if (valor == Enum2.MINEXC) {
			do {
			numero = lecturaDouble();
			if (numero <= x || numero > y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero <= x || numero > y);
		}
		else if (valor == Enum2.MININC) {
			do {
			numero = lecturaDouble();
			if (numero < x || numero >= y) {
				System.out.println("Incorrecto, introduzca un número válido: ");
			}
			} while (numero < x || numero >= y);
		}
		
		return numero; 
	}

/* - Crear una función boolean en la cual habrá que pedirle al usuario que introduzca "1" o "2"
 * - Si la opción es 1, habrá que devolver un true, si es 2 un false.
 * - Si el usuario introduce un número mayor de 2 o menor de 1, escribir un mensaje de error que indique que introduzca un número válido y
 *  volverlo a pedir.
 *  - Si introduce un carácter que no sea un número, que salte una excepción indicando que introduzca una opción válida.
 */

	
	public static boolean lecturaBoolean (String opcion1, String opcion2) {
		boolean opcion = true, error = false;
		do {
			error = false;
		
		if (opcion1.equals("1")) {
			opcion = true;
		}
		else if (opcion1.equals("2")) {
			opcion = false;
		}
		else {
			System.out.println("Introduce un carácter valido: ");
			error = true;
		}
		} while (error == true);
				
		return opcion;
	}
	
	public static boolean lecturaBoolean () {
		boolean devuelve = true, error = false;
		String respuesta;
		do {
			error = false;	
		respuesta = lecturaString();
		if (respuesta.equals("s") || respuesta.equals("S")) {
			devuelve=true;
		}
		else if(respuesta.equals("n") || respuesta.equals("N")) {
			devuelve=false;
		}
		else {
			System.out.println("Introduce un carácter valido");
			error = true;
		}
		} while (error == true);
		return devuelve;
	}

	public static void main(String[] args) {

	/*System.out.println("Mete un nï¿½mero mayor o igual que 15");
	parametros(Enum.MAYORIGUAL, 15);
/*
		
		/*System.out.println("Introduce un número entre 0 y 10");
		lecturaminmax(Enum2.AMBOSINC, 0, 10);
*/
		System.out.println("Introduz*");
		lecturaBoolean(); 
	}
	


}
