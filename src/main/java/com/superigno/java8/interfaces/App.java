package com.superigno.java8.interfaces;

import com.superigno.java8.interfaces.IFoo;

public class App {
	
	public static void main(String[] args) {
		
		new Bar().test();
		
		IFoo.testStatic();
		//IFoo i = new Bar();
		//i.testStatic(); //does not work
		//new Bar().testStatic; //does not work\
	}

}
