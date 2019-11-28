package com.superigno.date;

import java.util.Calendar;
import java.util.Date;

public class App {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println("Date1: "+d);
		
		Calendar c = Calendar.getInstance();
		System.out.println("Date2: "+c.getTime());
		
		System.out.println("Time in long from Jan 1, 1970: "+d.getTime());
		
	}
	
}
