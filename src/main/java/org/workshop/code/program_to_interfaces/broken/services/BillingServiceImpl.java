package org.workshop.code.program_to_interfaces.broken.services;

import org.workshop.code.program_to_interfaces.broken.Reference;

public class BillingServiceImpl implements BillingService {

	@Override
	public Reference bill(long accountNumber, double amount) {
		// Invoke payment gateway
		return new Reference("AUTHCODE-QWERTY123");
	}
}
