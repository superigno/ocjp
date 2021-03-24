package com.superigno.widenbox;


// Primitive - widen - box - Object - var-arg
public class Widen {

	private static void widen(Object k) {
        System.out.println("Converted to Object: " + k);
    }
	
    private static void widen(long k) {
        System.out.println("Converted to long: " + k);
    }

    private static void widen(int ... k) {
        System.out.println("Converted to varargs: " + k);
    }

    private static void widen(Integer k) {
        System.out.println("Converted to Integer: " + k);
    }

    public static void main(String ... args) {
        int value = 3;
        widen(value);  // Output: Converted to long: 3
    }
} 