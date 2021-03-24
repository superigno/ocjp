package com.superigno.primitives;

public class Foo {
	
	/*
	 *  boolean   	-   1-bit						-> 		true or false
	 *	byte 		-	8-bit integral				->		-128 to 127  (2 to the 8th = 256 = total of 256 digits from -128 to 127 plus the 0)
	 *	short 		- 	16-bit integral				->		-32768 to 32767
	 *	int 		-	32-bit integral				->		-2147483648 to 2147483647
	 *	long 		-	64-bit integral				->		-9223372036854775808 to 9223372036854775807
	 *	float 		-	32-bit floating-point				
	 *	double 		-	64-bit floating-point			    
	 *	char 		-	16-bit Unicode
	 * 
	 * */
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807L; //need to add L since it is int by default
		
		Byte b2 = Byte.MAX_VALUE;
		Short s2 = Short.MAX_VALUE;
		Integer i2 = Integer.MAX_VALUE;
		Long l2 = Long.MAX_VALUE;
				
		System.out.println(b==b2);
		System.out.println(s==s2);
		System.out.println(i==i2);
		System.out.println(l==l2);	
		
		double d = 1.0;
		float f = 1.0F; //need to add F since it is double by default
		
	}

}
