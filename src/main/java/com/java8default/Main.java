package com.java8default;

public class Main {

	public static void main(String[] args) {

		Calculator calc = new Calculator() {
			
			@Override
			public void sum(int a, int b) {
				
				int result = a + b;
				
				print(result);
			}
		};
		
		calc.sum(10, 10);
	}

}
