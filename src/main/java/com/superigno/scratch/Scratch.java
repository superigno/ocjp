package com.superigno.scratch;

public class Scratch {
	
	public static void main(String[] args) {
	
		String workStationId = "12345678";
		String s = workStationId.substring( 0, 2 ) + workStationId.substring( 5 );
		
		System.out.println(s);
	}

}
