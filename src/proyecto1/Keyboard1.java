package proyecto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard1 {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void closeKeyboard() {
		keyboard.close();
	}

// Creación de enum
	public enum Enum{ MAYORIGUAL, MENORIGUAL, MAYOR, MENOR}

// Lectura de un carácter
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
	
// Lectura de un número cualquiera para cada tipo
	
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
			System.out.println("Error, introduce un número: ");
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
				System.out.println("Error, introduce un número: ");
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
			System.out.println("Error, introduce un número: ");
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
			System.out.println("Error, introduce un número: ");
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
			System.out.println("Error, introduce un número: ");
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
			System.out.println("Error, introduce un número : ");
		}
		} while(y);
		return x;
	}
	
// Parámetros
	
	public static int parametros (Enum posibles, int x) {
		int numero = 0;
		if (posibles == Enum.MAYORIGUAL) {
			do {
				numero = lecturaInt();
				if (numero < x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaInt();
				if (numero > x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaInt();
				if (numero <= x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaInt();
				if (numero >= x) {
					System.out.println("Error, número incorrecto");
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
					System.out.println("Error, número incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaByte();
				if (numero > x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaByte();
				if (numero <= x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaByte();
				if (numero >= x) {
					System.out.println("Error, número incorrecto");
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
					System.out.println("Error, número incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaShort();
				if (numero > x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaShort();
				if (numero <= x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaShort();
				if (numero >= x) {
					System.out.println("Error, número incorrecto");
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
					System.out.println("Error, número incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaLong();
				if (numero > x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaLong();
				if (numero <= x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaLong();
				if (numero >= x) {
					System.out.println("Error, número incorrecto");
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
					System.out.println("Error, número incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaFloat();
				if (numero > x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaFloat();
				if (numero <= x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaFloat();
				if (numero >= x) {
					System.out.println("Error, número incorrecto");
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
					System.out.println("Error, número incorrecto");
				}
			} while (numero < x);
		}
		else if (posibles == Enum.MENORIGUAL) {
			do {
				numero = lecturaDouble();
				if (numero > x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero > x);
		}
		else if (posibles == Enum.MAYOR) {
			do {
				numero = lecturaDouble();
				if (numero <= x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero <= x);
		}
		else if (posibles == Enum.MENOR) {
			do {
				numero = lecturaDouble();
				if (numero >= x) {
					System.out.println("Error, número incorrecto");
				}
			} while (numero >= x);
		}
		return numero;
	}
	
	public static void main(String[] args) {

	System.out.println("Mete un número mayor o igual que 15");
	parametros(Enum.MAYORIGUAL, 15);
		
	}

}
