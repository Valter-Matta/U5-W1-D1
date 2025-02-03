package com.pizzeria.menu;

import com.pizzeria.menu.drink.Drink;
import com.pizzeria.menu.pizze.Pizza;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService implements CommandLineRunner {

	private final List<Pizza> pizzas;
	private final List<Drink> drinks;


	public MenuService(List<Pizza> pizzas, List<Drink> drinks) {
		this.pizzas = pizzas;
		this.drinks = drinks;
	}

	// Metodo per stampare il menù
	public void printMenu() {
		System.out.println("--- MENU PIZZERIA ---");
		System.out.println("PIZZE:");
		pizzas.forEach(System.out::println);
		System.out.println("\nBEVANDE:");
		drinks.forEach(System.out::println);
	}

	@Override
	public void run(String... args) throws Exception {

		printMenu();
	}
}
