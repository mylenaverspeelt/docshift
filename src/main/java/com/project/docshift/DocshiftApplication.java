package com.project.docshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.project.docshift") 
public class DocshiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocshiftApplication.class, args);
	}

}
