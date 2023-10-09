package edu.jsp.exceptionhandling.bean;

public class ResponseStructure<T> {

	private int status;
	private String message;
	private T data;

	public int getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}

	public T getData() {
		return data;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setData(T data) {
		this.data = data;
	}

	public ResponseStructure() {
	}

}
