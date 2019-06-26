package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "01689453";
		acc1.name = "Roger Hue";
		acc1.balance = 10000;
		
		acc1.deposit(1500);
		acc1.depost(1500);
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		
		System.out.println(acc1.toString());
		
		/*
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "0168234";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "0167394";
		acc3.checkBalance();
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compount();
		
		*/
		

	}

}
