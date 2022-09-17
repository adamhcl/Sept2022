package com.saran.app;
//Number 9
public class Number9 {
	public static void main(String[] args) {
		//Print prime numbers from 1 to 100
		int count;
		for(int j=2; j<=100; j++) {
		count=0;
		for(int i=1;i<=j;i++) {
			if(j%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.println(j+" ");
		}
		}
		
		
	}
}