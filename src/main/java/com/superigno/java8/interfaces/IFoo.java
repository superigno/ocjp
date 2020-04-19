package com.superigno.java8.interfaces;

public interface IFoo {
	
	default void test() {
		System.out.println("Testing default method in interface");
	}
	
	static void testStatic() {
		System.out.println("Testing static method in interface");
	}

}
