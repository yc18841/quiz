package com.example.demo.future;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {

	public List<Integer> getIntegers() throws InterruptedException, ExecutionException {
		CompletableFuture<List<Integer>> listCompletableFuture = CompletableFuture
				.supplyAsync(() -> {
					System.out.println("Executed by thread: " + Thread.currentThread().getName());
					return Arrays.asList(1, 2, 3, 4);
				});

		return listCompletableFuture.get();
	}
	
	public List<Integer> getIntegersWithExecutor() throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newCachedThreadPool();
		CompletableFuture<List<Integer>> listCompletableFuture = CompletableFuture
				.supplyAsync(() -> {
					System.out.println("Executed by thread: " + Thread.currentThread().getName());
					return Arrays.asList(1, 2, 3, 4);
				}, executor);

		return listCompletableFuture.get();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		SupplyAsyncDemo demo = new SupplyAsyncDemo();
		List<Integer> integers = demo.getIntegers();
		System.out.println(integers);
		
		List<Integer> integers1 = demo.getIntegersWithExecutor();
		System.out.println(integers1);
	}

}
