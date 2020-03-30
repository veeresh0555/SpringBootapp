package com.example.controllere;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employeactivities/api/msg")
public class TestRestController {

	
	@GetMapping
	public String getMessage() {
		return "Hi.....This is first";
	}
	@GetMapping("/msg2")
	public String getMessag2() {
		return "Hi.....This is Second";
	}
	
	
	
	
	
	
	
	
	
}
