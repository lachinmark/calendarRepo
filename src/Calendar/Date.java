package Calendar;

public class Date {

	private int day;
	private int month;
	private int year;
	
	//in class variables should be private, with getters and setters control what can be just get and set and what just set or get
	
	//parameterized constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date() {
		
	}
	
	//getter - accessor
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	//setter - mutator
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
}
