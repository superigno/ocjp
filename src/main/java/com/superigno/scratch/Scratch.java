package com.superigno.scratch;

import java.util.Arrays;

public class Scratch {

	public static void main(String[] args) {

		String [] bugs = { "cricket", "beetle", "ladybug" };
		String [] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
		
		int [] i = {1,2,3};
		System.out.println(i.toString());
		Arrays.sort(bugs);
		
	}

}
