package com.superigno.overrideoverload;

public class Reptile {

	public int x = 1;
	
	protected boolean hasLegs() throws InsufficientDataException {
		throw new InsufficientDataException();
	}

	protected double getWeight() throws Exception {
		return 2;
	}	

	protected final double getHeight() {
		return 0;
	}
	
	protected static boolean hasArms() {
		return true;
	}
	
	public void testRuntime() throws IllegalArgumentException {
		
	}
	
	public Number test() {return 0;}
}
