package com.superigno.string;

public class App {
	
	public static void main(String[] args) {
		String s = "abc";
		String s2 = new String("abc");
		String s3 = " abc".trim();
		
		System.out.println(s==s2); //false
		System.out.println(s==s3); // false because .trim is evaluated at runtime; SCP (String Constant Pool) is populated at compile time! -g1q
	}

}
