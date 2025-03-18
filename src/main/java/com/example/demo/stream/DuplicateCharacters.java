package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Question 1 : Write a program to find the duplicate characters in list of string . 
Only java stream will be accepted*/

public class DuplicateCharacters {

	public static void main(String[] args) {
		String input="vivek kadiyan";
		List<String> duplicateCharacter = findDuplicateChracter(input);
		System.out.println("Duplicate character::::"+duplicateCharacter);

	}

	private static List<String> findDuplicateChracter(String input) {
		// to show what input.split("") does. This is not part of solution
		String[] sa = input.split("");
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
		
		
		return Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(cha -> cha.getValue() > 1)
				.map(in -> in.getKey())
				.collect(Collectors.toList());
	}
}
