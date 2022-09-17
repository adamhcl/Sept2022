package com.saran.app;
//number 4
public class Number4 {
	public static void main(String[] args) {
		//command line argument into integer
		int num = Integer.parseInt(args[0]);
		//using switch statement to convert numbers 1-10 in to their respective string names
		switch (num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		case 7:
			System.out.println("seven");
			break;
		case 8:
			System.out.println("eight");
			break;
		case 9:
			System.out.println("nine");
			break;
		case 10:
			System.out.println("ten");
			break;
		default:
			System.out.println("You did not put a value between 1 and 10.");		
		}
				
		
	}

}

