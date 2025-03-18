package com.example.demo;

import java.util.Scanner;
import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			char[] ca = input.toCharArray();
			Stack<Character> s = new Stack<>();
			boolean printed = false;
			for (int i = 0; i < ca.length; i++) {
				if (ca[i] == '{' || ca[i] == '(' || ca[i] == '[') {
					s.push(ca[i]);
					continue;
				}

				if (s.isEmpty()) {
					System.out.println("false");
					printed = true;
					break;
				}

				if (ca[i] == '}') {
					if (s.pop() != '{') {
						System.out.println("false");
						printed = true;
						break;
					}
				} else if (ca[i] == ')') {
					if (s.pop() != '(') {
						System.out.println("false");
						printed = true;
						break;
					}
				} else if (ca[i] == ']') {
					if (s.pop() != '[') {
						System.out.println("false");
						printed = true;
						break;
					}
				}
			}
			if (s.isEmpty() && !printed) {
				System.out.println("true");
			} else if (!printed) {
				System.out.println("false");
			}
		}
		sc.close();
	}

}
