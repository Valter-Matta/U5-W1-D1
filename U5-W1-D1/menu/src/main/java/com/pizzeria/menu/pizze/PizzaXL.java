package com.pizzeria.menu.pizze;

public class PizzaXL extends Pizza {
	public PizzaXL() {
		super();
		setName("Margherita XL");
		this.addTopping("Pomodoro", 0, 100);
		this.addTopping("Mozzarella", 0, 200);
	}
}