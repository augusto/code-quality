package org.workshop.code.program_to_interfaces.broken.services;

import org.workshop.code.program_to_interfaces.broken.Reference;

public interface BillingService {
	
	public Reference bill(long accountNumber, double amount);

}
