package org.workshop.code.test_names;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

public class UserTest2 {
	private User user;
	
	@Before
	public void setup() {
		user = new User();		
	}
	

	@Test
	public void isAdultIfSheIsOlderThan18YearsOld() throws Exception {
		user.setDateOfBirth(asDate("12/11/2009"));
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isNotAndAdultIfSheIs17YearsOldOrYounger() throws Exception {
		user.setDateOfBirth(asDate("12/11/1993"));
		assertThat(user.isAdult(), is(true));
	}
	
	private Date asDate(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		return sdf.parse(str);
	}
}
