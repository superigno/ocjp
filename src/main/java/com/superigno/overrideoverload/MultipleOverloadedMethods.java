package com.superigno.overrideoverload;

public class MultipleOverloadedMethods {
	
	/*  Rules:
	 *  - Exact match by type
	 *  - Converting to a larger primitive type (widen -g1q)
	 *  - Converting to an autoboxed type
	 *  - Matching a superclass type  
     *  - Varargs 
	 * 
	 * */
	
	public static void main(String[] args) {
		MultipleOverloadedMethods o = new MultipleOverloadedMethods();
		int i = 1;
		Integer in = 1;
		Long l = 1L;
		o.test(i);		
		o.test(in);
		o.test(l);
	}

	public void test(Number i) {
		System.out.println("Number");
	}
	
	public void test(Long i) {
		System.out.println("Long");		
	}
	
	public void test(long i) {
		System.out.println("long");		
	}
	
	public void test(Object i) {
		System.out.println("Object");
	}
	
	public void test(int... i) {
		System.out.println("vararg");
	}
}
