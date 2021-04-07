package com.superigno.java8.streams;

import java.util.Arrays;

/**
 * 
 * T reduce(T identity, BinaryOperator<T> accumulator):
 * - Performs an *immutable* reduction (i.e reduction produces a new value/object).
 * - reduce() performs reduction whereas collect() performs mutable reduction.   
 * 
 * */

public class Reduce {

	public static void main(String[] args) {

		int sum = Arrays.stream(new int[] { 5, 1, 7, 8, 3, 4, 6, 2, 3, 9 }).reduce(0, (int i, int j) -> {
			System.out.println(i + " " + j);
			return (i + j);
		});
		
		System.out.println(sum);
		
		

	}

}
