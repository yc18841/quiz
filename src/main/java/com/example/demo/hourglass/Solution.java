package com.example.demo.hourglass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        
        System.out.println(maxHourglassSum(arr));

	}

	private static int maxHourglassSum(List<List<Integer>> arr) {
		int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int currentSum = calculateHourglassSum(arr, i, j);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
         
        return maxSum;
	}

	private static int calculateHourglassSum(List<List<Integer>> arr, int i, int j) {
		List<Integer> row = arr.get(i);
        List<Integer> row1 = arr.get(i + 1);
        List<Integer> row2 = arr.get(i + 2);
        
        int sum = row.get(j) + row.get(j+1) + row.get(j+2)
                            + row1.get(j+1) +
                  row2.get(j) + row2.get(j+1) + row2.get(j+2);        
        
        return sum;
	}

}
