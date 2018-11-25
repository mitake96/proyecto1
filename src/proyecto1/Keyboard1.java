package proyecto1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard1 {

	static Scanner keyboard = new Scanner(System.in);
	
	public static void closeKeyboard() {
		keyboard.close();
	}
	
	public static char lecturaCaracter() {
		char x = ' ';
		x=keyboard.next().charAt(0);
		
		return x;
	}
	
	public static String lecturaString() {
		
		String x = "";
		x=keyboard.next();
		return x;
	}
	
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
	
	public static void main(String[] args) {

	System.out.println("Introduce un número: ");
	lecturaInt();
		
	}

}
