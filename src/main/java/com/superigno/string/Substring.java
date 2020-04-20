package com.superigno.string;

public class Substring {
	
	//substring is weird! -g1q
	/*
	 * int substring(int beginIndex)
	 * int substring(int beginIndex, int endIndex)
	 * 
	 * */
	public static void main(String[] args) {
		String string = "animals";
		System.out.println(string.substring(3)); // mals
		System.out.println(string.substring(string.indexOf('m'))); // mals
		System.out.println(string.substring(3, 4)); // m
		System.out.println(string.substring(3, 7)); // mals - take note, ung 7 is sobrang index kasi animals is 6 indexes lang in total (0-6) - weird! - g1q!
		
		System.out.println(string.substring(3, 3)); // empty string
		System.out.println(string.substring(3, 2)); // throws exception
		System.out.println(string.substring(3, 8)); // throws exception
	}

}
