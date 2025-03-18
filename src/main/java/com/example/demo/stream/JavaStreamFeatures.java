package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreamFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Bosant", "Santosh", null, "Vinod", null, "sam", "john");
		
		// Stream.ofNullable
		List<String> nameResult = names.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
		System.out.println(nameResult);
		
		// Stream.iterate()
		Stream.iterate(2, n -> n + 2).limit(5).forEach(System.out::println);
		
		// Stream.takeWhile and Stream.dropWhile
		List<Integer> numbers = List.of(1, 2, 3, 4, 6, 7, 8, 9);
		List<Integer> num1 = numbers.stream().takeWhile(num -> num < 5).collect(Collectors.toList());
		System.out.println(num1);
		
		List<Integer> num2 = numbers.stream().dropWhile(num -> num < 5).collect(Collectors.toList());
		System.out.println(num2);
		
		// Collectors.teeing()
		Map<String, Integer> minMaxMap = numbers.stream()
			.collect(Collectors.teeing(
					Collectors.maxBy(Integer::compareTo), 
					Collectors.minBy(Integer::compareTo), 
					(e1, e2) -> Map.of("max", e1.get(), "min", e2.get())));
		System.out.println(minMaxMap);
		
		// Stream.concat
		Stream<Integer> stream1 = Stream.of(1, 2, 3);
		Stream<Integer> stream2 = Stream.of(4, 5, 6);
		Stream<Integer> concatStream = Stream.concat(stream1, stream2);
		
		int sum = concatStream.mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		// Collectors.partitioningBy
		Map<Boolean, List<Integer>> map = numbers.stream()
			.collect(Collectors.partitioningBy(num -> num % 2 == 0));
		System.out.println("Odd number: " + map.get(Boolean.FALSE));
		System.out.println("Even number: " + map.get(Boolean.TRUE));
		
		// IntStream for ranges
		List<Integer> intStream1 = IntStream.range(1, 20).boxed().collect(Collectors.toList());
		System.out.println(intStream1);
		
		List<Integer> intStream2 = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
		System.out.println(intStream2);
		
	}

}
