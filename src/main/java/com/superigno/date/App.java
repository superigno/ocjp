package com.superigno.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		System.out.println("Date1: "+d);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Date2: "+c.getTime());
		
		System.out.println("Time in long from Jan 1, 1970: "+d.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String stringDate = sdf.format(new Date());
		System.out.println("Date: "+stringDate);
		
		Date parsedDate = sdf.parse(stringDate);
		
		System.out.println("Parsed: "+parsedDate);
		
	}
	
}
