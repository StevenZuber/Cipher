package Caesar;

public class CipherApp {
	public static void main(String[] args) {
		Cipher cipher = new Cipher();
		
		cipher.setMessage("shitdemon");
		
		cipher.setShift(5);
		
		cipher.encrypt();
		
	}
}
