package org.example.DateTimeApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Set;
import java.util.function.Predicate;

public class TimeZones {

	public static void main(String[] args) {

		DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(f_short.format(dt));
		
		// GMT
		ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT+0"));
		System.out.println(f_short.format(gmt));
		
		// New York
		ZonedDateTime ny = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(f_short.format(ny));
		
		/** Available TimeZones **/
		Set<String> zones = ZoneId.getAvailableZoneIds();
		
		Predicate<String> codition = str -> str.contains("London");
		
//		zones.forEach(z -> System.out.println(z));
		zones.stream().filter(codition).forEach( z -> System.out.println(z));
		
		
	}

}
