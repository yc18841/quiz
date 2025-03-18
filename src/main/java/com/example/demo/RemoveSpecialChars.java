package com.example.demo;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String str = "$ja!va$&st%ar";
		
		// approach 1 - using replaceAll
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);

	}

}
