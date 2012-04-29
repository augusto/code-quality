package org.workshop.code.program_to_interfaces.broken;

import org.workshop.code.program_to_interfaces.broken.services.BillingService;

public class OrderClient {

	private final BillingService billingService;

	public OrderClient(BillingService billingService) {
		this.billingService = billingService;
	}
	
	public void newOrder() {
		long accountNumber = 58429231L;
		double totalAmount = 9.50;
		
		Order order = new Order(accountNumber, totalAmount);
		Reference reference = billingService.bill(order.getAccountNumber(), order.getTotalAmount());
		order.bill(reference);
	}
}
