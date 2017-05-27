package com.medcenter.medcenter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = { "com.medcenter", "medcenter" })
public class MedCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedCenterApplication.class, args);
	}
}
