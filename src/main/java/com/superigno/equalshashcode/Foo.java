package com.superigno.equalshashcode;

public class Foo {

	private int fooValue;
	
	public Foo(int fooValue) {
		this.fooValue = fooValue;
	}

	public int getFooValue() {
		return fooValue;
	}	

	@Override
	public boolean equals(Object o) {
		if (o instanceof Foo && ((Foo) o).getFooValue() == this.fooValue) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return this.fooValue * 17;
	}

}
