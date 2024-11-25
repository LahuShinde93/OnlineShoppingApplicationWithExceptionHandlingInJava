package com.nit.CustomException;

public class InvalidProductException extends Exception {
 
	private static final long serialVersionUID = 1L;

	public InvalidProductException(String errMsg) {

		super(errMsg);

	}
}
