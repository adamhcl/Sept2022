package com.saran.app;
//Number 16
public class Number16 {
	//using super keyword for Person parent class and Hero subclass
	public static void main(String[] args) {
		Hero hero1 = new Hero("Batman", 35, "Money");
		Hero hero2 = new Hero("Superman", 37, "Alien");
		
		System.out.println(hero1.toString());
		System.out.println(hero2.toString());
	
	}
}
