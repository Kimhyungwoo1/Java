package com.ktds.khw.exceptions;

public class MissmatchValueException extends RuntimeException{

	private static final long serialVersionUID = -139898143721761726L;

	public MissmatchValueException() {
		super();
	}

	public MissmatchValueException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MissmatchValueException(String message, Throwable cause) {
		super(message, cause);
	}

	public MissmatchValueException(String message) {
		super(message);
	}

	public MissmatchValueException(Throwable cause) {
		super(cause);
	}

}
