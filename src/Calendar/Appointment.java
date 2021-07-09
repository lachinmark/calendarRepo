package Calendar;

public class Appointment extends Event{
	
	public String contact;
	
	public Appointment(String description, Date date, Time time, String location, String contact) {
		
		//super refers to super class(the one we are extending)
		
		super(description, date, time, location);
		this.contact = contact;
	}
	
	public Appointment() {
		
	}
	
	public String getContact() {
		return contact;
	}
	
	public void setContact(String contact) {
		this.contact = contact;
	}

}
