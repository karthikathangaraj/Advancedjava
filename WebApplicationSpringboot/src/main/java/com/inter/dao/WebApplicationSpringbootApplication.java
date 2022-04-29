package com.inter.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.inter.dao.controll"})
@ComponentScan(basePackages= {"com.springboot2.jdbc.model"})
@ComponentScan(basePackages= {"com.springboot2.jdbc.service"})
@ComponentScan(basePackages= {"com.springboot"})
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class WebApplicationSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplicationSpringbootApplication.class, args);
	}

}
