package com.compare;

import java.util.Comparator;

public class CustomerSorting implements Comparator<Customer>{
	
	@Override
	public int compare(Customer cust1, Customer cust2) {
		
		int compName = cust1.getCustName().compareTo(cust2.getCustName());
		int compAdd = cust1.getCustAdd().compareTo(cust2.getCustAdd());
		int compAge = cust1.getCustAge().compareTo(cust2.getCustAge());
	

	
	   if(compName==0) {
		   return ((compAdd==0) ? compAge : compAdd);
	   }
	   
	   else {
		   return compName;
	   }
	 
	}
}
