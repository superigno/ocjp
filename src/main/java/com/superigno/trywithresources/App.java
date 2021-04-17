package com.superigno.trywithresources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public void tryAgain(String s) throws FileNotFoundException, IOException {
		try (FileReader r = null; FileReader p = new FileReader("")) {
			System.out.print("X");
			throw new IllegalArgumentException();
		}
		//catch or finally is not required
	}
	
	public Exception test() {
		return new Exception();
	}
	
	public static void main(String[] args) {
		new App().test();
	}

}
