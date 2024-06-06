package com.cjc.demo.exxception;

public class InvalidEmailIdException extends RuntimeException {

	public InvalidEmailIdException(String msg) {
		super(msg);
	}
	
}
