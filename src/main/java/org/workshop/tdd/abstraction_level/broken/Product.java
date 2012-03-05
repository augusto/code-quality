package org.workshop.tdd.abstraction_level.broken;

import java.util.Date;

public class Product {

	private boolean available;
	private int stock;
	private boolean preOrderAvailable;
	private Date preOrderStartDate;
	private Date preOrderEndDate;
	
	public boolean canBePurchased() {
		if( (available && stock > 0) ||
			isAvailableForPreOrder()) {
			return true;
		}
		
		return false;
	}

	private boolean isAvailableForPreOrder() {
		return ( preOrderAvailable && 
		  preOrderStartDate.after(new Date()) &&
		  preOrderEndDate.before(new Date()));
	}
}
