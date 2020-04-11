package com.emp.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.emp.model.ErrorResponse;

@RestControllerAdvice
public class RestAdviceController {

	
	@ExceptionHandler(value=RecordNotFoundException.class)
	public ErrorResponse RecoredNotFoundException(RecordNotFoundException recordnfound) {
		ErrorResponse response=new ErrorResponse("Error-101",recordnfound.getMessage());
		//response.setErrorcode("Error-001");
		//response.setErrmessage(recordnfound.getMessage());
		return response;
	}
	
	
	
	
	
}
