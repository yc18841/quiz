package com.example.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalDemo {
	
	public static Customer findCustomerByEmailId(String email) throws Exception {
		List<Customer> customers = Stream.of(
				new Customer(1, "aaa", "abc@abc.com", Arrays.asList("397937955", "21654725")),
				new Customer(2, "bbb", "bbb@abc.com", Arrays.asList("89563865", "2487238947")),
				new Customer(3, "ccc", "ccc@abc.com", Arrays.asList("38976234645", "3286487236"))
			).collect(Collectors.toList());
		
		return customers.stream()
				.filter(customer -> customer.getEmail().equals(email))
				.findAny()
				.orElseThrow(() -> new Exception("no customer present with email id"));
	}

	public static void main(String[] args) throws Exception {
		Customer customer = new Customer(101, "John", "abc@abc.com", Arrays.asList("1234567890", "0987654321"));

		// three ways to create optional object
		// empty
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);
		
		// of
//		Optional<String> emailOptional = Optional.of(customer.getEmail());	// null point exception
//		System.out.println(emailOptional);
		
		// ofNullable
		Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());	// null point exception
		System.out.println(emailOptional2);
		
		if (emailOptional2.isPresent()) {
			System.out.println(emailOptional2.get());
		}
		
		System.out.println(emailOptional2.orElse("default@abc.com"));
		
		System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));
		
		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(() -> "default email ..."));
		
		findCustomerByEmailId("ccc@abc.com");
		
		findCustomerByEmailId("xyz"); // exception
	}

}
