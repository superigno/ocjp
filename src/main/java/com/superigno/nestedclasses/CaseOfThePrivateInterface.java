package com.superigno.nestedclasses;

public class CaseOfThePrivateInterface {
	
	//Can be private, protected, default as well
	public interface Secret {
		public void shh();
	}

	class DontTell implements Secret {
		public void shh() {
		}
	}
}
