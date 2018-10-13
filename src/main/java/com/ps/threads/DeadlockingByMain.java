package com.ps.threads;

public class DeadlockingByMain {
	public static void main(String[] args) {
		try {
			System.out.println("Entering into Deadlock");
			Thread.currentThread().join();
			// the following statement will never execute
			System.out.println("This statement will never execute");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/*
 * The statement “Thread.currentThread().join()”, will tell Main thread to wait
 * for this thread(i.e. wait for itself) to die. Thus Main thread wait for
 * itself to die, which is nothing but a deadlock.
 */
