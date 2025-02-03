package com.pizzeria.menu.pizze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class Pizza {
	private String name;
	private double price;
	private int calories;
	private List<String> toppings;

	public Pizza() {
		this.name = "Margherita";
		this.price = 5.00;
		this.calories = 800;
		this.toppings = new ArrayList<>();
		this.toppings.add("Pomodoro");
		this.toppings.add("Mozzarella");
	}

	public void addTopping(String topping, double priceIncrease, int calIncrease) {
		this.toppings.add(topping);
		this.price += priceIncrease;
		this.calories += calIncrease;
	}

	@Override
	public String toString() {
		return name + " | Prezzo: €" + price + " | Calorie: " + calories + " | Toppings: " + String.join(", ", toppings);
	}
}
