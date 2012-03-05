package org.workshop.tdd.abstraction_level.correct;

import java.util.Date;

public class Product {

	private boolean available;
	private int stock;
	private boolean preOrderAvailable;
	private Date preOrderStartDate;
	private Date preOrderEndDate;
	
	public boolean canBePurchased() {
		return isAvailableNow() || isAvailableForPreOrder();
	}

	private boolean isAvailableForPreOrder() {
		return ( preOrderAvailable && 
		  preOrderStartDate.after(new Date()) &&
		  preOrderEndDate.before(new Date()));
	}

	private boolean isAvailableNow() {
		return (available && stock > 0);
	}
}
