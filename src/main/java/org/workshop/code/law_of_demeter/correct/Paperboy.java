package org.workshop.code.law_of_demeter.correct;

public class Paperboy {

	public void billCustomer(Customer customer) {
		float payment = 2; // �I want my two dollars!�
		boolean paymentTaken = customer.getPayment(payment);
		if (paymentTaken) {
			// say thank you and give customer a receipt
		} else {
			// come back later and get my money
		}
	}

}
