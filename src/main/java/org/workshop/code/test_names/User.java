package org.workshop.code.test_names;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class User {

	private Date dateOfBirth;
	
	public boolean isAdult() {
		Calendar eightTeenYearsAgo = new GregorianCalendar();
		eightTeenYearsAgo.add(Calendar.YEAR, -18);
		
		if( eightTeenYearsAgo.before(dateOfBirth) ) {
			return false;
		}
		
		return true;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isBanned() {
		return false;
	}

}
