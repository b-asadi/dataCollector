package com.datacollector;
//
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class DC_service {
	
	public void randomAlphabeticString() {
	    int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		 
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	    .limit(targetStringLength)
	    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
		.toString();
		 
		System.out.println(generatedString);
	}
}
