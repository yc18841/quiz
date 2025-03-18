package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {

	public static void main(String[] args) {
		List<Customer> customers = Stream.of(
				new Customer(1, "aaa", "abc@abc.com", Arrays.asList("397937955", "21654725")),
				new Customer(2, "bbb", "bbb@abc.com", Arrays.asList("89563865", "2487238947")),
				new Customer(3, "ccc", "ccc@abc.com", Arrays.asList("38976234645", "3286487236"))
			).collect(Collectors.toList());
		
		List<String> emails = customers.stream()
				.map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(emails);
		
		List<List<String>> phoneNumbers = customers.stream()
				.map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
		
		List<String> phoneNumbersFlat = customers.stream()
				.flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
		System.out.println(phoneNumbersFlat);
		
	}

}
