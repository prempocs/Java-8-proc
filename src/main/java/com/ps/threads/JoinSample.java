package com.ps.threads;

public class JoinSample implements Runnable {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current thread: " + t.getName());

		// checks if current thread is alive
		System.out.println("Is Alive? " + t.isAlive());
	}

	public static void main(String args[]) throws Exception {
		Thread t = new Thread(new JoinSample());
		t.start();

		// Waits for 1000ms this thread to die.
		t.join(100000);

		System.out.println("\nJoining after 1000" + " mili seconds: \n");
		System.out.println("Current thread: " + t.getName());

		// Checks if this thread is alive
		System.out.println("Is alive? " + t.isAlive());
	}
}
/*
 * If any executing thread t1 calls join() on t2 i.e; t2.join() immediately t1
 * will enter into waiting state until t2 completes its execution. Giving a
 * timeout within join(), will make the join() effect to be nullified after the
 * specific timeout.
 */
