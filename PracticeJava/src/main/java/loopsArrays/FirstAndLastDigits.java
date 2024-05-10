package loopsArrays;

public class FirstAndLastDigits {

	public static void main(String[] args) {
		// Write a program to find the first and last digits of an integer number.
		
		 int number = 12345; // Example integer number
	        
	        // Find the first digit
	        int firstDigit = findFirstDigit(number);
	        
	        // Find the last digit
	        int lastDigit = findLastDigit(number);
	        
	        // Print the result
	        System.out.println("First digit: " + firstDigit);
	        System.out.println("Last digit: " + lastDigit);
	    }
	    
	    // Method to find the first digit of a number
	    public static int findFirstDigit(int num) {
	        while (num >= 10) {
	            num /= 10;
	        }
	        return num;
	    }
	    
	    // Method to find the last digit of a number
	    public static int findLastDigit(int num) {
	        return num % 10;
	    }

	}


