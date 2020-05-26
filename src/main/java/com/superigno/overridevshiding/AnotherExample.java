package com.superigno.overridevshiding;

abstract class Animal {
	String name = "???";
	String type = "!!!";

	public void printName() {
		System.out.println(name);
	}
	
	public static void test() {
		System.out.println("Here");
	}
}

class Lion extends Animal {
	String name = "Leo";
	
//	public void printName() {
//		System.out.println(name);
//	}
}

public class AnotherExample {
	public static void main(String... args) {
		Animal animal = new Lion();
		//animal.printName();
		System.out.println(animal.name);
		
		Lion lion = new Lion();
		//lion.printName();
		System.out.println(lion.name);
		
		System.out.println("--------");
		
		System.out.println(lion.type);
		Lion.test();
	}
}