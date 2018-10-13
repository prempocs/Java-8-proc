package com.ps.threads;

/**
 * 
 * @author PremRohan 
 * Advantage:If we extend the Thread class, our class cannot
 *         extend any other class because Java doesn’t support multiple
 *         inheritance. But, if we implement the Runnable interface, our class
 *         can still extend other base classes.
 * 
 */
public class TypeTwoThread implements Runnable {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}

	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < 8; i++) {
			Thread object = new Thread(new TypeTwoThread());
			object.start();
		}
	}
}