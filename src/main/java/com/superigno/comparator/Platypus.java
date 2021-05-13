package com.superigno.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Platypus {
	
	String name;
	int beakLength;

	Platypus(String name, int length) {
		this.name = name;
		this.beakLength = length;
	}

	public String getName() {
		return name;
	}

	public int getBeakLength() {
		return beakLength;
	}

	public String toString() {
		return "" + beakLength;
	}

	public static void main(String[] args) {
		Platypus p1 = new Platypus("Paula", 3);
		Platypus p2 = new Platypus("Peter", 5);
		Platypus p3 = new Platypus("Peter", 7);

		List<Platypus> list = Arrays.asList(p1, p2, p3);

		Collections.sort(list, Comparator.comparing(Platypus::getBeakLength).reversed());
		//or
		Collections.sort(list, Comparator.comparing(Platypus::getName).thenComparingInt(Platypus::getBeakLength).reversed());

		System.out.println(list);
	}
}
