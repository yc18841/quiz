package com.example.demo;

public abstract class SupA {
	SupA() { this(null); }
	SupA(SubA s) {this.init();}
	abstract void init();
}
class SubA extends SupA {
	void init() {System.out.print("SubA");}
	public static void main(String[] args) {
		new SubA();
	}
}