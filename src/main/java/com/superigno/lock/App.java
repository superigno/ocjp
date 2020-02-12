package com.superigno.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class App {
	
	public static void main(String[] args) throws InterruptedException {
		new App().usingSync();
		System.out.println("---------");
		new App().usingLock();
	}

	private void usingSync() {

		int birdCount = 0;

		// Implementation #1 with synchronization
		Object object = new Object();
		synchronized (object) {
			System.out.println(" " + (++birdCount));
		}

	}

	private void usingLock() throws InterruptedException {

		int birdCount = 0;

		// Implementation #2 with a Lock (alternative to synchronization)
		Lock lock = new ReentrantLock();
		
		/*Lock lock = new ReentrantLock(true);
			When the boolean value is set to true , fairness is enabled and the longest waiting thread is guaranteed to obtain the lock the next time it is released. 
			When the boolean value is set to false , the lock defaults to its normal behavior (random)
		*/
		
		try {
			lock.lock();
			System.out.print(" " + (++birdCount));
		} finally {
			lock.unlock(); // makes sure lock is released; good practice
		}

		if (lock.tryLock()) { // much better since it checks first if a lock is available then acquires it; advantage vs using synchronized block
			try {
				System.out.print(" " + (++birdCount));
			} finally {
				lock.unlock(); // makes sure lock is released; good practice
			}
		} else {
			System.out.println("Unable to acquire lock, doing something else");
		}
		

		if (lock.tryLock(10, TimeUnit.SECONDS)) { //waits for 10 seconds before trying to acquire lock
			try {
				System.out.print(" " + (++birdCount));
			} finally {
				lock.unlock();
			}
		} else {
			System.out.println("Unable to acquire lock, doing something else");
		}

	}

}
