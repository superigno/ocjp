package com.superigno.exceptions;

import java.util.Arrays;
import java.util.List;

import com.superigno.generics.Animal;
import com.superigno.generics.Cat;
import com.superigno.generics.Dog;

public class RuntimeExamples {
	
	@SuppressWarnings({ "unused", "null" })
	public static void main(String[] args) {
		
		try {
			int a = 1/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		try {
			List<String> l = Arrays.asList(new String[]{"1", "2"});
			l.get(3);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		try {
			Animal animal = new Cat();
			Dog dog = (Dog) animal;
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		
		try {
			Object obj = null;
			obj.toString();
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		
		try {
			Integer in = Integer.valueOf("abc");
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		
		try {
			throw new IllegalArgumentException("custom exception");
		} catch (IllegalArgumentException e) {
			System.out.println(e);
		}
	}

}
