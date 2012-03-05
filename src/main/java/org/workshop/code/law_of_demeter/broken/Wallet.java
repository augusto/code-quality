package org.workshop.code.law_of_demeter.broken;

public class Wallet {
	private float value;

	public float getTotalMoney() {
		return value;
	}

	public void setTotalMoney(float newValue) {
		value = newValue;
	}

	public void addMoney(float deposit) {
		value += deposit;
	}

	public void subtractMoney(float debit) {
		value -= debit;
	}
}
