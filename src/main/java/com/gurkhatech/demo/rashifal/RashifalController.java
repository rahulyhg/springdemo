package com.gurkhatech.demo.rashifal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RashifalController {

	@Autowired
	private RashifalService service;
	
	@RequestMapping("rashifal/hey")
	public String sayHey() {
		return service.getGreetingMessage();
	}
}
