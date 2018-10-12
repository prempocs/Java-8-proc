package com.ps.new_java.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public interface InvokeAnyInterface{
	default Callable<String> callable(String result, long sleepSeconds) {
	    return () -> {
	        TimeUnit.SECONDS.sleep(sleepSeconds);
	        return result;
	    };
	}
}
 class InvokeAnyMain implements InvokeAnyInterface {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executor = Executors.newWorkStealingPool();
		InvokeAnyInterface iai = new InvokeAnyInterface() {
		};
		List<Callable<String>> callables = Arrays.asList(
				iai.callable("task1", 2),
				iai.callable("task2", 1),
				iai.callable("task3", 3));

		String result = executor.invokeAny(callables);
		System.out.println(result);

	}

}
