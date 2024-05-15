package loopsArrays;

import java.util.Scanner;

public class SwapFirstAndLastDigits {

	public static void main(String[] args) {
		// Write a program to swap the first and last digit of a given number.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number: "); //654321
		int number = scanner.nextInt();
		
		int swappedNumber = swapFirstAndLastDigts(number);
		
		System.out.println("Number after swapping first & last digits: " + swappedNumber);
		scanner.close();

	}

	private static int swapFirstAndLastDigts(int num) {
		//Find first & last digits
		int firstDigit = num;
		while(firstDigit >= 10) {
			firstDigit /=10;
		}
		int lastDigit = num%10; //For 654321, the first digit will be 6 and the last digit will be 1.
		
		// Get the number of digits in the original number
		int numDigits = (int) Math.log10(num)+1; //For 654321, the number of digits is 6.
//		---
//		Suppose we have the integer num = 654321.
//				double logResult = Math.log10(num);//Calculate the Logarithm of the Absolute Value
//		//The Math.log10() function calculates the base-10 logarithm of a number. 
//		//For num = 654321, logResult would be approximately 5.815790858916374.
//		int numDigits = (int) logResult;//Cast to Integer
//		//We cast the result of the logarithm operation to an integer. 
////This effectively truncates any decimal part, leaving us with just the whole number part. So, numDigits becomes 5.
//		numDigits = numDigits + 1;//Add 1:
//		//Since the logarithm gives us the number of digits minus 1 (because logarithms are 0-indexed), 
//		we add 1 to get the actual count of digits. So, numDigits becomes 6.
//
////Thus, numDigits represents the number of digits in the integer num, which in this case is 654321, and it equals 6.
//		---
		
		// Construct the swapped number
		int swappedNumber = lastDigit; //Initially, swappedNumber is set to 1 (the last digit).
		swappedNumber *= (int) Math.pow(10, numDigits - 1); // Multiply last digit by appropriate power of 10
		//swappedNumber *= (int) Math.pow(10, 6 - 1);
//		swappedNumber *= (int) Math.pow(10, 5);
//		1 *= 100000
//		swappedNumber = 100000
		swappedNumber += num%((int) Math.pow(10, numDigits - 1)); // Add middle digits
//		swappedNumber += 654321 % ((int) Math.pow(10, 6 - 1));
//		swappedNumber += 654321 % ((int) Math.pow(10, 5));
//		swappedNumber += 654321 % 100000;//654321 % 100000 modulo is 54321
//		swappedNumber += 54321;
//      100000+= 54321;
//		swappedNumber = 154321
		swappedNumber -= lastDigit; // Subtract last digit
//		swappedNumber -= lastDigit;
//		swappedNumber -= 1;
//		154321-1=154320
//		swappedNumber = 154320;
		swappedNumber += firstDigit;//  Add first 
//		swappedNumber += firstDigit;
//		swappedNumber += 6;
//		154320 + 6 =154326
//		swappedNumber = 154326;
		
		return swappedNumber;
	}

}
