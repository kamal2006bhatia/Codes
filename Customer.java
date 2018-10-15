package com.compare;

public class Customer {
	
	String custName;
	String custAdd;
	Integer custAge;
	
	Customer(String custName, String custAdd, Integer custAge){
		this.custName = custName;
		this.custAdd = custAdd;
		this.custAge = custAge;
		
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAdd() {
		return custAdd;
	}

	public void setCustAdd(String custAdd) {
		this.custAdd = custAdd;
	}

	public Integer getCustAge() {
		return custAge;
	}

	public void setCustAge(Integer custAge) {
		this.custAge = custAge;
	}

	@Override
	public String toString() {
		return "Customer [custName=" + custName + ", custAdd=" + custAdd + ", custAge=" + custAge + "]";
	}
	
	 

}
