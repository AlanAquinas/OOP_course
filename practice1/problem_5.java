package practice1;

import java.util.Scanner;

class SavingsAccount {
	private double balance;
	private double interest;
	
	public SavingsAccount(double balance, double interest) {
		this.balance = balance;
		this.interest = interest;
	}
	
	public void addInterest() {
		balance = balance + (balance*(interest*0.01));
	}
	
	public double getBalance() {
		return balance;
	}
	public double geInterest() {
		return interest;
	}
	
}

public class problem_5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Initial balance: ");
		double balance = in.nextDouble();
		
		System.out.println("Interest(%): ");
		double interest = in.nextDouble();
		
		
		SavingsAccount arslan = new SavingsAccount(balance, interest);
		
		arslan.addInterest();
		System.out.println("Current balance: " + arslan.getBalance());
		
		in.close();
	}

}
