package com.cg.model;

public class Customer 
{
	private int CustomerId;
	private String CustomerName;
	private int CustomerContact;
	private Address CustomerAddress;


	/*public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public void setCustomerContact(int customerContact) {
		CustomerContact = customerContact;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}*/

	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {

		CustomerId = customerId;
		CustomerName = customerName;
		CustomerContact = customerContact;
		CustomerAddress = customerAddress;
	}

	public void displayCustomerInfo()
	{
		System.out.println("customerid is" +CustomerId+  "customername is" +CustomerName+ 
				"customercontext is "+CustomerContact+ "customeraddress is" +CustomerAddress);
	}

}

