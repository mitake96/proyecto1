package proyecto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard1 {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void closeKeyboard() {
		keyboard.close();
	}

// Creacion de primer enum
	public enum Enum{ MAYORIGUAL, MENORIGUAL, MAYOR, MENOR}

// Creacion de segundo enum
	public enum Enum2{ AMBOSINC, AMBOSEXC, MININC, MINEXC}
// Lectura de un caracter
	public static char lecturaCaracter() {
		char x = ' ';
		x=keyboard.next().charAt(0);
		
		return x;
	}
// Lectura de una cadena	
	public static String lecturaString() {
		
		String x = "";
		x=keyboard.next();
		return x;
	}
	
// Lectura de un numero cualquiera para cada tipo
	
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
	
// Lectura de un número >, < o igual de un valor pasado como parámetro
	
	public static int parametros (Enum posibles, int x) {
		int numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaInt();
				if (numero < x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaInt();
				if (numero > x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaInt();
				if (numero <= x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaInt();
				if (numero >= x) {
					System.out.println("Error, nï¿½mero incorrecto");
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
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaByte();
				if (numero > x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaByte();
				if (numero <= x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaByte();
				if (numero >= x) {
					System.out.println("Error, nï¿½mero incorrecto");
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
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaShort();
				if (numero > x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaShort();
				if (numero <= x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaShort();
				if (numero >= x) {
					System.out.println("Error, nï¿½mero incorrecto");
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
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaLong();
				if (numero > x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaLong();
				if (numero <= x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaLong();
				if (numero >= x) {
					System.out.println("Error, nï¿½mero incorrecto");
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
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaFloat();
				if (numero > x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaFloat();
				if (numero <= x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaFloat();
				if (numero >= x) {
					System.out.println("Error, nï¿½mero incorrecto");
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
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaDouble();
				if (numero > x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaDouble();
				if (numero <= x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaDouble();
				if (numero >= x) {
					System.out.println("Error, nï¿½mero incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}

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
	
	public static void main(String[] args) {

	/*System.out.println("Mete un nï¿½mero mayor o igual que 15");
	parametros(Enum.MAYORIGUAL, 15);
	*/
		
		System.out.println("Introduce un número entre 0 y 10");
		lecturaminmax(Enum2.AMBOSINC, 0, 10);
	}

}
