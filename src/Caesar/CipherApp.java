package Caesar;

import java.util.Scanner;

public class CipherApp {
	public static void main(String[] args) {
		Cipher cipher = new Cipher();
		int entry = -1;
		String message = "";
		int shift = 0;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("\tCAESAR CIPHER");
		System.out.println("\t_____________");
		System.out.println();
		System.out.println("Encryption or Decryption");
		System.out.println();
		System.out.println("0 for Encryption");
		System.out.println("1 for Decryption");
		entry = keyboard.nextInt();
		keyboard.nextLine();
		
		if (entry == 0){
			System.out.println("Please enter the message you'd like to encrypt: ");
			System.out.println();
			message = keyboard.nextLine();
			System.out.println("Enter your shift amount: ");
			shift = keyboard.nextInt();

			cipher.encrypt(message, shift);
//			System.out.println(cipher.getEncryptedMessage());
		}
		if (entry == 1){
			System.out.println("Please enter the message you'd like to decrypt: ");
			System.out.println();
			message = keyboard.nextLine();
			System.out.println("Enter the shift amount: ");
			shift = keyboard.nextInt();
			cipher.decrypt(message, shift);
		}
		
	}
}
