package loopsArrays;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberLength2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter an integer number: "); //10000000000
	        String input = scanner.nextLine();
	        
	     // Debug output
	        System.out.println("Input received: \"" + input + "\"");
	        
	     /*   int number;
	        try {
	            number = Integer.parseInt(input);
	            int length = findLength(number);
	            System.out.println("Length of the number is: " + length);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input! Please enter a valid integer.");
	        } finally {
	            scanner.close();
	        }
	    }
*/
	        BigInteger number;
	        try {
	            number = new BigInteger(input);
	            if (number.bitLength() <= 31) {
	                int intValue = number.intValue();
	                int length = findLength(intValue);
	                System.out.println("Length of the number is: " + length);
	            } else {
	                System.out.println("Input number is too large to process as an integer.");
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid input! Please enter a valid integer.");
	        } finally {
	            scanner.close();
	        }
	    }
	        
	    private static int findLength(int num) {
	        // Convert number to positive if it's negative
	        num = Math.abs(num);
	        
	        // If number is 0, it has 1 digit
	        if (num == 0) {
	            return 1;
	        }
	        
	        // Count the number of digits by repeatedly dividing by 10
	        int length = 0;
	        while (num != 0) {
	            num /= 10;
	            length++;
	        }
	        return length;
	    }
	}

//This version of the program reads the input as a string and tries to parse it to an integer using Integer.parseInt().
//If the parsing is successful, it calculates the length of the number using the findLength() method. 
//If the input cannot be parsed to an integer, it catches the NumberFormatException and prints an error message. 
//Finally, the scanner is closed in the finally block to release resources.








