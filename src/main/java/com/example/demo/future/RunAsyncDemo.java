package com.example.demo.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunAsyncDemo {
	public void saveEmployees() throws InterruptedException, ExecutionException {
		CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(
			() -> {
				System.out.println("Thread: " + Thread.currentThread().getName());
				System.out.println("Employee number: 1000");
				
			}
		);
		
		runAsyncFuture.get();
	}
	
	public void saveEmployeesWithExecutor() throws InterruptedException, ExecutionException {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(
			() -> {
				System.out.println("Thread: " + Thread.currentThread().getName());
				System.out.println("Employee number: 1000");
				
			}, executor
		);
		
		runAsyncFuture.get();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		RunAsyncDemo demo = new RunAsyncDemo();
		demo.saveEmployees();
		demo.saveEmployeesWithExecutor();

	}

}
