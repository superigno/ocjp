package com.superigno.initializationblock;

/**
 * @note "...the non-static block is actually copied by the Java compiler into every constructor the class has (source). So it is still the constructor's job to initialize fields"
 *        https://stackoverflow.com/questions/2420389/static-initialization-blocks/2420404#comment22381342_2420466
 *        So parang no sense pala gamitin ang non-static initialization block -g1q 
 *        
 *        Edit: May sense din, kung gsto mo tumawag ng something on both a no-arg constructor and with-arg constructor, lagay mo sa isang non-static initialization
 *        block. Like below example.
 */
public class Init {

	Init(int x) {
		System.out.println("1-arg const");
	}

	Init() {
		System.out.println("no-arg const");
	}

	static {
		System.out.println("1st static init");
	}
	
	{
		System.out.println("1st instance init");
	}
	
	{
		System.out.println("2nd instance init");
	}
	
	static {
		System.out.println("2nd static init");
	}

	public static void main(String[] args) {
		new Init();
		new Init(7);
	}

}
