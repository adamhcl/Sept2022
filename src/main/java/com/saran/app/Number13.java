package com.saran.app;
//Number 13
public class Number13 {
	//Method overloading example
	public static void main(String[] args) {
		System.out.println(sum(1,2));//3
		System.out.println(sum(1,2,3));//6
	}

		
	public static int sum(int x, int y) {
		return x + y ;
	}
	public static int sum(int x, int y, int z) {
		return x + y + z;
	}
}
