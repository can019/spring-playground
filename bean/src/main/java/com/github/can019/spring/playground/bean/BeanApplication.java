package com.github.can019.spring.playground.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class BeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);
	}

}
