package org.workshop.code.law_of_demeter.broken;

public class Paperboy {

	public void billCustomer(Customer customer) {
		
		float payment = 2; // I want my two dollars!
		Wallet theWallet = customer.getWallet();
		if (theWallet.getTotalMoney() > payment) {
			theWallet.subtractMoney(payment);
		} else {
			// come back later and get my money
		}
	}
}
