package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeat {

	public static void main(String[] args) {
		String input = "AABCDBE";
		
		// approach 1
		for (int i = 0; i < input.length(); i++) {
			boolean isUnique = true;
			
			for (int j = 0; j < input.length(); j++) {
				if (i != j && input.charAt(i) == input.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			
			if (isUnique) {
				System.out.println(input.charAt(i));
				break;
			}
		}
		
		// approach 2
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < input.length(); i++) {
			
			char ch = input.charAt(i);
			if (map.containsKey(ch)) {
				int value = map.get(ch);
				map.put(ch, value + 1);
			} else {
				map.put(ch, 1);
				
			}
		}
		System.out.println(map);
		
		for (Entry<Character, Integer> entrySet : map.entrySet()) {
			if (entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
				break;
			}
		}

	}

}
