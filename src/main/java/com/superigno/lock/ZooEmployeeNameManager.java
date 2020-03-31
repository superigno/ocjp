package com.superigno.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ZooEmployeeNameManager {
	
	private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private List<String> names = new ArrayList<>();

	public ZooEmployeeNameManager() {
		names.add("John Smith");
		names.add("Sarah Smith");
		names.add("James Johnson");
	}

	private String readNames(int i) {
		Lock lock = readWriteLock.readLock(); //Returns a lock that may be held simultaneously by multiple threads and is therefore not mutually exclusive.
		try {
			lock.lock();
			System.out.println("Read Lock Obtained!");
			return names.get(i % names.size());
		} finally {
			System.out.println("Read Lock Released!");
			lock.unlock();
		}
	}

	private void addName(String name) {
		Lock lock = readWriteLock.writeLock(); //Returns a lock that is exclusive to all other locks, read and write, and may only be held by a single thread.
		//Pag nirun mo hindi humahalo ang threads ni writeLock kasi exclusive siya - g1q 
		
		/**
		 * The idea is that many threads can be granted a lock to read the object, but a write object is special and can be granted only if no threads are holding any locks on the object. 
		 * Once a write lock is granted, all requests for locks are held until the write lock is released. In this manner, threads performing read operations can continue reading the data concurrently, 
	     * stopping to wait only when a single thread has been granted a write access.
	     *  
		 * **/
		
		try {
			lock.lock();
			System.out.println("Write Lock Obtained!");
			Thread.sleep(1000);
			names.add(name);
		} catch (InterruptedException e) {
// Handle thread interrupted exception
		} finally {
			System.out.println("Write Lock Released!");
			lock.unlock();
		}
	}

	public static void main(String[] args) {
		ZooEmployeeNameManager manager = new ZooEmployeeNameManager();
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			for (int i = 0; i < 100; i++) {
				final int employeeNumber = i;
				service.submit(() -> manager.readNames(employeeNumber));
			}
			service.submit(() -> manager.addName("Grace Hopper"));
			service.submit(() -> manager.addName("Josephine Davis"));
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}
