package com.superigno.java8.doublecolon;

import java.util.ArrayList;
import java.util.List;

public class UsingConstructor {
	
	// Class constructor 
    public UsingConstructor(String s) 
    { 
        System.out.println("Hello " + s); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        List<String> list = new ArrayList<String>(); 
        list.add("Geeks"); 
        list.add("For"); 
        list.add("GEEKS"); 
  
        // call the class constructor 
        // using double colon operator 
        list.forEach(UsingConstructor::new); 
    } 

}
