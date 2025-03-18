package com.example.demo.bifunction;

import java.util.function.BiPredicate;

public class BiPredicateExample {

	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		System.out.println(biPredicate.test("madam", "madam"));
		
		BiPredicate<String, String> equalsPredicate = (s1, s2) -> s1.equals(s2);
		BiPredicate<String, String> lengthbiPredicate = (s1, s2) -> s1.length() == s2.length();
		System.out.println(equalsPredicate.and(lengthbiPredicate).test("madam", "madbm"));
	}

}
