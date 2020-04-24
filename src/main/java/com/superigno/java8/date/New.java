package com.superigno.java8.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.util.Date;

public class New {

	/* java.time dates are Immutable! - important! -g1q
	 *
	 *  Period annually = Period.ofYears(1); // every 1 year
	 *	Period quarterly = Period.ofMonths(3); // every 3 months
	 *	Period everyThreeWeeks = Period.ofWeeks(3); // every 3 weeks
	 *	Period everyOtherDay = Period.ofDays(2); // every 2 days
	 *	Period everyYearAndAWeek = Period.of(1, 0, 7);
	 *
	 * */
	
	public static void main(String[] args) {
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(ZonedDateTime.now());
		System.out.println(new Date());
		
		LocalDate start = LocalDate.of(2015, 1, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1); // create a period
		test(start, end, period);
	}
	
	private static void test(LocalDate start, LocalDate end, Period period) { // uses the generic period
		
		System.out.println("Start: "+start);
		System.out.println("End: "+end);
		
		if (start.isBefore(end)) {
			System.out.println("Start is earlier than end!");
		}
		
		LocalDate plus = start.plus(period);
		System.out.println("Start plus Period: "+plus);
		
		LocalDate plusChained = start.plus(period).plus(Period.ofDays(2));
		System.out.println("Start plus LocalDate Chained (this works): "+plusChained);
		
		@SuppressWarnings("static-access")
		LocalDate plusChained2 = start.plus(Period.ofMonths(1).ofDays(2));
		System.out.println("Start plus Period Chained (does not work): "+plusChained2); //Period chaining does not work! It will use the last period you called
		
	}
	

}
