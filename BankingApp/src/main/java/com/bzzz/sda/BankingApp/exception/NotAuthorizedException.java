package com.bzzz.sda.BankingApp.exception;

public class NotAuthorizedException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public NotAuthorizedException(String message) {
		super(message);
	}
}
