package edu.jsp.employeeapp.exception;

public class IdDoesNotFoundException extends RuntimeException {

	String message = "Id is not present";

	public IdDoesNotFoundException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
