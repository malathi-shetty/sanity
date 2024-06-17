package loopsArrays;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// Write a program to find to calculate the sum of all digits in a given number.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		 int number = scanner.nextInt();

	        int sum = calculateSumOfDigits(number);
	        System.out.println("Sum of digits in the number is: " + sum);

	        scanner.close();
	    }

	    private static int calculateSumOfDigits(int number) {
	        int sum = 0;
	        while (number != 0) {
	            sum += number % 10; // Add the last digit to the sum
	            number /= 10; // Remove the last digit from the number
	        }
	        return sum;
	}

}
