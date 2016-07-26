package Caesar;

import java.util.Scanner;

public class CipherApp {
	public static void main(String[] args) {
		Cipher cipher = new Cipher();
		int entry = -1;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.println("\tCAESAR CIPHER");
		System.out.println("\t_____________");
		System.out.println();
		System.out.println("Encryption or Decryption");
		System.out.println();
		System.out.println("0 for Encryption");
		System.out.println("1 for Decryption");
		entry = keyboard.nextInt();
		
		if (entry == 0){
			System.out.println("Please enter the message you'd like to encrypt: ");
			
			cipher.encrypt();
		}
		if (entry == 1){
			System.out.println("Please enter the message you'd like to decrypt: ");
			cipher.decrypt();
		}
		
		cipher.setMessage("shitdemon");
		
		cipher.setShift(5);
		
		cipher.encrypt();
		
		System.out.println(cipher.getEncryptedMessage());
		
	}
	public static String keyboardInput(){
		
	}
}
