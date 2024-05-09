package multioperator_functions;

import java.util.Iterator;

public class LoopDemo {

	public static void main(String[] args) {
		// while ; do.while ; for
		
/*		// while - first check condition , it execute its body
		int i=20; 
//		while(i<=30) { // i is greater than 20; so  output from 20 to 30
//			System.out.println(i);
//			i++;
//		}
		while(i<=10) { // i is greater than 10; so no output
			System.out.println(i);
			i++;
		}
*/

/*       // do while loop
		// first execution , then condition
		// at-least it will execute once
		int j = 20;
		do {
			System.out.println(j);
			j++;
		}while(j<=10);
	*/	
		
		int j = 0; // Initialize the variable j to 0
		do {
			System.out.println(j); // Print the current value of j
			j++; // Increment j by 1
		}while(j <= 10); // Continue looping while j is less than or equal to 10 - output: 0 to 10
		
//		int j = 0;: Initializes the variable j to 0.
//		do { ... } while (j <= 10);:
//		This is a do-while loop, which means the loop body will be executed at least once, and then the loop condition will be checked.
//		Inside the loop body, the current value of j is printed using System.out.println(j);.
//		Then, j is incremented by 1 using the post-increment operator (j++).
//		The loop continues to execute as long as the condition j <= 10 holds true. 
//		This condition ensures that the loop will run until j reaches 11.
		
		 // for loop
	//	for(int i = 0 ; i <= 10 ; i++) {
	//		System.out.println("Hello");
		//}
//		+ arithmatic
//		+ unary operator
//		+ append
		// primary nature is arithmatic, if string got involved , append		
		
		System.out.println("****");
		
		System.out.println(10+20+30); //60
		System.out.println("****");
		System.out.println(10+20+"" +30); // 3030
		System.out.println("****");
		System.out.println(10+""+20+30);//102030 
		//- Concatenates the numbers 10, 20, and 30 as strings without performing arithmetic operations, 
		//resulting in the string "102030", then prints the string.
		
		System.out.println("****");
		for(int i=1; i<=10; i++) {
			System.out.println("5 * " + i + " = " + (5*i));
		}
		System.out.println("****");
		for(float k = 1;k <= 10;k++) {
			if(k == 6) {
				continue; // Skip the current iteration and continue with the next iteration
			}
			System.out.println(k); // Print the current value of k
		}
		
		// Jump Statement
		
		// break - loop break
		// continue
		
//		for (float k = 1; k <= 10; k++) { ... }:
//
//			This is a for loop that initializes the variable k to 1.
//			It continues looping as long as the condition k <= 10 holds true.
//			In each iteration, k is incremented by 1 (k++).
		
//			if (k == 6) { continue; }:
//			Inside the loop body, there's an if statement that checks if the current value of k is equal to 6.
//			If k is equal to 6, the continue statement is executed, which skips the remaining code in the current iteration
//			and continues with the next iteration of the loop.
//			System.out.println(k);:
//
//			Prints the current value of k to the console if it's not equal to 6.
//			The output of this code will be:
//			1.0
//			2.0
//			3.0
//			4.0
//			5.0
//			7.0
//			8.0
//			9.0
//			10.0
//			It prints the numbers from 1.0 to 10.0, excluding 6.0, each on a separate line.


		
	}

}
