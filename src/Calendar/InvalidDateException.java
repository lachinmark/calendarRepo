package Calendar;

public class InvalidDateException extends Exception {
	
	//#6
	
	//message1 will be initialized when called
	public InvalidDateException (String message1) {
		super(message1);
	}

	public InvalidDateException() {
		super("Invalid Time");
	}
}
