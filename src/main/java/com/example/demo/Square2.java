package com.example.demo;

public class Square2 {

	public static void printSquare(double x) {
		System.out.println(x * x);
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(5);
		String s = "";
		
		if (sb.equals(s)) {
			System.out.println("Match 1");
		} else if (sb.toString().equals(s.toString())) {
			System.out.println("Match 2");
		} else {
			System.out.println("No match");
		}
		
		String str = " ";
		str.trim();
		System.out.println(str.equals("") + " " + str.isEmpty());
		
		String ta = "A ";
		ta = ta.concat("B ");
		String tb = "C ";
		ta = ta.concat(tb);
		ta.replace('C', 'D');
		ta = ta.concat(tb);
		System.out.println(ta);

	}

}
