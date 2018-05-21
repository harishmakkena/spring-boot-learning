package com.learningbydoing.controller;

import java.util.Date;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	

    @RequestMapping(method=RequestMethod.GET, value= "/greet" )
	public String greet() {
		
		return   "Hello World : " + new Date();  
	}
	
	
}
