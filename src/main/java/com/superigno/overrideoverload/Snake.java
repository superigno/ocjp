package com.superigno.overrideoverload;

/*
 * 1. The child method must be at least as accessible as the parent
 * 2. The child method may hide or eliminate a parent method’s exception without issue
 * 3. The method defined in the child class must be marked as static if it is marked as static in the parent class (method hiding). Likewise, the method must not be marked 
 *    as static in the child class if it is not marked as static in the parent class (method overriding).
 *    Method hiding ('redefining' in scjp 6 pdf) - statics -g1q
 * 4. May only be "hidden" and not overridden: (hidden meaning hndi makkita nung subclass -g1q)
 * 	  - private instance methods
 *    - static methods
 *    - ALL variables (see int x example below) 
 *        
 */

public class Snake extends Reptile {

	public int x = 2;

	// can be final as well, all children can be final as long as parent isn't -g1q
	public boolean hasLegs() {
		return false;
	}

	public double getWeight() throws InsufficientDataException {
		return 2;
	}

	// Cannot override or redefine final in parent
	// protected double getHeight() {
	// return 0;
	// }

	// must be static as well; if parent is not static, must not be static as well
	protected static boolean hasArms() {
		return true;
	}

	// will work but will not work if vice-versa (Number is parent of Integer) - parang exception
	public Integer test() {
		return 0;
	}
	
	public static void main(String[] args) {
		Reptile r = new Reptile();
		System.out.println(r.x); // prints 1; x in Reptile is "hidden" meaning it cannot be overridden.
	}

}
