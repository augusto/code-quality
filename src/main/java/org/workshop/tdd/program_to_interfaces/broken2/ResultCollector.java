package org.workshop.tdd.program_to_interfaces.broken2;

public interface ResultCollector<T> {
	
	void setResult(String result);
	
	T getResult();

}
