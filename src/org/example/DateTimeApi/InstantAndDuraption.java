package org.example.DateTimeApi;

import java.time.Duration;
import java.time.Instant;

public class InstantAndDuraption {

	public static void main(String[] args) throws InterruptedException {

		/** Instance **/
		
		// current moment
		Instant start = Instant.now();
		System.out.println(start);
		
		Thread.sleep(1000);
		
		Instant end = Instant.now();
		System.out.println(end);
		
		/** Duration **/
		
		// duration between two instants
		Duration elapsed = Duration.between(start, end);
		System.out.println("Elapsed in sec: " + elapsed);
		System.out.println("Elapsed in milliSec: " + elapsed.toMillis());
	}

}
