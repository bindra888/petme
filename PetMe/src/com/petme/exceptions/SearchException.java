package com.petme.exceptions;

/**
 * Exception for Search
 * 
 * @author Taman Bindra
 * 
 */

public class SearchException extends PetException {

	public SearchException(String e) {
		super(e);
		this.e = e;
	}

	private String e;

}
