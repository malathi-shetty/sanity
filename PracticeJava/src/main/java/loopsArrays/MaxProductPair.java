package loopsArrays;

//Given an integer array, find which two elements gives the maximum product.

public class MaxProductPair {
	
	public static int[] maxProductPair(int[] arr) {
		// Check if there are at least two elements in the array
		if(arr.length <2) { 
			return null; // There should be at least two elements in the array
		}
		
		 // Initialize maxProduct to the smallest possible integer value
		int maxProduct = Integer.MIN_VALUE;
		
		// Initialize maxPair array to store the pair of elements with maximum product
		int[] maxPair = new int[2];
		
		// Iterate through each pair of elements in the array
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				// Calculate the product of the current pair of elements
				int product=arr[i]*arr[j];
				// Update maxProduct and maxPair if the current product is greater
				if(product > maxProduct) {
					maxProduct = product;
					maxPair[0]=arr[i];// Update first element of maxPair
					maxPair[1]=arr[j]; // Update second element of maxPair
				}
				
			}
			
		}
		
		// Return the pair of elements with the maximum product
		return maxPair;
	}

	public static void main(String[] args) {
		
		// Sample array with integer elements
		int[] arr= {1,2,3,4,5};
		
		// Call maxProductPair method with the sample array
		int[] result = maxProductPair(arr);
		
	     // Print the result (pair of elements with maximum product)
		System.out.println("The pair with maximum product is: {"+ result[0] + "," + result[1]+"}");
		
	}

}

/*Given array: arr = {1, 2, 3, 4, 5} //[i=0,1,2,3,4]
 * 
 * for (int i = 0; i < arr.length; i++) {
    for (int j = i + 1; j < arr.length; j++) {
        // Code inside the nested loops
    }
}

Outer Loop (i):
The outer loop iterates over each element of the array arr. 
It starts with i equal to 0 and increments i by 1 until it reaches the last index of the array (arr.length - 1).
For each iteration of the outer loop, it represents one element (arr[i]) of the array.

Inner Loop (j):
The inner loop iterates over the elements of the array starting from the next index 
after the current outer loop index (i + 1) up to the last index of the array (arr.length - 1).
This loop ensures that it considers all possible pairs of elements
 where the second element has a higher index than the first element (arr[i] and arr[j] where j > i).
For each iteration of the inner loop, it represents one element (arr[j]) that forms a pair with the element
 at the current outer loop index (arr[i]).

Iteration 1 (i=0):
Outer loop (i=0) starts. It fixes the first element arr[0] = 1.
Inner loop (j=1 to 4) starts. It considers pairs with the second element starting from arr[1] = 2 to arr[4] = 5.
Calculated products:
1 * 2 = 2
1 * 3 = 3
1 * 4 = 4
1 * 5 = 5
The maximum product found so far (maxProduct) is updated to 5, and the pair maxPair is updated to {1, 5}.

Iteration 2 (i=1):
Outer loop (i=1) starts. It fixes the first element arr[1] = 2.
Inner loop (j=2 to 4) starts. It considers pairs with the second element starting from arr[2] = 3 to arr[4] = 5.
Calculated products:
2 * 3 = 6
2 * 4 = 8
2 * 5 = 10
The maximum product found so far (maxProduct) remains 5. No update is made to maxProduct or maxPair.

Iteration 3 (i=2):
Outer loop (i=2) starts. It fixes the first element arr[2] = 3.
Inner loop (j=3 to 4) starts. It considers pairs with the second element starting from arr[3] = 4 to arr[4] = 5.
Calculated products:
3 * 4 = 12
3 * 5 = 15
The maximum product found so far (maxProduct) is updated to 15, and the pair maxPair is updated to {3, 5}.

Iteration 4 (i=3):
Outer loop (i=3) starts. It fixes the first element arr[3] = 4.
Inner loop (j=4) starts. It considers pairs with the second element arr[4] = 5.
Calculated product: 4 * 5 = 20
Since 20 is greater than the current maximum product (15), maxProduct is updated to 20, and maxPair is updated to {4, 5}.

Iteration 5 (i=4):
Outer loop (i=4) starts. It fixes the first element arr[4] = 5.
Inner loop does not execute as there are no more elements to consider.
The loops terminate.

Result:
The pair of elements {3, 5} has the maximum product of 15.
Final Output:
The pair with maximum product is: {4, 5}*/
