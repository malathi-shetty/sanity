package loopsArrays;

public class SumOfEvenNumbers {

	public static void main(String[] args) {
		int n = 10; // Example value of n
		int sum=0;
		for(int i=2; i<=n; i+=2) {
			sum +=i; // Add even numbers to the sum - 0+2 so on till i<10
			//In this loop, we start from 2 (the first even number) and increment by 2 in each iteration 
			//until we reach or exceed n. During each iteration, we add the current even number i to the sum.
		}
		System.out.println("The sum of even numbers from 1 to " + n + " is: " + sum);

	}

}
