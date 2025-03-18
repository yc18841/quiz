package com.example.demo.stream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamThreadExample {
	 public static void main(String[] args) {
	        System.out.println("Available Processors: " + Runtime.getRuntime().availableProcessors());

	        List<Integer> numbers = IntStream.rangeClosed(1, 10).boxed().toList();

	        numbers.parallelStream().forEach(num -> {
	            System.out.println(Thread.currentThread().getName() + " processing: " + num);
	        });
	    }
}
