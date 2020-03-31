package com.superigno.overrideoverload;

public abstract class App {
	static void abc() {
		
	}
	
	final void abcd() {
		
	}

}

class Lion extends App {
	//void abc() { } //Error
	//void abcd() { } //Error
}