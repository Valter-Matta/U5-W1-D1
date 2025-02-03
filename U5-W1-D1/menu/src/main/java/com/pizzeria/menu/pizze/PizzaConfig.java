package com.pizzeria.menu.pizze;


import com.pizzeria.menu.MenuService;
import com.pizzeria.menu.drink.Drink;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class PizzaConfig {

	@Bean
	public Pizza margherita() {
		Pizza pizza = new Pizza();
		return pizza;
	}

	@Bean
	public Pizza hawaiana() {
		Pizza pizza = new Pizza();
		pizza.setName("Hawaiana");
		pizza.addTopping("Prosciutto", 1.5, 200);
		pizza.addTopping("Ananas", 1.0, 100);
		return pizza;
	}

	@Bean
	public PizzaXL margheritaXL() {
		return new PizzaXL();
	}

	@Bean
	public Drink cola() {
		return new Drink("Cola", 2.00, 150);
	}

	@Bean
	public Drink beer() {
		return new Drink("Birra", 3.50, 200);
	}

	@Bean
	public MenuService menu() {
		return new MenuService(Arrays.asList(margherita(), hawaiana(), margheritaXL()), Arrays.asList(cola(), beer()));
	}
}