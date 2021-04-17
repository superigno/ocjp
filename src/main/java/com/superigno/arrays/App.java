package com.superigno.arrays;

public class App {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[][] x = new int[2][2];
		
		x[0] = new int[5]; //pwede ireinitialize
		x[1] = new int[3];
		
		System.out.println(x[0][4]);
		
		
		int[] a = {1, 2};
		int[] b = new int[]{1, 2};
		
	}
	
}
