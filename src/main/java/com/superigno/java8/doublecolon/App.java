package com.superigno.java8.doublecolon;

import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {

		// Get the stream
		Stream<String> stream = Stream.of("Geeks", "For", "Geeks", "A", "Computer", 
				"Portal");

		// Print the stream using lambda
		//stream.forEach(s -> System.out.println(s));
		
		// using double colon operator
		stream.forEach(System.out::println);
	}

}
