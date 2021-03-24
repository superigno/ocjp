package com.superigno.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		//using implementation
		test(new Bar());
		
		//using anonymous class
		test(new IFoo() {
			@Override
			public void foo(String a, String b) {
				System.out.println("Hello using anonymous class: "+a+" and "+b);
			}
		});
		
		//using lambda
		test((a, b) -> System.out.println("Hello using lambda: "+a+" and "+b));	
		
		//another example
		List<String> list = new ArrayList<>();
		list.removeIf(s -> s.isEmpty());
		list.removeIf(s -> {
			return s.isEmpty(); //if you use brackets, return and ";" is required
		});
		
	}
	
	
	
	public static void test(IFoo f) {
		f.foo("one", "two");
	}

}
