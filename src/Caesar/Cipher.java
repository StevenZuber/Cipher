package Caesar;

public class Cipher {
	private int shiftAmount;
	private String message;
	private String encryptedMessage = "";
	private String decryptedMessage = "";
	
	public void encrypt(String msg, int shift) {
		message = msg;
		shiftAmount = shift;
		for (int i = 0; i < message.length(); i++) {
			encryptedMessage += (char)(message.charAt(i) + shiftAmount);
		}
		System.out.println(encryptedMessage);
	}
	
	
	public void decrypt(String msg, int shift) {
		for (int i = 0; i < msg.length(); i++) {
			decryptedMessage += (char)(msg.charAt(i) - shift);
		}
		System.out.println(decryptedMessage);
	}
//	
//	public void setMessage(String msg) {
//		message = msg;
//	}
//	
//	public void setShift(int shift) {
//		shiftAmount = shift;
//	}
//	public String getEncryptedMessage(){
//		return encryptedMessage;
//	}
//		
}
