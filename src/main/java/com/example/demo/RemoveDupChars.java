package com.example.demo;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupChars {

	public static void main(String[] args) {
		String str = "programming";
		
		// approach 1 java 8 
		StringBuilder sb1 = new StringBuilder();
		str.chars().distinct().forEach(c -> sb1.append((char)c));
		System.out.println(sb1);
		
		// approach 2
		StringBuilder sb2 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch, i + 1);
			if (index == -1) {
				sb2.append(ch);
			}
		}
		System.out.println(sb2);
		
		// approach 3
		char[] charArray = str.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			boolean isDup = false;
			for (int j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				sb3.append(charArray[i]);
			}
		}
		System.out.println(sb3);
		
		// approach 4 using Set interface
		StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i <str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {
			sb4.append(c);
		}
		System.out.println(sb4);
	}
	
}
