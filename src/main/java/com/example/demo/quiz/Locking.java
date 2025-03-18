package com.example.demo.quiz;

import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Locking {

	public static void main(String[] args) {
		var lock = new ReentrantLock();
		var s = IntStream.of(1, 2, 3);
		var i = s.parallel().map(
		  v -> {
		    lock.tryLock();
		    var res = v++;
		    lock.unlock();
		    return res;
		  }
		).sum();
		System.out.println(i);
	}

}
