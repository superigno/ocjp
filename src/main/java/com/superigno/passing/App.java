package com.superigno.passing;

public class App {

	public static void main(String[] args) {
		Foo f = new Foo();
		int i = 1;
		
		System.out.println(f.getName());
		new App().doStuff(f);
		System.out.println(f.getName());
		
		System.out.println();
		
		System.out.println(i);
		new App().doStuff(i);
		System.out.println(i);
	}
	
	void doStuff(Foo g) {
		g.setName("Boo");
		g = new Foo();
	}
	
	void doStuff(int i) {
		i = 2;
	}

}
