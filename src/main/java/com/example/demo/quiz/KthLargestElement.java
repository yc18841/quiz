package com.example.demo.quiz;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

	public static int findKthLargest(int[] nums, int k, int numberOfElementInNums) {
        // Use a min-heap to keep track of the top k elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // add for sag test
        if (numberOfElementInNums < k) return -1;
        
        for (int num : nums) {
            minHeap.offer(num);

            // If the heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The root of the heap is the k-th largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int result = findKthLargest(nums, k, nums.length);
        System.out.println(k + "th largest element is " + result);
        
        int [] workNums = new int[nums.length];
        int [] resultNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
        	workNums[i] = nums[i];
        	resultNums[i] = findKthLargest(workNums, k, i);
        }
        
        System.out.println(Arrays.toString(resultNums));
    }

}
