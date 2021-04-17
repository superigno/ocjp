package com.superigno.switchstatement;

import com.superigno.enums.Season;

/**
 * @notes
 * 
 *        Data types supported by switch statements include the following: 
 *        - int and Integer 
 *        - byte and Byte 
 *        - short and Short 
 *        - char and Character 
 *        - String 
 *        - enum values 
 */

public class App {

	public static void main(String[] args) {
		foo(5);
		foo(6);
		foo(0);
	}

	public static void foo(int dayOfWeek) {
		switch (dayOfWeek) { //Read above; only int and below, enum and String are allowed here!
		
		
		default: //always last to be evaluated; does not matter where default is placed! -g1q
			System.out.println("Weekday");
			
		case 0_0:
			System.out.println("Sunday");
		case 1:
			System.out.println("Monday");
		
		case 6:
			System.out.println("Saturday");
		}

		System.out.println("---------");
	}
	
	public static void testEnum() {
		switch (Season.SUMMER) {
		case WINTER:
			System.out.println("Get out the sled!");
			break;
		case SUMMER:
			System.out.println("Time for the pool!");
			break;
	//	case Season.SPRING: //will not compile!!! enums types are implied
	//		System.out.println("Spring");
	//		break;	
		default:
			System.out.println("Is it summer yet?");
		}
	}
	

	/*
	 * - You can use only literals, enum constants, or final constant variables of the same data type.
	 * - The variable must be marked with the final modifier and initialized with a literal value in the same expression in which it is declared.
	 */	
	/*
	private int bar(String firstName, final String lastName) {
	
		String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch (firstName) {
		case "Test":
			return 52;
		case middleName: // DOES NOT COMPILE
			id = 5;
			break;
		case suffix:
			id = 0;
			break;
		case lastName: // DOES NOT COMPILE
			id = 8;
			break;
		case 5: // DOES NOT COMPILE
			id = 7;
			break;
		case 'J': // DOES NOT COMPILE
			id = 10;
			break;
		case Month.JANUARY: // DOES NOT COMPILE
			id = 15;
			break;
		}
		return id;
		
	}
	*/

}
