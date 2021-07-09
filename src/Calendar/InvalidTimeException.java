package Calendar;

public class InvalidTimeException extends Exception{
	
	//#7
	
	public InvalidTimeException(String message) {
		super(message);
	}

	public InvalidTimeException() {
		super("Invalid Time");
	}
}
