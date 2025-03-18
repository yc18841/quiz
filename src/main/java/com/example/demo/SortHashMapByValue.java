package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("a", 11);
		hashMap.put("w", 9);
		hashMap.put("c", 7);
		hashMap.put("d", 5);
		hashMap.put("b", 4);
		hashMap.put("n", 1);
		
		System.out.println("Original HashMap: " + hashMap);
		
		// sorting the HashMap by value
		Map<String, Integer> sortedMap = sortByValue(hashMap);
		
		System.out.println("Sorted HashMap: " + sortedMap);
	}

	private static Map<String, Integer> sortByValue(Map<String, Integer> hashMap) {
		List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
		list.sort(Map.Entry.comparingByValue());
		
		Map<String, Integer> sortedMap = new LinkedHashMap<>();
		
		for (Map.Entry<String, Integer> e : list) {
			sortedMap.put(e.getKey(), e.getValue());
		}
		
		return sortedMap;
	}

}
