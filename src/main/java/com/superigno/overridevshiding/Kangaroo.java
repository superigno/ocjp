package com.superigno.overridevshiding;

/*
 * Also check com.superigno.overrideoverload package
 * 
 * May only be "hidden" and not overridden: (hidden meaning ang makikita eh ung value nung parent hndi sa subclass -g1q)
 * 	  - private instance methods
 *    - static methods
 *    - ALL variables
 *    
 * *Makikita siya upon calling joey.getMarsupialDescription()   
 * 
 * *Also check explanation here: OCP Oracle Certified Professional Java SE 8 Programmer II Study Guide Exam 1Z0-809 page 11 (63 of 723)
 * 
 * "The main method creates a new Lion and calls careFor. Since only the Animal superclass has a careFor method, it executes. That method calls play. 
 * Java looks for <b>overridden</b> methods, and it sees that Lion implements play (so it calls it, and this is called virtual method invocation as per pdf -g1q). 
 * Even though the call is from the Animal class, Java still looks at subclasses"
 *
 */

public class Kangaroo extends Marsupial {
	
	//Hidden in getMarsupialDescription()
	protected int tailLength = 8;
	
	//Hidden in getMarsupialDescription()
	public static boolean isBiped() {
		return true;
	}
	
	//Overridden
	public boolean isBiped2() {
		return true;
	}
	
	//Hidden in getMarsupialDescription()	
	public boolean isBiped3() {
		return true;
	}

	public void getKangarooDescription() {
		System.out.println("isBiped: " + isBiped());
		
		System.out.println("isBiped2: " + isBiped2());
		
		System.out.println("isBiped3: " + isBiped3());
		
		System.out.println("[tail="+tailLength +",parentTail="+super.tailLength+"]");
	}

	public static void main(String[] args) {
		Marsupial mar = new Kangaroo();
		mar.getMarsupialDescription();
		System.out.println("tailLength: "+mar.tailLength);
		
		System.out.println("--------------");
		
		Kangaroo joey = new Kangaroo();
		joey.getMarsupialDescription();
		//joey.getKangarooDescription();	
		System.out.println("tailLength: "+joey.tailLength);
		
	}
}
