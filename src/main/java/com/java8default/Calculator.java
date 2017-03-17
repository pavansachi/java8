package com.java8default;

public interface Calculator {

	default void print(int result) {
		System.out.format("Calc result : %s", result);
	};
	
	public void sum(int a, int b);
}