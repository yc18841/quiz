package com.example.demo.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

/*Question 3 : You have an arrays of zeros (0) and (1) keep all zeros at the left hand side and all 1 to 
right hand side.
e.g Integer array[] =[1,1,0,1,0] -> output : [0,0,1,1,1]*/
public class SortArray {

	public static void main(String[] args) {
		Integer array[] = {1,1,0,1,0 };
		///-> output : [0,0,1,1,1]
		System.out.println(Arrays.stream(array).sorted().collect(Collectors.toList()));

	}

}
