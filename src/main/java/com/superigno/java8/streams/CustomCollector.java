package com.superigno.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * https://stackoverflow.com/a/51454744/3747493 and https://stackoverflow.com/a/51453154/3747493
 * 
 * If you don't use custom collector, you can only do aggregate of one column ie: total only instead of total and balance
 * 
 * 
 * <R> R collect(Supplier<R> supplier,
 *            BiConsumer<R,? super T> accumulator,
 *            BiConsumer<R,R> combiner)
 *   
 *  supplier - a function that creates a new result container (mutable object) . For a parallel execution, this function may be called multiple times. It must return a fresh value each time.
 *  accumulator - a function for incorporating an additional element into a result.
 *  combiner - a function for combining two values, used in parallel stream, combines the results received from different threads. 
 *  
 *  - g1q for parallel stream lang need ang combiner, kaya mapapansin mo parang inulit lang with accumulator, it is explained here with illustration: https://stackoverflow.com/a/33971436/3747493
 *  
 */

public class CustomCollector {
	
	private static List<Customer> listCust;
	
	static {
		
		Customer custa = new Customer("A", 1000, 1500);
		Customer custa1 = new Customer("A", 2000, 2500);
		Customer custb = new Customer("B", 3000, 3500);
		Customer custc = new Customer("C", 4000, 4500);
		Customer custa2 = new Customer("A", 1500, 2500);
		listCust = new ArrayList<>();
		listCust.add(custa);
		listCust.add(custa1);
		listCust.add(custb);
		listCust.add(custc);
		listCust.add(custa2);
		
	}
	
	public static void main(String str[]) {
		
		Map<String, Double> retObjOneColumnSum = listCust.stream().collect(Collectors.groupingBy(Customer::getName, Collectors.summingDouble(Customer::getTotal)));
		System.out.println("Group by with sum of total column: \n"+retObjOneColumnSum);
		
		
		Map<String, Customer> retObjTwoColumnSum = listCust.stream().collect(Collectors.groupingBy(Customer::getName, customerCollector()));
		System.out.println("Group by with sum of total and balance columns using custom collector: \n"+retObjTwoColumnSum);
		
		Map<String, Customer> retObjTwoColumnSum2 = listCust.stream().collect(Collectors.groupingBy(Customer::getName, customerCollector2()));
		System.out.println("Group by with sum of total and balance columns using custom collector2: \n"+retObjTwoColumnSum2);
		

	}
	
	public static Collector<Customer, Customer, Customer> customerCollector2() {
	    return Collector.of(
                Customer::new,
                (c1, c2) -> {
                    c1.setName(c2.getName());
                    c1.setTotal(c1.getTotal() + c2.getTotal());
                    c1.setBalance(c1.getBalance() + c2.getBalance());
                },
                (c3, c4) -> {
                    c3.setTotal(c3.getTotal() + c4.getTotal());
                    c3.setBalance(c3.getBalance() + c4.getBalance());
                    return c3;
                });
	}
	
	
	public static Collector<Customer, Customer, Customer> customerCollector() {
	    return Collector.of(
	    		Customer::new, 
	    		CustomCollector::merge,
	            (l, r) -> {
	                merge(l, r);
	                return l;
	            });
	}
	
	

	public static void merge(final Customer first, final Customer second) {
	    first.setName(second.getName());
	    first.setTotal(first.getTotal() + second.getTotal());
	    first.setBalance(first.getBalance() + second.getBalance());
	}
	
	//

	private static class Customer {
		private String name;
		private double total;
		private double balance;
		
		public Customer() {
			
		}

		public Customer(String name, double total, double balance) {
			super();
			this.name = name;
			this.total = total;
			this.balance = balance;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getTotal() {
			return total;
		}

		public void setTotal(double total) {
			this.total = total;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		@Override
		public String toString() {
			return "Customer [name=" + name + ", total=" + total + ", balance=" + balance + "]";
		}

	}

}
