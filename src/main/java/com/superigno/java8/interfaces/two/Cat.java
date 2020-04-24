package com.superigno.java8.interfaces.two;

public class Cat implements Walk, Run {

	@Override //need to override when there are same default methods
	public int getSpeed() {
		// TODO Auto-generated method stub
		return Run.super.getSpeed();
	}

}
