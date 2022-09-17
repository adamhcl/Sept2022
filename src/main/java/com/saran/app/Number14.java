package com.saran.app;
//Number 14
public class Number14 {
	public static void main(String[] args) {
		//Constructer overloading example, pizza.
		//Pizza pizza = new Pizza("thin crust","tomato", "mozzeralla","ham"); //pizza with all ingredients
		//Pizza pizza = new Pizza("thin crust","tomato", "mozzeralla"); //pizza with 3 ingredients
		Pizza pizza = new Pizza("thin crust"); //pizza with 1 ingredient
		//Pizza pizza = new Pizza(); //pizza with no ingredients
		
		System.out.println("Here are the ingredients of your pizza");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
	}
}
