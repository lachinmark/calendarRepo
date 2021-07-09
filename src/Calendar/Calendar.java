package Calendar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
	
	List<Event> list1;	//inheretnce - both meeting and appnt classes are inhereted Event class, which is used as data type here
	
	int count;

	
	public Calendar() {
		list1 = new ArrayList<>(100);
		count = 0;
	}
	
	public Calendar(String filename) throws IOException {
		list1 = new ArrayList<>(100);
		count = 0;
		loadFromFile(filename);
	}
	
	public void loadFromFile(String filename) throws IOException {
		File f = new File("C:\\Users\\Rasim\\Downloads\\Question 2\\Question 2\\event.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String st;
		while((st=br.readLine())!=null) {
			if(st.equals("appointment")) {
				String dateFromFile = br.readLine();
				String[] dateArray = dateFromFile.split("/");
				int day = Integer.parseInt(dateArray[0]);
				int month = Integer.parseInt(dateArray[1]);
				int year = Integer.parseInt(dateArray[2]);
				Date date = new Date(day,month,year);
				String timeFromFile = br.readLine();
				String[] timeArray = timeFromFile.split(":");
				int hour = Integer.parseInt(timeArray[0]);
				int minute = Integer.parseInt(timeArray[1]);
				Time time = new Time(hour,minute);
				String location = br.readLine();
				String description = br.readLine();
				String contact = br.readLine();
				Appointment a = new Appointment(description,date,time,location,contact);
				list1.add(a);
			}
			else if (st.equals("meeting")) {
				String dateFromFile = br.readLine();
				String[] dateArray = dateFromFile.split("/");
				int day = Integer.parseInt(dateArray[0]);
				int month = Integer.parseInt(dateArray[1]);
				int year = Integer.parseInt(dateArray[2]);
				Date date = new Date(day,month,year);
				String timeFromFile = br.readLine();
				String[] timeArray = timeFromFile.split(":");
				int hour = Integer.parseInt(timeArray[0]);
				int minute = Integer.parseInt(timeArray[1]);
				Time time = new Time(hour,minute);
				String location = br.readLine();
				String description = br.readLine();
				String host = br.readLine();
				Meeting m = new Meeting(description,date,time,location,host);
				list1.add(m);
			}
		}
	}
	
	public Event findEvent(String d) {
		for(int i = 0;i<list1.size();i++) {
			String x = list1.get(i).getDescription();
			if(x.equals(d)) {
				return list1.get(i);
			}
		}
		return null;
	}
	
	public boolean addEvent(Event e) {
		list1.add(e);
		return true;
	}
	
	//Hello
	//One more line
	
	public boolean removeEvent(Event e) {
		boolean status = list1.remove(e);
		return status;
	}
	
	public void viewAllEvent() {
		for(int i = 0;i<list1.size();i++) {
			System.out.println(list1.get(i).getDescription());
			System.out.println(list1.get(i).getDate());
			System.out.println(list1.get(i).getTime());
			System.out.println(list1.get(i).getLocation());
			//System.out.println(list1.get(i).   ==> Contact and Host??
		}
	}
	
	public void sortEvent() {
		
	}
	
	public void saveToFile(String filename) {
		
	}
	
}
