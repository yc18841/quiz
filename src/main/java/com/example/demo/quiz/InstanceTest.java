package com.example.demo.quiz;

public class InstanceTest {
	public static void main(String[] args) {
		var v = "Java 17";
		doIt(v);
	}

	public static void doIt(Object o) {
		if (!(o instanceof String v)) { // line n1
			throw new IllegalArgumentException("Must be a string");
		}
//		if (!(o instanceof Number v)) { // line n2 -- compilation error
//			System.out.print("Not a number");
//		}
	}
}
