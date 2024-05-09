package multioperator_functions;

import java.util.Scanner;
//- This line imports the Scanner class from the java.util package. This class is used to obtain input from the user through the console.

public class ScannerDemo {
		public static final String ANSI_GREEN = "\033[32m GREEN"; 
		//- This line declares a constant string named ANSI_GREEN which is used to print text in green color on supported terminals. 
		//The escape sequence \033[32m represents the ANSI escape code for changing text color to green.
		//\033: This is the escape character, which signals the beginning of an escape sequence.
		//  [: Indicates the start of the ANSI escape sequence.
		// m: Indicates the end of the ANSI escape sequence.
		//[32m: This part represents the ANSI color code for green. The number 32 indicates the color green in ANSI escape codes.

	public static void main(String[] args) {
		//Scanner Class
		Scanner scan = new Scanner (System.in);
		//This line creates a new Scanner object named scan that reads input from the standard input stream (keyboard). 
		//It allows the program to accept input from the user.
		
		System.out.println(ANSI_GREEN + " Enter your Number");
		//- This line prints a message in green color to the console, asking the user to enter a number.
		
		int number = scan.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}

	}

}
