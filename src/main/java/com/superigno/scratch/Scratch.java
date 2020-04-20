package com.superigno.scratch;

import java.util.HashMap;
import java.util.Map;

public class Scratch {

	public static void main(String[] args) {
		new Scratch().foo();
	}

	public void foo() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "One");
		bar(map);
		System.out.println("Map: "+map.toString());
	}
	
	public void bar(Map<String, String> map) {
		Map<String, String> map2 = map;
		map2.put("2", "Two");
		map2 = new HashMap<String, String>();
		map2.put("3", "Three");
	}

}
