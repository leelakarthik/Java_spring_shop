package com.example.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class ShopApplication {

	public static void main(String[] args) {
		// ApplicationContext ctx = 
		SpringApplication.run(ShopApplication.class, args);

		// System.out.println("Let's inspect the beans provided by Spring Boot:");

		// String[] beanNames = ctx.getBeanDefinitionNames();
		// Arrays.sort(beanNames);
		// for (String beanName : beanNames) {
		// 	System.out.println(beanName);
		// }
	}
}
