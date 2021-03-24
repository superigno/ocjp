package com.superigno.enums;

public class App {

	public static void main(String[] args) {
		Season s = Season.SUMMER;
		System.out.println(Season.SUMMER); // SUMMER
		System.out.println(s == Season.SUMMER); // true

		for (Season season : Season.values()) {
			System.out.println(season.name() + " " + season.ordinal());
		}

		Season s1 = Season.valueOf("SUMMER"); // SUMMER
		System.out.println(s1 == Season.SUMMER);

		Season s2 = Season.valueOf("summer"); // exception
		System.out.println(s2 == Season.SUMMER);		
	}
	
	public void foo() {
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

}
