package com.juan.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.juan.batch")
public class SpringBatchApplication {

	public static void main(String[] args) throws Exception {
	    System.exit(SpringApplication.exit(SpringApplication.run(SpringBatchApplication.class, args)));
	  }
	}