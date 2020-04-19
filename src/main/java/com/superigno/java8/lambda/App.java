package com.superigno.java8.lambda;

public class App {
	
	public static void main(String[] args) {
		test(new Bar());
		
		test(new IFoo() {
			@Override
			public void foo(String a, String b) {
				System.out.println("Hello using anonymous class: "+a+" and "+b);
			}
		});
		
		test((a, b) -> System.out.println("Hello using lambda: "+a+" and "+b));	
		
	}
	
	
	
	public static void test(IFoo f) {
		f.foo("one", "two");
	}

}
