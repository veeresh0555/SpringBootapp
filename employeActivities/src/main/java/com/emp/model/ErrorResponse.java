package com.emp.model;

public class ErrorResponse {

	private String errorcode;
	private String errmessage;
	
	
	
	public ErrorResponse(String errorcode, String errmessage) {
		this.errorcode = errorcode;
		this.errmessage = errmessage;
	}
	
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrmessage() {
		return errmessage;
	}
	public void setErrmessage(String errmessage) {
		this.errmessage = errmessage;
	}
	
	
	
	
	
}
