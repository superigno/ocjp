package com.superigno.java8.lambda.predicate;

import java.util.function.Predicate;

public class App {
	
	public static void main(String[] args) {
		Predicate<String> predicate = x -> x.equals("Hello World");
		print("Hello World", predicate);
	}

	private static void print(String value, Predicate<String> predicate) {
		if (predicate.test(value)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
