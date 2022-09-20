package javaAssignment3;

import java.util.*;

public class WashingMachine {
	Scanner input = new Scanner(System.in);

	public void switchOn() {
		System.out.println("The Lid is Open.");
	}

	public void start() {
		System.out.println("Start Washing...");
	}

	public void acceptDetergent() {
		System.out.println("Adding Detergent..");
		start();
	}

	public int acceptClothes() {
		System.out.println("Enter no of clothes:");
		int no = input.nextInt();
		return no;
	}

	public void switchOff() {
		System.out.println("The Lid is closed.");
	}

	public static void main(String args[]) {
		WashingMachine wm = new WashingMachine();
		wm.switchOn();
		int numOfClothes = wm.acceptClothes();
		wm.acceptDetergent();
		wm.switchOff();
		System.out.println(numOfClothes + " clothes get washed");
	}
}
