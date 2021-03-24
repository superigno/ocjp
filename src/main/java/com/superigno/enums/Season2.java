package com.superigno.enums;

public enum Season2 {
	WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium"); //Remember that the semicolon at the end of the enum values is optional only if the only thing in the enum is that list of values.

	private String expectedVisitors;

	//only private is permitted
	private Season2(String expectedVisitors) {
		this.expectedVisitors = expectedVisitors;
	}

	public void printExpectedVisitors() {
		System.out.println(expectedVisitors);
	}
	
	public static void main(String[] args) {
		Season2.SUMMER.printExpectedVisitors();
	}
}
