package multioperator_functions;

public class ShiftOperatorDemo {

	public static void main(String[] args) {
		
		int i = 36; // Binary:  100100
		i = i << 1;
		//Uses the bitwise left shift (<<) operator to shift the bits of i to the left by one position, effectively multiplying i by 2.
		//Prints the value of i, which becomes 72 after the left shift operation.
		
	//	Binary representation of 36:
//			Decimal: 36
	//		Binary:  100100
	//		Left shift operation by one position (i << 1):

//	All bits are shifted to the left by one position, 
		//and a 0 is added at the least significant bit (rightmost position) to fill the vacant position:
//		
//			Before:  100100
//			After:  1001000
//			Convert the binary result back to decimal:
//			Decimal: 72
//			So, after performing the left shift operation (i = i << 1), the value of i becomes 72. 
//			Each left shift effectively multiplies the number by 2, and in this case, it doubled the value of 36, resulting in 72.
		
		System.out.println(i); // 72
				//72 ÷ 2 = 36 remainder 0
				//36 ÷ 2 = 18 remainder 0
				//18 ÷ 2 = 9 remainder 0
				//9 ÷ 2 = 4 remainder 1
				//4 ÷ 2 = 2 remainder 0
				//2 ÷ 2 = 1 remainder 0
				//1 ÷ 2 = 0 remainder 1

				
		// >> removing last bit
		// << adding 0 in last bit
//			1001000
		
		// how to divide a number by 2 in java? (without using / operator)
		
		int j = 10;	
//		Decimal: 10
//		Binary:  1010
//		In binary form, the number 10 is represented as 1010. 
//		Each digit in the binary representation represents a power of 2, with the rightmost digit representing 2^0 (1), 
		//the next digit to the left representing 2^1 (2), and so on. 
		//In this binary representation, the bits are set to 1 at positions corresponding to the powers of 2 that are present in the number. 
//		So, in the binary representation of 10, the second and fourth bits are set to 1.
	
		j = j >> 1;
		//Uses the bitwise right shift (>>) operator to shift the bits of j to the right by one position, effectively dividing j by 2.
		//Prints the value of j, which becomes 5 after the right shift operation.
		System.out.println(j);//5
		//To represent the decimal number 5 in binary form, you can repeatedly divide the number by 2 and keep track of the remainders. 
		//Here's how you can do it:
		//5 ÷ 2 = 2 remainder 1
		//2 ÷ 2 = 1 remainder 0
		//1 ÷ 2 = 0 remainder 1
		//Reading the remainders from bottom to top, we get the binary representation of 5:
		//

		//Decimal: 5
		//Binary:  101
		//So, the binary representation of the decimal number 5 is 101.
	}

}
