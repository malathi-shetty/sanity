package loopsArrays;

public class CompositeNumbers {
	
	// Write a program to print the composite numbers (non-prime numbers) from 1 to n.

	public static void main(String[] args) {
		int n =20; // Example value of n
		printCompositeNumbers(n);
		
	}

		// Function to check if a number is prime
		static boolean isPrime(int num) {
			if( num <=1) {
				return false;
			}
			for (int i=2; i<=Math.sqrt(num); i++) {
				if(num % i ==0) {
					return false;
					
				}
			}
			return true;
			
		}
		
		 // Function to print composite numbers from 1 to n
		
		static void printCompositeNumbers(int n) {
			System.out.println("Composite numbers from 1 to " + n + " are:");
			for(int i =1; i<=n; i++) {
				if(!isPrime(i) && i !=1) { // 1 and 2 are not considered composite numbers
					System.out.println("Composite: " + i + " ");
				}
//				 else {
//		                System.out.println("Prime: " + i );
//		            }
			}
			System.out.println();
		}

}

