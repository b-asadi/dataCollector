package com.datacollector;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ui")
public class DataCollectorController {
	
	@Autowired
	DataCollectorRepository dcRepo;
		
	public void gui() {
		System.out.println("ui started !!!");
	}
	
	// get DC value
	// set DC value
	// update DC value
	//
}
