package org.workshop.tdd.program_to_interfaces.broken;

public class Reference {

	private String authorizationCode;

	public Reference(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}
}
