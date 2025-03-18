package com.example.demo.quiz;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordStream {

	public static void main(String[] args) {
		List<String> strm = Stream.of("foo", "bar", "bar").collect(Collectors.toList());

		Optional<Entry<String, Long>> optional = strm.stream().collect(Collectors.groupingBy(Function.identity(),
				Collectors.counting())).entrySet().stream().sorted((e1,
				e2)-> e2.getValue().compareTo(e1.getValue())).findFirst();
		if (optional.isPresent())
			System.out.println(optional.get());
		
		// second correct answer
		optional = strm.stream().collect(Collectors.groupingBy(___ -> ___, 
				Collectors.counting())).entrySet().stream().max(Comparator.
				comparing(e -> e.getValue()));
		if (optional.isPresent())
			System.out.println(optional.get());
	}

}
