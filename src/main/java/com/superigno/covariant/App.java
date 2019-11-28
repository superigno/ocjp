package com.superigno.covariant;

public class App {
	
	public static void main(String[] args) {
		new App().bar();
	}
	
	public Animal foo() {
		return new Bird();
	}
	
	public Bird bar() {
		//error
		//return new Animal();
		
		//will compile, BUT will produce runtime error. think about it! -g1q
		return (Bird) new Animal();
	}

}
