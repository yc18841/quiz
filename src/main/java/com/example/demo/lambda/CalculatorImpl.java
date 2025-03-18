package com.example.demo.lambda;

import java.util.function.Function;

interface Calculator {
	void switchOn();
}

public class CalculatorImpl {

	public static void main(String[] args) {
		Calculator calculator = () -> System.out.println("Switch on");
		calculator.switchOn();
		
		// The singleton nature of Function.identity() holds even if the generic types of the functions are different (though you must trick the compiler to prove this in runtime).
		Function<Integer, Integer> iF1 = Function.identity();
		Function<Integer, Integer> iF2 = Function.identity();
		if (iF1 == iF2) System.out.println("Same");
		Function<Integer, Integer> iF3 = i -> i;
		Function<Integer, Integer> iF4 = i -> i;
		if (iF3 != iF4) System.out.println("Not the same");
		
		// The singleton nature of Function.identity() holds even if the generic types of the functions are different (though you must trick the compiler to prove this in runtime).
		Function<Integer, Integer> iF5 = Function.identity();
		Function<String, String> iF6 = Function.identity();
		Function f5 = iF5;
		Function f6 = iF6;
		if (f5 == f6) System.out.println("Same");
	}

}
