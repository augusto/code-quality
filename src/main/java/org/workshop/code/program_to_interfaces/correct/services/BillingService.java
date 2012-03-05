package org.workshop.code.program_to_interfaces.correct.services;

import org.workshop.code.program_to_interfaces.correct.PaymentGateway;
import org.workshop.code.program_to_interfaces.correct.Reference;

public class BillingService implements PaymentGateway {

	@Override
	public Reference bill(long accountNumber, double amount) {
		// Invoke payment gateway
		return new Reference("AUTHCODE-QWERTY123");
	}
}
