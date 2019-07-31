package com.training.springboot.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.entities.MyRequest;
import com.training.springboot.entities.Region;
import com.training.springboot.service.TrainingAPIService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	public static final Logger logger = LoggerFactory.getLogger(APIController.class);
	
	@Autowired
	TrainingAPIService trainingAPIService;

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, welcome to Spring Boot Training";
	}
	
	@PostMapping("/myRequest")
	public MyRequest myRequest(@RequestBody MyRequest myrequest) {
		
		System.out.println(myrequest);
		myrequest.setAge(33);
		return myrequest;
	}
	
	@GetMapping("/region")
	public ResponseEntity<List<Region>> getAllRegions() {
		
		logger.info(">>>>> getAllRegions() service method called");
		
		List<Region> regionList = trainingAPIService.getAllRegions();
		
		if (regionList.isEmpty() || regionList == null) {
			throw new RuntimeException("No Regions found");
		}
		
		return new ResponseEntity<List<Region>>(regionList, HttpStatus.OK);
	}
}
