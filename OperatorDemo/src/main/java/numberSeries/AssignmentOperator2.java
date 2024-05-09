package numberSeries;

public class AssignmentOperator2 {

	public static void main(String[] args) {

		// Sum of Digit
		// Reverse number
		// Fibonacci Series
		// Factors
		// Palindrom
		// Prime Number


		// Sum of Digit
		// 245 = 2 + 4 + 5 = 11

		// Top down Approach
		// Step 1 = how to segregate every digit of a number
		// Step 2 = sum
		// Step 3 = Refactor

		int number = 45678; // Initialize the variable number to 45678

		int sum = 0; // Initialize the variable sum to 0
		while(number != 0) {
			sum+=(number % 10); // Add the last digit of the number to the sum
			number/=10; // Remove the last digit from the number ==> number = number / 10.
		}

		System.out.println("Sum of Digit : " + sum); // Print the sum of digits
		System.out.println("Sum of Digit : " + number); 
		// 245 % 10 = 5 (if we will use % operator with a number, we will always get last digit)
		// 245 / 10 = 24 

		// 24 % 10 = 4 
		// 24 / 10 = 2

		// 2 % 10 = 2
		// 2 / 10 = 0

		// 0 % 10 = 0
		// 0 / 10 = 0



		//				Explanation:
		//
		//				1.	int number = 45678;: Initializes the variable number with the value 45678.
		//
		//				2.	int sum = 0;: Initializes the variable sum with the value 0. This variable will be used to store the sum of the digits of the number.
		//
		//				3.	while (number != 0) { ... }: This is a while loop that continues iterating as long as number is not equal to 0.
		//
		//				4.	Inside the while loop:
		//
		//					sum += (number % 10);: Adds the last digit of the number to the sum. The expression number % 10 gives the last digit of number.
		//					number /= 10;: Removes the last digit from the number by integer division (/=). 
		//This operation effectively shifts the number one place to the right, discarding the last digit.
		//				5.	After the loop completes, the sum of the digits of the original number is stored in the variable sum.
		//
		//				6.	System.out.println("Sum of Digits: " + sum);: Prints the sum of the digits to the console.
		//
		//					The output of this code will be:
		//
		//					Sum of Digits: 30
		//					It indicates that the sum of the digits of the number 45678 is 30.


		/*
			 	int sum = 0;  // Initialize the variable sum to 0
				while (45678 != 0) {
    			sum += (45678 % 10);  // Add the last digit of the number to the sum
    			45678 /= 10;          // Remove the last digit from the number
}
		Here's a detailed explanation:

		1. Initialization:

			int sum = 0;: This line initializes the variable sum with the value 0. This variable will store the sum of the digits of the number.
		2. Looping through each digit:
	- while (45678 != 0) { ... }: This while loop continues as long as the number 45678 is not equal to 0. 
		We use this loop to iterate through each digit of the number.
 	- Inside the loop:
		- 45678 % 10: This expression calculates the remainder when 45678 is divided by 10. This gives us the last digit of the number.
		- sum += (45678 % 10): This line adds the last digit of the number to the variable sum. 
			We use the compound assignment operator += to increment sum by the value of the last digit.
		- 45678 /= 10: This line divides 45678 by 10, effectively removing the last digit from 45678. 
			We use integer division here, so any fractional part is discarded.
			
			The while loop continues to execute as long as the condition 45678 != 0 holds true. 
			Inside the loop, we are progressively reducing the value of 45678 by removing its last digit in each iteration.
			In the first iteration, the last digit of 45678 is 8, and after performing 45678 % 10, sum is updated with 8. 
			Then, we divide 45678 by 10, which results in 4567.
				In the second iteration, the last digit of 4567 is 7, and after performing 4567 % 10, sum is updated with 7. 
				Then, we divide 4567 by 10, which results in 456.
				This process continues until 45678 becomes 0, meaning all digits have been processed.
				Eventually, the value of 45678 will become 0 after all its digits have been removed. 
				At this point, the loop condition 45678 != 0 becomes false, and the loop terminates.
		3. Termination of the loop:
			The loop continues until 45678 becomes 0. As we are removing one digit from 45678 in each iteration, 
			eventually 45678 will become 0, and the loop will terminate.
			This code calculates the sum of the digits of the number 45678, which will result in 30 (4 + 5 + 6 + 7 + 8), and stores it in the variable sum.
		 */

	}

}
