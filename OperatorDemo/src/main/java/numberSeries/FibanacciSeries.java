package numberSeries;

public class FibanacciSeries {

	public static void main(String[] args) {
		// Fibonacci Series - The Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, 
		//usually starting with 0 and 1. 
			//The sequence starts like this: 0, 1, 1, 2, 3, 5, 8, 13, 21, ....

		
	
		        int n = 10; // Number of Fibonacci numbers to generate
		        int a = 0, b = 1;

		        System.out.println("Fibonacci Series:");
		        for (int i = 0; i < n; i++) {
		            System.out.print(a + " ");
		            int next = a + b;
		            a = b;
		            b = next;
		        }
		    
		
	/*	Explanation of the code:

		n: Represents the number of Fibonacci numbers to generate. You can change this value to generate a different number of Fibonacci numbers.
		a and b: These variables represent the first two numbers in the Fibonacci sequence (0 and 1).
		The for loop iterates n times, generating and printing the Fibonacci numbers.
		In each iteration of the loop:
		The current Fibonacci number (a) is printed.
		The next Fibonacci number is calculated by adding the current values of a and b.
		a is updated to the value of b, and b is updated to the calculated next Fibonacci number.
		When you run this program with n = 10, it will generate the first 10 Fibonacci numbers and print them to the console. 
		//Adjusting the value of n will generate a different number of Fibonacci numbers.
		*/
		
		
		
		
		
		
		
		
		
		
		
		int n1 = 0;
		int n2 = 1;
		System.out.println(n1);
		System.out.println(n2);

		// sum = n1+n2
		// n1 = n2;
		// n2 = sum
		
		for(int i = 1; i < 20 ; i++) {
			int sum = n1 + n2;
			n1 = n2;
			n2= sum;
			System.out.println(sum);
		}
		

	}

}
