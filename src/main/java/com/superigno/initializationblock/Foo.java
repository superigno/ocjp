package com.superigno.initializationblock;

public class Foo extends Init {
	
	Foo() {
		System.out.println("foo no-arg const");
	}

	static {
		System.out.println("foo 1st static init");
	}
	
	{
		System.out.println("foo 1st instance init");
	}
	
	{
		System.out.println("foo 2nd instance init");
	}
	
	static {
		System.out.println("foo 2nd static init");
	}

	public static void main(String[] args) {
		new Foo();
	}

}
