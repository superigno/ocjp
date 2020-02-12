package com.superigno.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DuplicateLock {
	
	public static void main(String[] args) {
		new DuplicateLock().duplicateLock(1);
	}

	private void duplicateLock(int birdCount) {
		
		Lock lock = new ReentrantLock();
		try {
			lock.lock();
			lock.lock();
			++birdCount;
		} finally {
			lock.unlock(); //The unlock() method must be called the same number of times as the lock() method in order to release the lock. Therefore, this code outputs Unavailable
		}
		new Thread(() -> {
			if (lock.tryLock()) {
				try {
					System.out.println("Acquired");
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("Unavailable");
			}
		}).start();

	}

}
