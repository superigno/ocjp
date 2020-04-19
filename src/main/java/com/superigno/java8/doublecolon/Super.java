package com.superigno.java8.doublecolon;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Super extends Test2 {

	// instance method to override super method
	@Override
	String print(String s) {

		// call the super method
		// using double colon operator
		Function<String, String> func = super::print;

		String newValue = func.apply(s);
		newValue += "Bye " + s + "\n";
		System.out.println(newValue);

		return newValue;
	}

	// Driver code
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Geeks");
		list.add("For");
		list.add("GEEKS");

		// call the instance method
		// using double colon operator
		list.forEach(new Super()::print);
	}

}

class Test2 {

	// super function to be called
	String print(String str) {
		return ("Hello " + str + "\n");
	}
}
