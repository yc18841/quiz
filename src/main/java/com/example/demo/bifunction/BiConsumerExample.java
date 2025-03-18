package com.example.demo.bifunction;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, Integer> biConsumer = (i1, i2) -> System.out.println("i1 = " + i1 + " i2 = " + i2);;
		biConsumer.accept("Welcome", 143);
		
		Map<String, Integer> map = new HashMap<>();
		map.put("basant", 5000);
		map.put("santosh", 15000);
		map.put("javed", 12000);
		
		map.forEach(biConsumer);
	}

}
