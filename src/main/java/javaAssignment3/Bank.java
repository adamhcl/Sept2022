package javaAssignment3;

import java.util.*;

public class Bank {
	int bal;

	Bank(int bal) {
		this.bal = bal;
	}

	int deposit(int amt) {
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 1;
		}
		System.out.println("Money deposited !!!");
		return (bal + amt);

	}

	int withdraw(int amt) {
		if (bal < amt) {
			System.out.println("Not Sufficient balance.");
			return 0;
		}
		if (amt < 0) {
			System.out.println("Invalid Amount");
			return 0;
		}
		bal = bal - amt;
		System.out.println("Withdrawal done !!!");
		return bal;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		Bank ob = new Bank(2000);
		System.out.print("Enter 1.for Deposit \n 2.for Withdrawal :: ");
		int ch = s.nextInt();
		System.out.println("Enter the amount ::");
		int amt = s.nextInt();
		if (ch == 1) {
			System.out.println("The new balance is :: " + ob.deposit(amt));
		} else {
			int ret = ob.withdraw(amt);
			if (ret > 0) {
				System.out.println("The new balance is :: " + ret);
			}
		}
	}
}