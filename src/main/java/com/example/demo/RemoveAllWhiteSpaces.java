package com.example.demo;

public class RemoveAllWhiteSpaces {

	public static void main(String[] args) {
		String str = "   j  a   va    s  ta     r";
		
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);

	}

}
