package com.superigno.java8.interfaces;

// ALL interface methods are marked public! -g1q
// ALL interface variables are marked public final static! -g1q

public interface IFoo {
	
	default void test() {
		System.out.println("Testing default method in interface");
	}
	
	static void testStatic() {
		System.out.println("Testing static method in interface");
	}

}
