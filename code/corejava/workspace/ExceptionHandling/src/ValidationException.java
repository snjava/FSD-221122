
public class ValidationException extends Exception {

	String message;
	
	public ValidationException(String message) {
		this.message = message;
	}
	
	public void printErrorMessage() {
		System.out.println("Exception Message is : " + message);
	}
}
