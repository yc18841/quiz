package com.example.demo.bifunction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
		// merge list1 and list2, remove duplicated elements
		return Stream.of(list1, list2)
				.flatMap(List::stream)
				.distinct()
				.collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction = new BiFunctionExample();
		
		List<Integer> list1 = Stream.of(1, 3, 4, 6, 7, 9, 19).collect(Collectors.toList());
		List<Integer> list2 = Stream.of(11, 3, 43, 6, 7, 19).collect(Collectors.toList());
		System.out.println("Traditional approach: " + biFunction.apply(list1, list2));
		
		// Lambda expression
		BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = (l1, l2) -> {
			return Stream.of(l1, l2)
					.flatMap(List::stream)
					.distinct()
					.collect(Collectors.toList());
		};
		
		Function<List<Integer>, List<Integer>> sortedFunction = (lists) -> lists
				.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println("Lambda approach: " + biFunction2.andThen(sortedFunction).apply(list1, list2));
		
		// increase salary by 1000
		Map<String, Integer> map = new HashMap<>();
		map.put("basant", 5000);
		map.put("santosh", 15000);
		map.put("javed", 12000);
		
		BiFunction<String, Integer, Integer> increaseSalaryBiFunction = (k, v) -> v + 1000;
		map.replaceAll(increaseSalaryBiFunction);
		
		System.out.println(map);
	}

}
