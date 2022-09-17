package com.saran.app;
import java.util.Scanner;
//Number 1
public class Number1 {
	public static void main(String[] args) {
		int fnum,snum,add,sub, mul, oneUp, oneDown;
		//Getting two values from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		fnum = sc.nextInt();
		System.out.println("Enter second number:");
		snum = sc.nextInt();
		//arithmetic examples
		add = fnum + snum;
		sub = fnum - snum;
		mul = fnum * snum;
		System.out.println(fnum + " + " + snum + " = " + add);
		System.out.println(fnum + " - " + snum + " = " + sub);
		System.out.println(fnum + " * " + snum + " = " + mul);
		//relationship examples
		boolean equal, notEqual, greaterThan, lessThan; 
		equal = fnum == snum;
		notEqual = fnum != snum;
		greaterThan = fnum > snum;
		lessThan = fnum < snum;
		System.out.println(fnum + " = " + snum + " ? " + equal);
		System.out.println(fnum + " != " + snum + " ? " + notEqual);
		System.out.println(fnum + " > " + snum + " ? " + greaterThan);
		System.out.println(fnum + " < " + snum + " ? " + lessThan);
		//unary examples
		oneUp = ++fnum;
		oneDown = --snum;
		System.out.println("Incrementing your first number by 1" + " = " + oneUp);
		System.out.println("Decrementing your second number by 1" + " = " + oneDown);
		
		
		
	}
}