package java_8_features.dateTimeApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

public class DateTimeExample {
	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getMonth());
		System.out.println(ld.getMonthValue());
		System.out.println(ld.getYear());
		System.out.println(ld.getDayOfYear());
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getChronology());
		System.out.println(ld.getEra());
		

		
		LocalTime lt=LocalTime.now();
		System.out.println(lt.getHour()-12);
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		System.out.println(lt.getNano());
		System.out.println(Locale.getDefault());
		
		
		for (String string : ZoneId.getAvailableZoneIds()) {
			System.out.println(string);
		}
		
		ZonedDateTime zdt=ZonedDateTime.now();
		System.out.println(zdt.getZone());
	}
}
