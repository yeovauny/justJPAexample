package com.tyr.service.ls.onetomany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tyr.service.ls.onetomany.*",
			})
public class OnetoManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnetoManyApplication.class, args);
	}

}
