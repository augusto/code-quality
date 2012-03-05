package org.workshop.tdd.law_of_demeter.correct;

public class Customer {
	private String firstName;
	private String lastName;
	private Wallet myWallet;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean getPayment(float payment) {
		if (myWallet != null) {
			if (myWallet.getTotalMoney() > payment) {
				myWallet.subtractMoney(payment);
				return true;
			}
		}
		return false;
	}
}
