package loopsArrays;

public class PrintTheMissingNumber {

	public static void main(String[] args) {
		int[] arr= {1,2,4,5,6}; //// Example array with one missing number
		int n = arr.length+1;//Length of array + 1 : 5 array +1 =6
		
		int totalSum = n*(n+1)/2;//Sum of numbers from 1 to n - 6*(6+1)/2 =42/2=21
		
		int actualSum =0;
		for(int num : arr) {
			actualSum += num; //Sum of numbers in the array - 1+2+4+5+6 = 18
		}
		
		int missingNumber = totalSum - actualSum; //21-18=3
		
		System.out.println("The missig number is: " + missingNumber); //3
		
		// This Java program calculates the sum of numbers from 1 to n using the formula n * (n + 1) / 2,
		// then subtracts the sum of numbers in the array to find the missing number. 
		//In this example, the input array is {1, 2, 4, 5, 6}, and the missing number is calculated to be 3.

	}

}
