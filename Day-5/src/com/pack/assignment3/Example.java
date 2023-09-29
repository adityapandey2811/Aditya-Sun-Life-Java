package com.pack.assignment3;

public class Example implements InterOne {
	int varTwo=100;
	int varOne;

	@Override
	public void methodOne() {
		varTwo=varTwo+10; 
		System.out.println("Value of varTwo: "+varTwo + "\nGood Morning");
	}

	@Override
	public void methodTwo() {
		System.out.println("Good Afternoon"); 
	}
}