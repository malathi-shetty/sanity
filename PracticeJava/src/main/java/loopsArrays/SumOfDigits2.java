package loopsArrays;

import java.util.Scanner;

public class SumOfDigits2 {

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
        // Ensure number is positive
        number = Math.abs(number);

        int sum = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit; // Add the digit to the sum
            number /= 10; // Move to the next digit by removing the last digit
        }
        return sum;

	}

}
