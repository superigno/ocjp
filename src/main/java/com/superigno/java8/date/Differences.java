package com.superigno.java8.date;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Differences {
	
	//https://stackoverflow.com/questions/48942916/difference-between-utc-and-gmt/53909040#53909040
	
	public static void main(String[] args) {
		
		Instant instant = Instant.now();
		System.out.println(instant);
		
		OffsetDateTime offset = OffsetDateTime.now();
		System.out.println(offset);
		
		ZonedDateTime zoned = ZonedDateTime.now();
		System.out.println(zoned);
		
		ZonedDateTime zoned2 = ZonedDateTime.now(ZoneId.of("Pacific/Auckland"));
		System.out.println(zoned2);
		
		//LocalDateTime is not a MOMENT, a moment is a specific point in the timeline, based on the epoch
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
	}

}
