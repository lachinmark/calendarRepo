package Calendar;

public class Meeting extends Event{
	
	public String host;
	
	public Meeting(String description, Date date, Time time, String location, String host) {
		super(description, date, time, location);
		this.host = host;
	}
	
	public Meeting() {
		
	}

	public String getHost() {
		return host;
	}
	
	public void setHost(String host) {
		this.host = host;
	}
	
	public String toString() {
		return super.getDescription() + "\n" + super.getDate() + "\n" + super.getTime() + "\n" + super.getLocation() + "\n" + this.host;
	}
	
}
