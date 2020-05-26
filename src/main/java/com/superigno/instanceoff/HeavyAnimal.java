package com.superigno.instanceoff;

public class HeavyAnimal {
	
	public static void main(String[] args) {
		HeavyAnimal hippo = new Hippo();
		boolean b1 = hippo instanceof Hippo; // true
		boolean b2 = hippo instanceof HeavyAnimal; // true
		boolean b3 = hippo instanceof Elephant; // false
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		HeavyAnimal hippo2 = new Hippo();
		boolean b4 = hippo2 instanceof Object; // true
		
		System.out.println(b4);
		
		Hippo nullHippo = null;
		boolean b5 = nullHippo instanceof Object; // false
		
		System.out.println(b5);
		
		//Hippo anotherHippo = new Hippo();
		//boolean b6 = anotherHippo instanceof Elephant; // DOES NOT COMPILE
		
		HeavyAnimal hippo3 = new Hippo();
		boolean b7 = hippo3 instanceof Mother; //compiles! false - take note that comparing instanceof with interfaces, it always compiles! - g1q
		
		System.out.println(b7);
		/**
		 * It so happens that Hippo does not implement Mother. The compiler allows the statement because there could later be a class such as this:
		 *	  class MotherHippo extends Hippo implements Mother { }
		 **/
	}

}

class Hippo extends HeavyAnimal { }
class Elephant extends HeavyAnimal { }
