package com.ava.tfl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.ava.tfl.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.ava.tfl"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
public class TflApp {

	public static void main(String[] args) {
		SpringApplication.run(TflApp.class, args);
	}
}
