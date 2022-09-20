package javaAssignment3;
import java.util.*;
import java.util.Scanner;

class Truck extends Vehicle {
	int loadingcapacity;
	static Scanner s = new Scanner(System.in);

	public Truck(int vno, String mod, String manu, String colr, int loadcap) {
		super(vno, mod, manu, colr);
		this.loadingcapacity = loadcap;
	}

	public void display() {
		System.out.println("Vehicle number : " + vehicleno);
		System.out.println("Model : " + model);
		System.out.println("Manufacturer : " + manufacturer);
		System.out.println("Color : " + color);
		System.out.println("Loading Capacity: " + loadingcapacity);
	}

	public void behaviour() {

		System.out.print("Enter the new color::");
		super.color = s.next();
		System.out.print("Enter new loading capacity::");
		int ldcap = s.nextInt();

		this.loadingcapacity = ldcap;
		display();
	}

	public static void main(String[] args) {

		System.out.println("Enter Vehicle No: ");
		int vno = s.nextInt();
		System.out.println("Enter Model: ");
		String mod = s.next();
		System.out.println("Enter Manufacturer: ");
		String manu = s.next();
		System.out.println("Enter Color: ");
		String col = s.next();
		System.out.println("Enter Loading Capacity: ");
		int ldcap = s.nextInt();
		System.out.println("*****Details*****");
		Truck p = new Truck(vno, mod, manu, col, ldcap);
		p.display();
		System.out.println("*************************************************************");
		System.out.println("Would u like to re-enter the color and loading capacity(Press 1.for yes or 2 for No):");
		int ch = s.nextInt();
		if (ch == 1) {
			p.behaviour();
		}
	}
}