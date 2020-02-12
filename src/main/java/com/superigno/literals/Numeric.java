package com.superigno.literals;


/**
 * @note When a number is present in the code, it is a type of <b>literal</b>. By default, Java assumes that you are defining an <b>int</b> value with a literal.
 *
 */
public class Numeric {
	
	public static void main(String[] args) {
		
		//long max = 3123456789; // DOES NOT COMPILE because the number listed is bigger than what fits in an int.
		long max = 3123456789L; // now Java knows it is a long
		
		System.out.println("Long: "+max);
		
		/** Octal (Digits 0–7) This format uses the number 0 as a prefix, for example, 017. */
		int eight = 010; // Equal to decimal 8
		
		/** Hexadecimal (Digits 0–9 and Letters A–F) This format uses the number 0 followed by x or X as a prefix, for example, 0xFF. */
		int x = 0X0001;
		
		/**	Binary (Digits 0–1) This format uses the number 0 followed by b or B as a prefix, for example, 0b10. */
		int bin = 0b10;
		
		System.out.println("Octal: "+eight);
		System.out.println("Hexa: "+x);
		System.out.println("Binary: "+bin);
		
		/** Since Java 7 you can use underscores to make them easier to read */
		//double notAtStart = _1000.00; // DOES NOT COMPILE
		//double notAtEnd = 1000.00_; // DOES NOT COMPILE
		//double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double testWithUnderscore = 1_00_0.0_0; // this one compiles
		double test = 1000.00; // this one compiles
		
		System.out.println(testWithUnderscore);
		System.out.println(test);
		
	}

}
