package com.jarvis.microservices.limitsservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jarvis.microservices.limitsservice.bean.Limits;

@RestController
@RequestMapping("/api/v1/limits-service")
public class LimitsController {
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		
		return new Limits(1,1000);
	}

}
