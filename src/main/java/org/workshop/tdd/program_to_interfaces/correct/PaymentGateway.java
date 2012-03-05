package org.workshop.tdd.program_to_interfaces.correct;


public interface PaymentGateway {
	
	public Reference bill(long accountNumber, double amount);

}
