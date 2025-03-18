package com.example.demo;

public class ReverseStringDemo {
	
	public String reverse(String str) {
		char[] strArray = str.toCharArray();
		StringBuilder sb = new StringBuilder(strArray.length);
		
		for (int i = strArray.length - 1; i >= 0; i--) {
			sb.append(strArray[i]);	
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		// reverse string without using build in method
		ReverseStringDemo rd = new ReverseStringDemo();
		String str = "abcde";
		
		System.out.println(rd.reverse(str));
	}

}
