package javaAssignment3;

import java.util.*;

public class Student {
	Scanner s = new Scanner(System.in);

	public String Average() {
		System.out.println("Enter Marks1: ");
		double m1 = s.nextDouble();
		System.out.println("Enter Marks2: ");
		double m2 = s.nextDouble();
		System.out.println("Enter Marks3: ");
		double m3 = s.nextDouble();
		double tm = m1 + m2 + m3;
		double avg = tm / 3;
		if (avg < 50) {
			return "Failed";
		}
		if (avg > 50) {
			return "Passed";
		}
		return " ";
	}

	public String Inputname() {
		System.out.println("Enter Name: ");
		String name = s.nextLine();
		return Average();
	}

	public static void main(String args[]) {
		Student ob = new Student();
		System.out.println(ob.Inputname());
	}
}