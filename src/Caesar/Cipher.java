package Caesar;

public class Cipher {
	private int shiftAmount;
	private String message;
	private String encryptedMessage;
	
	public void encrypt() {
		//String msg;
		for (int i = 0; i < message.length(); i++) {
			encryptedMessage += (char)(message.charAt(i) + shiftAmount);
		}
		System.out.println(encryptedMessage);
	}
	
//	public void decrypt() {
//		
//	}
	
	public void setMessage(String msg) {
		message = msg;
	}
	
	public void setShift(int shift) {
		shiftAmount = shift;
	}
	
}
