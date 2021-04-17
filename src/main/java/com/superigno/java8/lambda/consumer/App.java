package com.superigno.java8.lambda.consumer;

import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		Consumer<String> consumer = x -> System.out.println(x);
		print("Hello World", consumer);
	}

	private static void print(String value, Consumer<String> consumer) {
		consumer.accept(value);
	}

}
