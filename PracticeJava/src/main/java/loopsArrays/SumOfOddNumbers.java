package loopsArrays;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		 int n = 10; // Example value of n
	        
	        int sum = 0;
	        for (int i = 1; i <= n; i += 2) { //  i = i + 2
	            sum += i; // Add odd numbers to the sum - sum = sum + i
	        }
	        
	        System.out.println("The sum of odd numbers from 1 to " + n + " is: " + sum);

	}

}
