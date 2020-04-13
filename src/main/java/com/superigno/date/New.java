package com.superigno.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class New {

	// java.time dates are Immutable!
	public static void main2(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(new Date());
	}

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		performAnimalEnrichment(start, end, period);
	}

	private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) { // uses the generic
																									// period
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("give new toy: " + upTo);
			upTo = upTo.plus(period); // adds the period - benefits is you can reuse the method using the generic period, be it months, days, years (see below) excluding time (use Duration) -g1q
		}
	}
	
	/*
	 *  Period annually = Period.ofYears(1); // every 1 year
	 *	Period quarterly = Period.ofMonths(3); // every 3 months
	 *	http://freepdf-books.com
	 *	Working with Dates and Times 147
	 *	Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
	 *	Period everyOtherDay = Period.ofDays(2); // every 2 days
	 *	Period everyYearAndAWeek = Period.of(1, 0, 7);
	 * 
	 * */

}
