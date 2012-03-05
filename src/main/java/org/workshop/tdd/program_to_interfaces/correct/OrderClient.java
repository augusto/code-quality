package org.workshop.tdd.program_to_interfaces.correct;

import org.workshop.tdd.program_to_interfaces.correct.services.BillingService;

public class OrderClient {

	private final BillingService billingService;

	public OrderClient(BillingService billingService) {
		this.billingService = billingService;
	}
	
	public void newOrder() {
		long accountNumber = 58429231L;
		double totalAmount = 9.50;
		
		Order order = new Order(accountNumber, totalAmount);
		order.bill(billingService);
	}
	
}
