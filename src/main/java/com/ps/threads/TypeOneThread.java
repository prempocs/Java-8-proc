package com.ps.threads;

/**
 * 
 * @author PremRohan 
 * {@link}Advantage:We can achieve basic functionality of a thread by
 *         extending Thread class because it provides some inbuilt methods like
 *         yield(), interrupt() etc. that are not available in Runnable
 *         interface.
 * 
 */
public class TypeOneThread extends Thread {
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
			TypeOneThread object = new TypeOneThread();
			object.start();
		}
	}
}