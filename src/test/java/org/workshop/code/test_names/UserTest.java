package org.workshop.code.test_names;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserTest {

	private User user;
	
	@Before
	public void setup() {
		user = new User();		
	}

	@Test
	public void isAdult1() throws Exception {
		user.setDateOfBirth( asDate("12/11/2009"));
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isAdult2() throws Exception {
		user.setDateOfBirth( asDate("12/11/1992"));
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isAdult3() throws Exception {
		user.setDateOfBirth( asDate("12/11/1952"));
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isBanned() {
		assertThat(user.isBanned(), is(false));
	}
	
	private Date asDate(String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		return sdf.parse(str);
	}
}
