
package loopsArrays;

import java.util.Arrays;

public class RightAngledTriangle {
	// Function to check if the given sides can form a right-angled triangle
	
	public static void main(String[] args) {
	int side1 = 3; // Example value of side1
	int side2 = 4; // Example value of side2
	int side3 = 5; // Example value of side3
	
	 // Print the values of the sides
    System.out.println("Given sides: " + side1 + ", " + side2 + ", " + side3);
    // Print the individual calculations
 
    
 // Check if the given sides form a right-angled triangle
	if(isRightAngledTriangle(side1,side2, side3)) {
		System.out.println("The given sides form a right angled triangle.");
	}else {
		System.out.println("The given sides do not form a right angled triangle." );
	}

	}

	 static boolean isRightAngledTriangle(int a, int b, int c) {
		  // Sort the sides in ascending order
		int[] sides= {a,b,c};
		Arrays.sort(sides);
		
		  // Print the individual calculations  and result
		int result = sides[0] * sides[0] + sides[1] * sides[1];
		int result1 = sides[2] * sides[2];
		   System.out.println("Calculation: " + sides[0] + "^2 + " + sides[1] + "^2 = " + sides[2] + "^2");
		  System.out.println("Result: " + result + " == " + sides[2] + "^2 (" + (result == sides[2] * sides[2]) + ")"); 
		  System.out.println("Result: " + result + " == " + result1 + " (" + (result == result1) + ")");
		
		// Check if it's a right-angled triangle
		return (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2] );
	}

	private static void result1(String string) {
		// TODO Auto-generated method stub
		
	}

}
