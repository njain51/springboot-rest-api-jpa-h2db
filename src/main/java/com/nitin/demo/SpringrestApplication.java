package com.nitin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//(scanBasePackages = {"com.nitin.demo.controller", "com.nitin.demo.dao","com.nitin.demo.entities","com.nitin.demo.services"}) - not required as default its doing it
@SpringBootApplication
public class SpringrestApplication
{

	public static void main(String[] args) {
		SpringApplication.run(SpringrestApplication.class, args);
	}

}
