package Caesar;

public class Cipher {
	private int shiftAmount;
	private String message;
	private String shiftedMessage = "";
	
	// made this into one somewhat ugly method since both were doing the same thing anyway.
	// Pass a "De" or "En" to the method to print the correct direction of change.
	public void crypt(String msg, int shift, String whichWay) {
		message = msg.toLowerCase();
		shiftAmount = shift;		
		for (int i = 0; i < message.length(); i++) {
			char current = message.charAt(i);
			if (!Character.isLetterOrDigit(current)) {
				shiftedMessage += current;
			} else if ((current + shiftAmount ) > 'z') {
				shiftedMessage += (char)(current + (shiftAmount-26));
			} else if ((current + shiftAmount) < 'a') {
				shiftedMessage += (char)(current + (shiftAmount+26));
			} else {
				shiftedMessage += (char)(current + shiftAmount);
			}
		}
		System.out.println("Starting Message: " + message);
		System.out.println(whichWay + "crypted message: " + shiftedMessage);
	}
	
	
//	public void decrypt(String msg, int shift) {
//		for (int i = 0; i < msg.length(); i++) {
//			decryptedMessage += (char)(msg.charAt(i) - shift);
//		}
//		System.out.println(decryptedMessage);
//	}	
}
