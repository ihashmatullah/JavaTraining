package basics;
//import java.lang.reflect.Array;
//import java.util.*;

public class Fibonanaci {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibnocci numbers
		// fib(0) = 0 
		// fib(1) = 1
		// fib(2) = fib(1) + fib(0) = 0 + 1 = 1
		// fib(3) = fib(2) + fib(1) = 1 + 1 = 2
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5
		// fib(6) = fib(5) + fib(4) = 4 + 3 = 8
		////System.out.println(fib(6));
		
		// Factorial Assignment
		// 1! = 1 * 1
		// 2! = 2 * 1
		// 3! = 3 * 2 * 1
		// 4! = 4 * 3 * 2 * 1
		
		//System.out.println("\n" + factorial());
		
		//System.out.println("\n**************************");
		
		//sumOfN();
		
		int[] nums={1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(getMaxValue(nums));
		System.out.println(getMinValue(nums));
		
		int sumCounter = 0;
		for(int i = 1; i <= nums.length; i++) {
			sumCounter = sumCounter + i;
		}
		int avg = sumCounter / nums.length;
		
		System.out.println("\n" + avg);
	}

	
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}
		else if (n ==1) {
			return 1;
		}
		return ( (fib(n-1)) + (fib(n-2)) );
	}
	
	public static int factorial() {
		int fact = 1;
		int number = 5;
		
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void sumOfN() {

		int sumCounter = 0;
		int number = 5;
		for(int i = 1; i <= number; i++) {
			sumCounter = sumCounter + i;
		}
		System.out.println("Sum of 1 to " + number + " is " + sumCounter);
	}
	// Write 3 functions that take an array as a parameter 
	// and return the minimum, average, and maximum values of that array.
	// Hint: this should be static functions with a return type 
	// of the same data type as the array declaration.
	
	public static int getMaxValue(int[] numbers) {
		  int maxValue = numbers[0];
		  for(int i = 1;i < numbers.length;i++){
		    if(numbers[i] > maxValue){
			  maxValue = numbers[i];
			}
		  }
		  return maxValue;
		}
	
	public static int getMinValue(int[] numbers) {
		  int minValue = numbers[0];
		  for(int i=1; i<numbers.length; i++){
		    if(numbers[i] < minValue){
			  minValue = numbers[i];
			}
		  }
		  return minValue;
		}
}
