package loopsArrays;

import java.util.Scanner;

public class NumberLength {

	public static void main(String[] args) {
		// Write a program to find the length of an integer number.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer number: "); //Suppose the user enters the number 123456.
		int number = scanner.nextInt(); //The program prompts the user to enter an integer number. 
		//If the user enters 123456, it will be stored in the variable number.
		int length = findLength(number); //This line calls the method findLength() with the input number 123456 
		//and stores the result in the variable length.
		System.out.println("Length of the number is: " + length);
		scanner.close();

	}

	private static int findLength(int num) {
		int length=0; // If number is 0, it has 1 digit - Initialize length to 0.
		if (num == 0) {
	        return 1; //If the number is 0, return 1 (as it has one digit).
	    }
	    // Count the number of digits by repeatedly dividing by 10
	    while (num != 0) {
	        num /= 10; //If the number is not 0, 
	        //count the number of digits by repeatedly dividing the number by 10 until it becomes 0. 
	   
	        length++;     //Increment length in each iteration.
	    }
	    return length; //Return the final count of digits (length).
	    
//	    For the input 123456:
//
//	    	num starts with 123456.
//	    	After the first iteration, num becomes 12345 and length becomes 1.
//	    	After the second iteration, num becomes 1234 and length becomes 2.
//	    	After the third iteration, num becomes 123 and length becomes 3.
//	    	After the fourth iteration, num becomes 12 and length becomes 4.
//	    	After the fifth iteration, num becomes 1 and length becomes 5.
//	    	After the sixth iteration, num becomes 0 and the loop stops.
//	    	Finally, the method returns length, which is 6.
	
	}
/*	 private static int findLength(String input) {
	        // Remove leading and trailing whitespace
	        input = input.trim();
	        
	        // Check if the input is empty
	        if (input.isEmpty()) {
	            return 0;
	        }
	        
	        // Calculate length
	        return input.length();
	    }*/

}
