package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 7, 8, 1, 5, 9);
		
		List<String> words = Arrays.asList("corejava", "spring", "hibernate");
		
		int sum = numbers.stream().mapToInt(i -> i).sum();
		System.out.println(sum);
		
		Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(reduceSum);
		
		Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
		System.out.println(reduceSumWithMethodReference.get());
		
		Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println(mulResult);
		
		Integer maxValue = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxValue);
		
		Integer maxValueWithMethodReference = numbers.stream().reduce(Integer::max).get();
		System.out.println(maxValueWithMethodReference);
		
		String logestString = words.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 :word2).get();
		System.out.println(logestString);
	}

}
