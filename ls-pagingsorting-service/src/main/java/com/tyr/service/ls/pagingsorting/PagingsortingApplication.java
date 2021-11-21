package com.tyr.service.ls.pagingsorting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tyr.service.ls.pagingsorting.*"})
public class PagingsortingApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagingsortingApplication.class, args);
	}

}
