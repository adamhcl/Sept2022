package com.saran.app;
//Number 12
//Example of inheritance
class Animal{
	protected String type = "Dog";
	public void noise() {
		System.out.println("Woof, Woof");
	}
}
class Number12 extends Animal {
	private String breed = "Pitbull";
	public static void main(String[] args) {
		Number12 myDog = new Number12();
		myDog.noise();
		System.out.println(myDog.type + " " + myDog.breed);
		
	}
}
