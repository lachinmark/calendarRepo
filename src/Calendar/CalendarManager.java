package Calendar;

import java.io.IOException;
import java.util.Scanner;

public class CalendarManager {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Calendar myCalendar = new Calendar("event.txt");
		//myCalendar.loadFromFile();

		while (true) {
			System.out.println("1. Find an event with a given description");
			System.out.println("2. Add a new event");
			System.out.println("3. Remove an existing event");
			System.out.println("4. View all events");
			System.out.println("5. Sort events");
			System.out.println("6. Quit the program");
			System.out.println("Enter your choice");

			Scanner input = new Scanner(System.in);
			int response = input.nextInt();

			switch(response) {
			case 1:
				System.out.println("Enter description:");
				String description = input.next();
				Event e = myCalendar.findEvent(description);
				if(e!=null) {
					System.out.println(e);
				}
				else {
					System.out.println("Event not found.");
				}
				break;
			case 2:
				System.out.println("Are you trying to create an Appointment or Meeting event?");
				String eventRet = input.next();
				if (eventRet.equalsIgnoreCase("Appointment")) {
					System.out.println("Enter Appointment's attributes. Enter description:");
					String description1 = input.next();
					System.out.println("Enter date in format 'dd/mm/yyyy':");
					String dateString = input.next();
					String[] dateArray = dateString.split("/");
					int day = Integer.parseInt(dateArray[0]);
					int month = Integer.parseInt(dateArray[1]);
					int year = Integer.parseInt(dateArray[2]);
					Date date = new Date(day,month,year);
					System.out.println("Enter time in format 'hh:mm':");
					String timeString = input.next();
					String[] timeArray = timeString.split(":");
					int hour = Integer.parseInt(timeArray[0]);
					int minute = Integer.parseInt(timeArray[1]);
					Time time = new Time(hour,minute);
					System.out.println("Enter location:");
					String location = input.next();
					System.out.println("Enter contact:");
					String contact = input.next();
					Appointment a = new Appointment(description1,date,time,location,contact);
					myCalendar.addEvent(a);
				}
				else if (eventRet.equalsIgnoreCase("Meeting")){
					System.out.println("Enter Meeting's attributes:");
				}
				else {
					System.out.println("Invalid entry.");
				}
				
			case 3:
				System.out.println("Enter event description to remove");
				String description1 = input.nextLine();
				Event findEvent = myCalendar.findEvent(description1);
				boolean status = myCalendar.removeEvent(findEvent);
				if(status == true) {
					System.out.println("Deletion succesfull");
				}
				else {
					System.out.println("Deletion unsuccesfull");
				}
				break;
			case 4:
				myCalendar.viewAllEvent();
				break;
			case 5:
				myCalendar.sortEvent();
				break;
			case 6:
				System.out.println("Finished");
				System.exit(0);
			}

		}

	}


}
