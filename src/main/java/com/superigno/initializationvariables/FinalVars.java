package com.superigno.initializationvariables;

@SuppressWarnings("unused")
public class FinalVars {
	
	//static final variables can only be initialized in declaration line or in a static initialization block
	private static final String a;
	private static final String b = "abc";
	
	//final variables can only be initialized in declaration line, instance initialization block or constructor
	private final String c;
	private final String d = "abc";
	private final String e;
	
	static {
		a = "abc";		
	}	
	
	{
		c = "abc";
	}
	
	public FinalVars() {
		e = "abc";
	}

}
