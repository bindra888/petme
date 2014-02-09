package com.petme.exceptions;

/**
 * General Pet Exception. All other business specific exceptions must extend
 * this.
 * 
 * @author Taman Bindra
 * 
 */

public class PetException extends Exception {

	public PetException(String e) {
		super(e);
		this.e = e;
	}

	private String e;

}
