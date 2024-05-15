package loopsArrays;

import java.util.Scanner;

public class FirstAndLastDigits {

	public static void main(String[] args) {
		// Write a program to find the first and last digits of an integer number.
		
		 Scanner scanner = new Scanner(System.in);   
	        System.out.print("Enter an integer number: ");
	        int number = scanner.nextInt();
		
		// int number = 12345; // Example integer number
	        
	        // Find the first digit
	        int firstDigit = findFirstDigit(number);
	        
	        // Find the last digit
	        int lastDigit = findLastDigit(number);
	        
	        // Print the result
	        System.out.println("First digit: " + firstDigit);
	        System.out.println("Last digit: " + lastDigit);
	        
	           scanner.close();
	    }
	    
	    // Method to find the first digit of a number
	    public static int findFirstDigit(int num) {
	        while (num >= 10) {
	            num /= 10;
	        }
	        return num;
	      
	        //While Loop:
//Iteration 1: num = 4567. Since 4567 is greater than or equal to 10, we enter the loop.
//Inside the loop, num is divided by 10, which is equivalent to 4567 / 10 = 456. So, num becomes 456.
//Iteration 2: num = 456. Again, 456 is greater than or equal to 10, so we continue.
//Inside the loop, num is divided by 10, which is 456 / 10 = 45. So, num becomes 45.
//Iteration 3: num = 45. Still greater than or equal to 10, so we continue.
//Inside the loop, num is divided by 10, which is 45 / 10 = 4. So, num becomes 4.
//Iteration 4: num = 4. Now, 4 is less than 10, so the loop exits without further iterations.
//Return: After the loop, the value of num is 4, which is the first digit of the original number 4567.
//
//So, the method essentially removes the last digit of the number iteratively until only the first digit remains. 
	        //The final value of num after the loop is the first digit of the original number.
	    }
	    
	    // Method to find the last digit of a number
	    public static int findLastDigit(int num) {
	        return num % 10;
	    }

	}

//Input: We start with an integer input, let's say num = 4567. This is the number for which we want to find the last digit.

//Modulo Operation: In this method, we use the modulo operator %. When num % 10 is calculated, 
//it gives the remainder when num is divided by 10.
//
//Result: The remainder obtained from num % 10 is the last digit of the number.
//
//Example with num = 4567:
//
//4567 % 10 is calculated.
//4567 divided by 10 is 456 with a remainder of 7.
//So, the result of 4567 % 10 is 7.
//Thus, the method directly returns the last digit of the original number.
//
//This method is simpler compared to finding the first digit because 
//it directly extracts the last digit using the modulo operation without the need for any iteration or loop.

