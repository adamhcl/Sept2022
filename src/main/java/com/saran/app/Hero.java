package com.saran.app;
//For number 16
public class Hero extends Person {
	String power;
	
	Hero(String name, int age, String power) {
		super(name, age); //refers to "super" class, Person in this example
		this.power = power; //refers to "this" class, Hero in this example
	}
	public String toString() {
		return super.toString()+this.power+"\n";
	}
}
