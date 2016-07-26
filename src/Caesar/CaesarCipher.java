package Caesar;

//import java.util.Scanner;

public class CaesarCipher {
	public static char shiftLetter (char c, int n) {
		int u=c;
			
		if (! Character.isLetter(c))
			return c;
			
			u=u+n;
			if (Character.isUpperCase(c) && u>'Z'
				|| Character.isLowerCase(c) && u> 'z') {
					u-= 26;
				}
				if (Character.isUpperCase(c) && u<'A'
					|| Character.isLowerCase(c) && u < 'a' ){
						u += 26;
				}
				
				return (char)u;
		}
}
		
//	public static void main(String[]args) throws Exception {
//		Scanner keyboard = new Scanner(System.in);
//		String message, cipher = "";
//		
//		int shift;
//		
//		System.out.println("Would you like to code a message? (Y/N)");
//		String response = keyboard.nextLine();
//		if (response.endsWith("Y")){
//		
//			System.out.println("Enter your message: ");
//			System.out.println();
//			message = keyboard.nextLine();
//			System.out.print("Shift (0=26): ");
//			shift = keyboard.nextInt();
//			
//			keyboard.close();
//			
//			
//			for (int i=0; i<message.length(); i++) {
//			cipher += shiftLetter(message.charAt(i), shift);
//			}
//			System.out.println( cipher );
//		}
//	}
//}
//
