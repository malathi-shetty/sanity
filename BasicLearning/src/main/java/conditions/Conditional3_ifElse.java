package conditions;

import java.util.Scanner;

public class Conditional3_ifElse {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in); // creates a new Scanner object that reads from the standard input (keyboard).
		System.out.println("Enter your age: ");//prompts the user to enter their age	
		
	
		int age = scanner.nextInt();//reads the next integer input from the user and stores it in the variable age.
		if(age>=18) {
			System.out.println(age + " : You are eligible to vote...");//outputs the entered age to the console
		}else {
			System.out.println(age + " : Sorry.. you can't vote");
		}
	

	}

}
