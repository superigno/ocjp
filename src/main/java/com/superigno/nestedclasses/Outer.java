package com.superigno.nestedclasses;

public class Outer {
	
	static class Inner {		
	}
	
	class Inner2 {				
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//static
		Outer.Inner in = new Inner(); //or
		Inner in2 = new Inner();		
		
		//non-static
		Outer.Inner2 inn = new Outer().new Inner2(); //or
		Inner2 inn2 = new Outer().new Inner2();
	}
}