package org.workshop.code.test_names;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class UserTest {

	private User user;

	@Test
	public void isAdult1() {
		user.setDateOfBirth(/* 12/11/2009 */);
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isAdult2() {
		user.setDateOfBirth(/* 12/11/1992 */);
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isAdult3() {
		user.setDateOfBirth(/* 12/11/1952 */);
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isBanned() {
		assertThat(user.isBanned(), is(false));
	}
}
