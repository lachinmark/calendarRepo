package Calendar;

public abstract class Event {
	
	private String description;
	private Date date;
	private Time time;
	private String location;
	
	
	public Event(String description, Date date, Time time, String location) {
		this.description = description;
		this.date = date;
		this.time = time;
		this.location = location;
	}
	
		public Event() {
			
		}
	
	//getters
	
	public String getDescription() {
		return description;
	}
	
	public Date getDate() {
		return date;
	}
	
	public Time getTime() {
		return time;
	}

	public String getLocation() {
		return location;
	}
	
	//setters
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setTime(Time time) {
		this.time = time;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String toString() {
		return this.description + "\n" + this.date + "\n" + this.time + "\n" + this.location;
	}
	
}
