package com.ps.new_java.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Callable<Integer> task = () -> {
		    try {
		        TimeUnit.SECONDS.sleep(10);
		        return 123;
		    }
		    catch (InterruptedException e) {
		        throw new IllegalStateException("task interrupted", e);
		    }
		};
		ExecutorService executor = Executors.newFixedThreadPool(10);
		Future<Integer> future = executor.submit(task);

		System.out.println("future done? " + future.isDone());
		executor.shutdownNow();
		Integer result = future.get();

		System.out.println("future done? " + future.isDone());
		System.out.print("result: " + result);
	}

}
