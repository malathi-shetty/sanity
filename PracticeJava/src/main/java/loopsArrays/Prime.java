package loopsArrays;

public class Prime {

	public static void main(String[] args) {
		int n=30;
		printPrimeNumbers(n);
	}

	// Function to print prime numbers from 1 to n
	 static void printPrimeNumbers(int n) {
		System.out.println("Prime numbers from 1 to " + n + "  are: ");
		for(int i=2; i<=n; i++) {
			if(isPrime(i)) {
				System.out.println(i + " ");
			}
		}
		System.out.println();
		
	}

	 static boolean isPrime(int num) {
		if(num <=1) {
		return false;
	}
		for(int i=2; i<=Math.sqrt(num); i++) {
			if(num % i ==0) {
				return false;
			}}
		return true;
		}

}
