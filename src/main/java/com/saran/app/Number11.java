package com.saran.app;
//Number 11
public class Number11 {
	public static void main(String[] args) {
		//For loop from 50 to 100, printing even numbers until 75 is reached
		for (int i=50; i<=100;i++) {
			if (i == 75) {
				break;
			}
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
