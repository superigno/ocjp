package com.superigno.overrideoverload;

import java.io.FileNotFoundException;

public class BobcatKitten extends Bobcat {
	
	public void findDen() { } //Override
	public void findDen(boolean b) { } //Overload
	//public int findDen() throws Exception { return 0; } //Error
	
	//protected void foo() {} //Override
	public void foo() {} //Override
	//private void foo() {} //Error, cannot reduce visibility
	
	//public void bar() throws IOException {} //Override
	public void bar() throws FileNotFoundException {} //Override
	//public void bar() throws Exception {} //Error, cannot widen exception
}
