package com.compare;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomerSortTesting {
	
	public static void main(String[] args) {
		
		List<Customer> listofCustomer = new ArrayList<Customer>();
		
		Customer cust1 = new Customer("Shalu","chennai",30);
		Customer cust2 = new Customer("kamal","delhi",20);
		Customer cust3 = new Customer("vipul","mumbai",70);
		Customer cust4 = new Customer("anant","pune",50);
		Customer cust5 = new Customer("garima","hyderabad",90);
		Customer cust6 = new Customer("divya","orrisa",60);
		
		listofCustomer.add(cust1);
		listofCustomer.add(cust2);
		listofCustomer.add(cust3);
		listofCustomer.add(cust4);
		listofCustomer.add(cust5);
		listofCustomer.add(cust6);
		
		
		Iterator<Customer> custIterator = listofCustomer.iterator();
		
		System.out.println("Before sorting\n");
		
		while(custIterator.hasNext()) {
			System.out.println(custIterator.next());
			
		}
		
		Collections.sort(listofCustomer, new CustomerSorting());
		System.out.println("After Sorting\n");
		
		for(Customer customer: listofCustomer) {
			System.out.println(customer);
		}
		
		
	}

}
