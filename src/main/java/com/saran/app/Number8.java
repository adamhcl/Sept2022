package com.saran.app;
//Number 8
public class Number8 {
	public static void main(String[] args) {
		//Print odd numbers between 50 and 100 using Do While Loop
		int counter = 50;
		do {
			if (counter % 2 == 1) {
			System.out.println(counter);
			}
			counter++;
		}while(counter<=100);
	}
}
