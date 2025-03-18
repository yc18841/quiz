package com.example.demo;

import java.util.Arrays;

public class CharWithOccurance {

	public static void main(String[] args) {
		String input = "opentext";
		char charToReplace = 't';
		// expected output open1ex2
		
		if (input.indexOf(charToReplace) == -1) {
			System.out.println("Given character is not in input string!");
			System.exit(0);
		}
		
		int cnt = 1;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == charToReplace) {
				input = input.replaceFirst(String.valueOf(charToReplace), String.valueOf(cnt));
				cnt++;
			}
		}
		System.out.println(input);
	}

}
