package Calendar;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		date.setDay(2);
		System.out.println(date.getDay());
		
		InvalidDateException test = new InvalidDateException();
		System.out.println(test);
		
		InvalidDateException test1 = new InvalidDateException("Famous person");
		System.out.println(test1);
		
		int day = 2;
		System.out.println(day);
	}

}
