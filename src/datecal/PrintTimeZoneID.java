package datecal;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timezone);
		System.out.println(now.get(Calendar.HOUR));
		
		String[] ids = TimeZone.getAvailableIDs();
		for (String id : ids) {
			// System.out.println(id);
		}

	}

}
