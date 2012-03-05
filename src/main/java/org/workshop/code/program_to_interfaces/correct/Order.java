package org.workshop.code.program_to_interfaces.correct;

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

	public void bill(PaymentGateway paymentGateway) {
		reference = paymentGateway.bill(accountNumber, totalAmount);
		// Move the order to another state and/or update other fields.
	}
}
