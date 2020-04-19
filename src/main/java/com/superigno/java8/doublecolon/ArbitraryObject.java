package com.superigno.java8.doublecolon;

import java.util.ArrayList;
import java.util.List;

public class ArbitraryObject {

	public static void main(String[] args) {

		List<Test> list = new ArrayList<Test>();
		list.add(new Test("Geeks"));
		list.add(new Test("For"));
		list.add(new Test("GEEKS"));

		// call the instance method
		// using double colon operator
		list.forEach(Test::someFunction);
	}

}

class Test {
	String str = null;

	Test(String s) {
		this.str = s;
	}

	// instance function to be called
	void someFunction() {
		System.out.println(this.str);
	}
}
