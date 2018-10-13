package com.ps.threads;

import java.util.concurrent.Semaphore;

//A shared resource/class. 
class Shared {
	static int count = 0;
}

class MySemaphoreThread extends Thread {
	Semaphore sem;
	String threadName;

	public MySemaphoreThread(Semaphore sem, String threadName) {
		super(threadName);
		this.sem = sem;
		this.threadName = threadName;
	}

	@Override
	public void run() {

		// run by thread A
		if (this.getName().equals("A")) {
			System.out.println("Starting " + threadName);
			try {
				// First, get a permit.
				System.out.println(threadName + " is waiting for a permit.");

				// acquiring the lock
				sem.acquire();

				System.out.println(threadName + " gets a permit.");

				// Now, accessing the shared resource.
				// other waiting threads will wait, until this
				// thread release the lock
				for (int i = 0; i < 5; i++) {
					Shared.count++;
					System.out.println(threadName + ": " + Shared.count);

					// Now, allowing a context switch -- if possible.
					// for thread B to execute
					Thread.sleep(10);
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}

			// Release the permit.
			System.out.println(threadName + " releases the permit.");
			sem.release();
		}

		// run by thread B
		else {
			System.out.println("Starting " + threadName);
			try {
				// First, get a permit.
				System.out.println(threadName + " is waiting for a permit.");

				// acquiring the lock
				sem.acquire();

				System.out.println(threadName + " gets a permit.");

				// Now, accessing the shared resource.
				// other waiting threads will wait, until this
				// thread release the lock
				for (int i = 0; i < 5; i++) {
					Shared.count--;
					System.out.println(threadName + ": " + Shared.count);

					// Now, allowing a context switch -- if possible.
					// for thread A to execute
					Thread.sleep(10);
				}
			} catch (InterruptedException exc) {
				System.out.println(exc);
			}
			// Release the permit.
			System.out.println(threadName + " releases the permit.");
			sem.release();
		}
	}
}

//Driver class 
public class SemaphoreSample {
	public static void main(String args[]) throws InterruptedException  
  { 
      // creating a Semaphore object 
      // with number of permits 1 
      Semaphore sem = new Semaphore(2); 
        
      // creating two threads with name A and B 
      // Note that thread A will increment the count 
      // and thread B will decrement the count 
      MySemaphoreThread mt1 = new MySemaphoreThread(sem, "A"); 
      MySemaphoreThread mt2 = new MySemaphoreThread(sem, "B"); 
        
      // stating threads A and B 
      mt1.start(); 
      mt2.start(); 
        
      // waiting for threads A and B  
      mt1.join(); 
      mt2.join(); 
        
      // count will always remain 0 after 
      // both threads will complete their execution 
      System.out.println("count: " + Shared.count); 
  
}}
/*
 * Explanation of above program :
 * 
 * The program uses a semaphore to control access to the count variable, which
 * is a static variable within the Shared class. Shared.count is incremented
 * five times by thread A and decremented five times by thread B.To prevent
 * these two threads from accessing Shared.count at the same time, access is
 * allowed only after a permit is acquired from the controlling semaphore. After
 * access is complete, the permit is released. In this way, only one thread at a
 * time will access Shared.count, as the output shows. Notice the call to sleep(
 * ) within run( ) method inside MyThread class. It is used to “prove” that
 * accesses to Shared.count are synchronized by the semaphore. In run( ), the
 * call to sleep( ) causes the invoking thread to pause between each access to
 * Shared.count. This would normally enable the second thread to run. However,
 * because of the semaphore, the second thread must wait until the first has
 * released the permit, which happens only after all accesses by the first
 * thread are complete. Thus, Shared.count is first incremented five times by
 * thread A and then decremented five times by thread B. The increments and
 * decrements are not intermixed at assembly code. Without the use of the
 * semaphore, accesses to Shared.count by both threads would have occurred
 * simultaneously, and the increments and decrements would be intermixed.To
 * confirm this, try commenting out the calls to acquire( ) and release( ). When
 * you run the program, you will see that access to Shared.count is no longer
 * synchronized, thus you will not always get count value 0.
 */
 