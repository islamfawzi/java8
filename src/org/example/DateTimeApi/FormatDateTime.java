package org.example.DateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class FormatDateTime {

	public static void main(String[] args) {

		/** Date **/
		
		LocalDate currentDate = LocalDate.now();
		
		// the default formater
		DateTimeFormatter df = DateTimeFormatter.ISO_DATE;
		System.out.println(df.format(currentDate));
		
		
		/** TIme **/
		
		LocalTime currentTime = LocalTime.now();
		
		DateTimeFormatter tf = DateTimeFormatter.ISO_TIME;
		System.out.println(tf.format(currentTime));
		
		
		/** DateTime **/
		
		LocalDateTime currentDateTime = LocalDateTime.now();
		
		DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println(dtf.format(currentDateTime));
		
		DateTimeFormatter f_long = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(f_long.format(currentDateTime));
		
		DateTimeFormatter f_short = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(f_short.format(currentDateTime));
		
		/** Using Locale **/
		
		String fr_short = f_short.withLocale(Locale.FRENCH).format(currentDateTime);
		String fr_long = f_long.withLocale(Locale.FRENCH).format(currentDateTime);
		System.out.println(fr_short);
		System.out.println(fr_long);
		
		/** Custom Formatter **/
		DateTimeFormatterBuilder b = new DateTimeFormatterBuilder()
				.appendValue(ChronoField.MONTH_OF_YEAR)
				.appendLiteral(".")
				.appendValue(ChronoField.DAY_OF_MONTH)
				.appendLiteral(".")
				.appendValue(ChronoField.YEAR);
		
		DateTimeFormatter f = b.toFormatter();
		System.out.println(f.format(currentDateTime));
		
		
	}

}
