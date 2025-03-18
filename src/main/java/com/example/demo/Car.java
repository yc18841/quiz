package com.example.demo;

public class Car extends Vehicle {
	int y;
	
	Car() {
		super();
		// this(20); // must be first
	}
	
	Car(int y) {
		this.y = y;
	}
}
