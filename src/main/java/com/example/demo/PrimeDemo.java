package com.example.demo;

public class PrimeDemo {

	public static void main(String[] args) {
		// find prime numbers in 1 - 100 range
		int i, j, s;

		for (i = 2; i < 100; i++) { // 1 is not prime
			s = 0;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					s = 1;
					break;
				}
			}
			if (s == 0) {
				System.out.println(i);
			}
		}

	}

}
