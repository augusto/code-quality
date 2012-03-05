package org.workshop.code.abstraction_level.broken;

import java.util.Date;

public class Product2 {

	private boolean available;
	private int stock;
	private boolean preOrderAvailable;
	private Date preOrderStartDate;
	private Date preOrderEndDate;
	
	public boolean canBePurchased() {
		if( (available && stock > 0) ||
			( preOrderAvailable && 
			  preOrderStartDate.after(new Date()) &&
			  preOrderEndDate.before(new Date()))) {
			return true;
		}
		
		return false;
	}
}
