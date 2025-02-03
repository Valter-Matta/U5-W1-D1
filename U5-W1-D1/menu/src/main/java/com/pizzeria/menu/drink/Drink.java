package com.pizzeria.menu.drink;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drink {
	private String name;
	private double price;
	private int calories;

	@Override
	public String toString() {
		return name + " | Prezzo: €" + price + " | Calorie: " + calories;
	}
}
