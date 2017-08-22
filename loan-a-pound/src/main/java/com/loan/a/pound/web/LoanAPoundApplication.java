package com.loan.a.pound.web;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.loan.a.pound", considerNestedRepositories = true)
@EnableAutoConfiguration
@EntityScan(basePackages="com.loan.a.pound")
public class LoanAPoundApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(LoanAPoundApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		
		return args -> {
			System.out.println("Inspecting the bean provided by Sprint Boot:");
			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName: beanNames) {
				System.out.println(beanName);
			}
		};
		
		
	}
	
}
