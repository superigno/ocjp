package com.superigno.java8.interfaces.two;

public interface Walk {
	public default int getSpeed() {
		return 5;
	}
}