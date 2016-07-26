package Caesar;

import java.util.Scanner;

public class CipherApp {
	public static void main(String[] args) {
		Cipher cipher = new Cipher();
		String message = "";
		int shift = -1;
		boolean run = true;
		
		Scanner keyboard = new Scanner(System.in);
		do {
			switch (menu(keyboard)) {
			case 0:
				message = promptForMsg(keyboard, "Please enter the message you'd like to encrypt: ");
				shift = promptForShift(keyboard, "Enter your shift amount: ");
				cipher.crypt(message, shift, "En");
				break;
			case 1:
				message = promptForMsg(keyboard, "Please enter the message you'd like to decrypt: ");
				shift = promptForShift(keyboard, "Enter the shift amount that was used to encrypt: ");
				cipher.crypt(message, -shift, "De");
			default:
				System.out.println("Goodbye.");
				run = false;
				break;
			}
		} while (run);
	}
	
	public static int menu(Scanner sc) {
		int choice = -1;
		System.out.println("\tCAESAR CIPHER");
		System.out.println("\t_____________");
		System.out.println();
		System.out.println("Encryption or Decryption");
		System.out.println();
		System.out.println("Enter 0 for Encryption");
		System.out.println("Enter 1 for Decryption");
		System.out.println("Any other key to quit.");
		System.out.print("Your choice: ");
		choice = Integer.parseInt(sc.nextLine());
		return choice;
	}
	
	public static String promptForMsg(Scanner sc, String str) {
		System.out.print(str);
		return sc.nextLine();
	}
	
	public static int promptForShift(Scanner sc, String str) {
		int shift = 0;
		System.out.print(str);
		shift = Integer.parseInt(sc.nextLine());
		return shift;
	}
}
