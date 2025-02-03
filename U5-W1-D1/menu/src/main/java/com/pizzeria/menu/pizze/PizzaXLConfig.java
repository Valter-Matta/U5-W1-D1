package com.pizzeria.menu.pizze;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaXLConfig {
	@Bean
	public PizzaXL margheritaXL () {
		return new PizzaXL();
	}

	@Bean
	public PizzaXL hawaianaXL () {
		PizzaXL pizza = new PizzaXL();
		pizza.setName("Hawaiana XL");
		pizza.addTopping("Prosciutto", 2, 300);
		pizza.addTopping("Ananas", 2, 200);
		return pizza;
	}
}
