package com.saran.app;
// Number 2 and 3
public class Number2and3 {
	public static void main(String[] args) {
		//command line argument into integer
		int num = Integer.parseInt(args[0]);
		//checking if argument is even or odd and then printing it out
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		}
		else {
			System.out.println(num + " is odd");
		}
		
	}

}
