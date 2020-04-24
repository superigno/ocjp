package com.superigno.java8.interfaces;

/*
 * From practice question #27 of Chapter 4 of 1Z0-808 pdf
 * */

interface Climb {
	boolean isTooHigh(int height, int limit);
}

public class Climber {
	
	public static void main(String[] args) {
		//check((h, l) -> h.append(l).isEmpty(), 5); //from book
		check((h, l) -> {
		
			System.out.println(h); // -hirap intindihin pano naset! -g1q
			System.out.println(l);
			return false;
			
		}, 5); //sample right answer
	}

	private static void check(Climb climb, int height) {
		if (climb.isTooHigh(height, 10))
			System.out.println("too high");
		else
			System.out.println("ok");
	}
	
}