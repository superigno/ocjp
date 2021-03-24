package com.superigno.enums;

public enum Season3 {
	WINTER {
		public void printHours() {
			System.out.println("9am-3pm");
		}

		public void defaultMethod() {
			System.out.println("Overridden default method");
		}
	},
	SPRING {
		public void printHours() {
			System.out.println("9am-5pm");
		}
	},
	SUMMER {
		public void printHours() {
			System.out.println("9am-7pm");
		}
	},
	FALL {
		public void printHours() {
			System.out.println("9am-5pm");
		}
	};

	public abstract void printHours();

	public void defaultMethod() {
		System.out.println("default method");
	}
}
