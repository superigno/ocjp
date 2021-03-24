package com.superigno.scratch;

import java.util.HashMap;
import java.util.Map;

public class Scratch {

	public static void main(String[] args) {
		new Scratch().sink(1);
		
		Map<String, String> map = new HashMap<>();
		map.put(null, "ccc");
		
		System.out.println(map.get(null));
	}

	public <T> void sink(T t) {
		System.out.println(t);
		
	}

}
