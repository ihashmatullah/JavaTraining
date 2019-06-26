package oop;

public class BankAccount {

		// Define variables
		String accountNumber;
		
		// static >> belongs to the CLASS not object instance
		// final >> constant (often static final
		static final String routingNumber = "013456";
		
		// Instance Variables
		String name;
		String accountType;
		double balance = 0;
		
		// Constructor definitions: unique methods
			// 1. They are used to define / setup / initialize properties of an object
			// 2. Constructors are IMPLICITLY called upon ISTANTIATION
			// 3. The same name as the class itself
			// 4. Constructors have NO return type
		BankAccount() {
			System.out.println("NEW ACCOUNT CREATED");
		}
		// Overloading: call same method name with different arguments
		BankAccount(String accountType) {
			System.out.println("NEW ACCOUNT: " + accountType);
		}
		BankAccount(String accountType, double initDeposit) {
			// initDeposit, accountType, Msg are local variable
			System.out.println("NEW ACCOUNT: " + accountType);
			System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
			String Msg = null;
			if (initDeposit < 1000) {
				Msg = "Error: Minimum deposit must be at least $1,000";
			} else {
				Msg = "Thanks for your initial deposit of: $" + initDeposit;
			}
			System.out.println(Msg);
			balance = balance+initDeposit;
		}
		
		// Define methods
		public void deposit(double amount) {
			balance = balance + amount;
			showA
		}
		
		void withdraw() {
			
		}
		
		// Private : Can only be called from within the class
		private void showActivity(String activity) {
			System.out.println("YOUR RECENT TRANSACTION: " + activity);
			System.out.println("YOUR NEW BALANCE IS: $" + balance);
		}
		
		void checkBalance() {
			System.out.println("Balance: " + balance);
		}
		
		void getStatus() {
			
		}
		
		@Override
		public String toString() {
			return "[ Name:" + name + ". ACCOUNT#" + accountNumber + ". ROUTING #" + routingNumber + ". Balance: $" + balance + " ]";
		}

}
