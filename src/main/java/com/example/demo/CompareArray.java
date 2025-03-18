package com.example.demo;

import java.util.Arrays;

public class CompareArray {

	public static void main(String[] args) {
		int a1[] = { 5, 24, 54, 22 };
		int a2[] = { 5, 23, 56, 202 };
		int a3[] = { 3, 8, 19, 39, 56 };
		System.out.print(Arrays.compare(a1, a2));
		System.out.print(Arrays.compare(a3, a2));
		System.out.print(Arrays.mismatch(a1, a1));
		System.out.print(Arrays.mismatch(a2, a1));

	}

}
