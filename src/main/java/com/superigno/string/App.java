package com.superigno.string;

public class App {
	
	public static void main(String[] args) {
		String s = "abc";
		String s2 = new String("abc");
		String s3 = " abc".trim();
		String s4 = s.substring(0,2); //does not create "ab" string in SCP
		String s5 = "ab";
		
		System.out.println(s==s2); //false
		System.out.println(s==s3); //false because .trim is evaluated at runtime; SCP (String Constant Pool) is populated at compile time! -g1q
		System.out.println(s4);
		System.out.println(s4==s5); //*false because substring does not create new string in SCP, it still points to the original string in s
		
		//* This is where new String("string") comes in handy, because if you have a very long string in SCP and you want to get a substring of it, you instead use
		// new String(s.substring(0,2)) and s = null for s to be eligible for garbage collection https://stackoverflow.com/a/465682/3747493
		// Edit: BUT! strings in SCP is not garbage collected! So this is not entirely true, so what is the benefit of using new String("")?
		// I think this is the best case scenario: https://stackoverflow.com/a/465711/3747493 -g1q
		
		
		String a = "AA";
		String b = "aa";
		String c = b.toUpperCase(); //does not create "AA" in SCP as well; try b==c it is also false. I think it creates a new instance of "AA"? -g1q
		
		System.out.println(a==c);
	}

}
