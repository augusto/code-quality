package org.workshop.code.program_to_interfaces.correct;


public interface PaymentGateway {
	
	public Reference bill(long accountNumber, double amount);

}
