package com.example.demo.dequeue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class DequeueTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		// Input array of n integers
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		// Deque to store current window elements and HashSet for unique count
		Deque<Integer> deque = new ArrayDeque<>();
		HashSet<Integer> set = new HashSet<>();

		int maxUniqueCount = 0;

		// Traverse the array
		for (int i = 0; i < n; i++) {
			// Add current element to the deque and set
			deque.addLast(arr[i]);
			set.add(arr[i]);

			// If window size exceeds m, remove the oldest element
			if (deque.size() > m) {
				int removedElement = deque.removeFirst();
				if (!deque.contains(removedElement)) {
					set.remove(removedElement);
				}
			}

			// Update maxUniqueCount with the size of the set
			maxUniqueCount = Math.max(maxUniqueCount, set.size());
		}

		System.out.println(maxUniqueCount);
		in.close();
	}

}
