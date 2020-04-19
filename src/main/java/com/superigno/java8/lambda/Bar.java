package com.superigno.java8.lambda;

public class Bar implements IFoo {

	@Override
	public void foo(String a, String b) {
		System.out.println("Hello using interface implementation: "+a+" and "+b);
	}

}
