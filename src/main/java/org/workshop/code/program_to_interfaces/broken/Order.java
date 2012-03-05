package org.workshop.code.program_to_interfaces.broken;

public class Order {
	private long accountNumber;
	private double totalAmount;
	private Reference reference;

	
	public Order(long accountNumber, double totalAmount) {
		this.accountNumber = accountNumber;
		this.totalAmount = totalAmount;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getTotalAmount() {
		return totalAmount;
	}

	public void bill(Reference reference) {
		this.reference = reference;
		//update order state and/or other fields.
	}
}
