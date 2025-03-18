package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ContinuousNumberSequences {

	public static void main(String[] args) {
		String input = "abc123def456ghi7890jkl";
		
		List<String> numberSequences = findNumberSequences(input);
		
		System.out.println("Continuous sequences of numbers:");
		for (String s : numberSequences) {
			System.out.println(s);
		}

	}

	private static List<String> findNumberSequences(String input) {
		List<String> sequences = new ArrayList<>();
		StringBuilder currentSequence = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			if (Character.isDigit(ch)) {
				currentSequence.append(ch);
			} else {
				if (currentSequence.length() > 0) {
					sequences.add(currentSequence.toString());
					currentSequence.setLength(0);	// reset the current sequence
				}
			}
		}
		
		// Add the last sequence if the string ended with digits
        if (currentSequence.length() > 0) {
            sequences.add(currentSequence.toString());
        }
        
		return sequences;
	}

}
