package com.example.demo.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class WhyNotFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newFixedThreadPool(10);
		Future<List<Integer>> future = service.submit(() -> {
			System.out.println("Thread: " + Thread.currentThread().getName());
			return Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		});
		
		List<Integer> list = future.get();
		System.out.println(list);
 	}

}
