package com.example.demo.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(2, // corePoolSize
				4, // maximumPoolSize
				10, // keepAliveTime
				TimeUnit.SECONDS, new LinkedBlockingQueue<>(2) // Task queue with capacity 2
		);

		for (int i = 1; i <= 6; i++) {
			final int taskId = i;
			executor.execute(() -> {
				System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName());
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}

		System.out.println("Active Threads: " + executor.getActiveCount());
		executor.shutdown();
	}
}
