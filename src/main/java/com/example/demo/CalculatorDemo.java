package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please input two numbers:");
			double first = sc.nextDouble();
			double second = sc.nextDouble();
			System.out.println("Please input a operator (+,-,*,/):");
			char operator = sc.next().charAt(0);
			double result;

			switch (operator) {
			case '+':
				result = first + second;
				break;
			case '-':
				result = first - second;
				break;
			case '*':
				result = first * second;
				break;
			case '/':
				result = first / second;
				break;
			default:
				System.out.println("Invalid operator!");
				return;
			}
			System.out.printf("%.1f %C %.1f = %.1f", first, operator, second, result);
		}

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
		                 .reduce(0, Integer::sum);
		System.out.println(sum); // Output: 15
	}
	
}
