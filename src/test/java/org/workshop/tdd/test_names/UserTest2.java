package org.workshop.tdd.test_names;

import org.junit.Test;

import static org.hamcrest.Matchers.is;

import static org.hamcrest.MatcherAssert.assertThat;

public class UserTest2 {
	private User user;

	@Test
	public void isAdultIfSheIsOlderThan18YearsOld() {
		user.setDateOfBirth(/* 12/11/2009 */);
		assertThat(user.isAdult(), is(true));
	}

	@Test
	public void isNotAndAdultIfSheIs17YearsOldOrYounger() {
		user.setDateOfBirth(/* 12/11/1993 */);
		assertThat(user.isAdult(), is(true));
	}
}
