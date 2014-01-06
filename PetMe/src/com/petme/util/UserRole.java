package com.petme.util;

/**
 * Different roles which a user of this site could have.
 * 
 * @author Sandeep Bindra
 * 
 */
public enum UserRole {

	ROLE_ADMIN("ROLE_ADMIN"), 
	ROLE_USER_GHOST("ROLE_USER_GHOST"), 
	ROLE_USER_REGD("ROLE_USER_REGD"), 
	ROLE_SERVICE_PROVIDER("ROLE_SERVICE_PROVIDER");

	private String code;

	private UserRole(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return code;
	}
}
