package com.superigno.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	/* - Take note of remove(Object object) vs remove (index) 
	 * - ArrayList is not allowed to contain primitives, Java will autobox parameters passed in to the proper wrapper type
	 * 
	 * */

	public static void main2(String[] args) {

		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add("hawk"); // [hawk, hawk]
		System.out.println(birds.remove("cardinal")); // prints false!
		System.out.println(birds.remove("hawk")); // prints true!
		System.out.println(birds.remove(0)); // prints hawk!
		System.out.println(birds); // []

		List<String> birds2 = new ArrayList<>();
		birds2.add("hawk"); // [hawk]
		System.out.println(birds2.size()); // 1
		birds2.set(0, "robin"); // [robin]
		System.out.println(birds2);
		System.out.println(birds2.size()); // 1
		birds2.set(1, "robin"); // IndexOutOfBoundsException
	}

	public static void main(String[] args) {
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list = Arrays.asList(array); // returns fixed size list
		System.out.println(list.size()); // 2
		list.set(1, "test"); // [hawk, test]
		array[0] = "new"; // [new, test]
		for (String b : array) {
			System.out.print(b + " "); // new test
		}
		list.remove(1); // throws UnsupportedOperation Exception
	}
}
