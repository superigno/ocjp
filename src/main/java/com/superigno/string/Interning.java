package com.superigno.string;

public class Interning {

	// from https://www.geeksforgeeks.org/interning-of-string/

	public static void main(String[] args) {
		
		// S1 refers to Object in the Heap Area
		String s1 = new String("GFG"); // creates "GFG" in SCP in the heap, and ANOTHER object of "GFG" in the heap (outside SCP)! -g1q

		// S2 refers to Object in SCP Area (string connection pool -g1q)
		String s2 = s1.intern();

		// Comparing memory locations
		// s1 is in Heap
		// s2 is in SCP
		System.out.println(s1 == s2); //false

		// Comparing only values
		System.out.println(s1.equals(s2)); //true

		// S3 refers to Object in the SCP Area
		String s3 = "GFG"; 

		System.out.println(s2 == s3); //true
	}

}
