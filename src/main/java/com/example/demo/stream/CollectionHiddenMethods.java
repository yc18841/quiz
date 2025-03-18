package com.example.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionHiddenMethods {

	public static void main(String[] args) {
		// Collctions.nCopy()
		List<String> names = Collections.nCopies(5, "JavaTechie");
		System.out.println(names);
		
		// Collections.frequency()
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 3, 1, 2, 4, 5, 6, 7, 4);
		int count = Collections.frequency(numbers, 3);
		System.out.println("3 presents " + count + " times");
		
		// find occurrence of each element in a given list
		Map<Integer, Integer> countMap = numbers.stream()
			.collect(Collectors.toMap(
					number -> number, 
					number -> Collections.frequency(numbers, number),
					(exitingValue, newValue) -> exitingValue));
		
		System.out.println(countMap);
		
		// Collection.disjoint()
		List<Integer> list1 = new ArrayList<>();
		Collections.addAll(list1, 1, 2, 3, 4, 5);
		
		List<Integer> list2 = new ArrayList<>();
		Collections.addAll(list2, 2, 3, 7, 8, 9, 10);
		
		boolean areDisjoint = Collections.disjoint(list1, list2);
		if (areDisjoint) {
			System.out.println("no common element");
		} else {
			System.out.println("common element");
		}
		
		// Collections.rotate()
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			list.add(i);
		}
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		System.out.println(list);
		
		// [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
//		Collections.rotate(list, 3); // take from right and put it left
//		System.out.println(list);
		
		// [5, 6, 7, 8, 9, 10, 1, 2, 3, 4]
//		Collections.rotate(list, -4); // take from left and put it right
//		System.out.println(list);
		
		// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
//		Collections.rotate(list, list.size()); 
//		System.out.println(list);
		
		//[6, 7, 8, 9, 10, 1, 2, 3, 4, 5]
		Collections.rotate(list, -15); // take from left and put it right
		System.out.println(list);
		
	}

}
