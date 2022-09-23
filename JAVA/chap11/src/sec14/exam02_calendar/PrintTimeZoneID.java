package sec14.exam02_calendar;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}

	}

}
