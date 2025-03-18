package com.example.demo;

import java.util.Arrays;

public class SortStringChar {

	public static void main(String[] args) {
		String input = "rock";
		
		// approach 1
		char[] arr = input.toCharArray();
		char temp;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(new String(arr));
		
		// approach 2
		char[] charArray = input.toCharArray();
		System.out.println(new String(charArray));
		Arrays.sort(charArray);
		System.out.println(new String(charArray));
	}

}
