package com.nit.CustomException;

public class InsufficientQuantityException extends Exception {
 
	private static final long serialVersionUID = 1L;

	public InsufficientQuantityException(String errMsg) {
		super(errMsg);
	}
}
