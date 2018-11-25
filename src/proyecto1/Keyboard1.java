package proyecto1;

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
	
	public static void main(String[] args) {

	
		
	}

}
