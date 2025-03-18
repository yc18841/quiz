package com.example.demo.quiz;

import java.util.Arrays;

public class MagicLetters {
	
	public static String solve(String s1, String s2, String r) {
		String s = s1 + s2;
		
		if (s.length() != r.length()) 
			return "No";
		
		char[] sArray = s.toCharArray();
		char[] rArray = r.toCharArray();
		Arrays.sort(sArray);
		Arrays.sort(rArray);
		if (Arrays.equals(sArray, rArray))
			return "Yes";
		
		return "No";
	}

	public static void main(String[] args) {
		String s1 = "SAM";
		String s2 = "JOHN";
		String r = "SAMLJOHN";
		
		// should be No
		System.out.println(solve(s1, s2, r));
		
		String s3 = "SAM";
		String s4 = "JOHN";
		String r1 = "SMJOHN";
		
		// should be No
		System.out.println(solve(s3, s4, r1));

		String s5 = "SAM";
		String s6 = "JOHN";
		String r2 = "SAMJOHN";
		
		// should be Yes
		System.out.println(solve(s5, s6, r2));
	}

}
