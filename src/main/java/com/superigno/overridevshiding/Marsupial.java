package com.superigno.overridevshiding;

public class Marsupial {

	protected int tailLength = 4;
	
	public static boolean isBiped() {
		return false;
	}
	
	public boolean isBiped2() {
		return false;
	}
	
	private boolean isBiped3() {
		return false;
	}

	public void getMarsupialDescription() {
		System.out.println("isBiped: " + isBiped());
		
		System.out.println("isBiped2: " + isBiped2());
		
		System.out.println("isBiped3: " + isBiped3());
		
		System.out.println("[parentTail="+tailLength+"]");
	}

}
