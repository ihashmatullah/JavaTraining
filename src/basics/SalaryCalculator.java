package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		// Let's create a variable to define our career
		
		// Declare a variable
		String career;
		System.out.println("Program is starting");
		
		// Define a variable
		career = "Software Developer";
		System.out.println("My career is " + career);
		
		// Declare and define a variable
		int hours_per_week = 40;
		int weeks_per_year = 50;
		double rate = 42.50;
		
		double salary = hours_per_week * weeks_per_year * rate;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary +  " per year");
		
		// Compute our annual salary
		// rate * hoursPer_week * weeks_per_year
	}

}
