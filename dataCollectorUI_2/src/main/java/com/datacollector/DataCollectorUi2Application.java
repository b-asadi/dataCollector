package com.datacollector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.*, come.datacollector")
public class DataCollectorUi2Application 
{
	public static void main(String[] args) {
		SpringApplication.run(DataCollectorUi2Application.class, args);

	}
}//

