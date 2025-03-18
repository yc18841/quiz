package com.example.demo.stream;

import java.util.Arrays;

/*Question 4 : Find the continuous sequences of numbers in given input . Provide all possiable test?
e.g input 1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1
output
1 2 3
6 7 8
-3 -2 -1*/
public class ContinuousSequence {

	public static void main(String[] args) {
		//find the continuous sequence number
		String inputArr[] = {"1", "2","3","5","9", "a", "6", "7" ,"8" ,"4" ,"@", "-5", "-7" ,"-3", "-2" ,"-1"};
				
		int array[]  = Arrays.stream(inputArr)
				.filter(in->{
					boolean out = true;
					try {
						Integer.valueOf(in);
					} catch(Exception exception) {
						out = false;
					}
					return out;
				})
				.mapToInt(element->Integer.valueOf(element))
				.toArray();
		
		for (int i = 0; i < array.length; i++) {
			StringBuffer result = new StringBuffer("");
			for(int j=i+1;j<array.length;j++) {
				int next = array[i]+1;
				if(next == array[j]) {
					if(result.toString().isEmpty())
						result.append(array[i]+"::"+array[j]);
					else
						result.append("::"+array[j]);
					i=j;
				}else {
					break;
				}
			}
			if(!result.toString().isEmpty())
				System.out.println(result.toString());
		}
	}

}
