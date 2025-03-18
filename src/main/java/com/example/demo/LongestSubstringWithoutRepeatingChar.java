package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		lengthOfLongestSubString("abbac");

	}

	private static void lengthOfLongestSubString(String s) {
		String longestSubString = null;
		int longestSubStringLength = 0;
		
		Map<Character, Integer> map = new HashMap<>();	// char -> index
		
		char[] arr = s.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
			
			if (map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
			}
		}
		
		System.out.println("The longest substring: " + longestSubString);
		System.out.println("The longest substring length: " + longestSubStringLength);
	}

}
