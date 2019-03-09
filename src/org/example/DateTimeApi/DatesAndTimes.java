package org.example.DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatesAndTimes {

	public static void main(String[] args) {

		/** Date **/ 
		
		// current date
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		// in old DateTime api we used zero index for months
		// in new DateTime api we will use 1 for Jan and so on..
		LocalDate specificDate = LocalDate.of(1990, 10, 8);
		System.out.println(specificDate);
		
		/** Time **/ 
		
		// 24h is the default
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		LocalTime specificTime = LocalTime.of(14, 30, 20);
		System.out.println(specificTime);
		
		
		/** DateTime **/
		
		
		// Long format ISO DateTime
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDateTime specficDateTime = LocalDateTime.of(specificDate, specificTime);
		System.out.println(specficDateTime);
	}

}
