package com.superigno.statics;

public class App {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Animal[] a = { new Animal(), new Dog(), new Animal() };
		for (int x = 0; x < a.length; x++) {
			a[x].doStuff(); 
			System.out.print(a[x].num);
			System.out.println(a[x].numnum);
		}
	}

}
