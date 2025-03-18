package com.example.demo.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class SmoothData {
	
	public static List<Float> smoothDataList(List<Integer> ar, int k) {
		List<Float> result = new ArrayList<>();
		
		for (int i = 0; i + k <= ar.size(); i++) {
			List<Integer> subList = ar.subList(i, i + k);
			System.out.println("sublist : " + subList);
			OptionalDouble average = subList.stream().mapToInt(a -> a.intValue()).average();
			result.add((float) average.getAsDouble());
			
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,1,1,1,2,1,1);
		List<Float> smoothDataList = smoothDataList(list, 3);
		System.out.println(smoothDataList);
		
		List<Integer> list1 = Arrays.asList(2,3,4,5,1,2,3,1,3);
		List<Float> smoothDataList1 = smoothDataList(list1, 5);
		System.out.println(smoothDataList1);
	}

	
}
