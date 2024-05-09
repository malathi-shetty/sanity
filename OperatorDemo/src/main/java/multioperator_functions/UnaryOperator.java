package multioperator_functions;

public class UnaryOperator {

	public static void main(String[] args) {
		// unary operator only require one operand
		// + , - , ++ , -- , ! , ~
		//	++ increment operator (always increase value by 1)
		// pre  increment ++i [first increase then assign]
		// post increment i++ [first assign then increase]
		
		int i = 10;
		int j = i++ + ++i + i-- + ++i;
		//      10  +  12 + 12  + 12
		
//		The value of i at each step:
//
//			i++: Post-increment operator. This means the current value of i (10) is used first, and then i is incremented by 1. 
		//		So, i becomes 11, but the value used in the expression remains 10.
//			++i: Pre-increment operator. This means i is first incremented by 1 (now i becomes 12), 
				//and then the incremented value is used in the expression. So, i is 12 in this step.
//			i--: Post-decrement operator. This means the current value of i (12) is used first, 
			//	and then i is decremented by 1. So, i becomes 11, but the value used in the expression remains 12.
//			++i: Pre-increment operator. This means i is first incremented by 1 (now i becomes 12), 
			//	and then the incremented value is used in the expression. So, i is 12 in this step.
//			Now, let's compute the value of j:
//
//			i++: The value of i used here is 10.
//			++i: The value of i used here is 12.
//			i--: The value of i used here is 12.
//			++i: The value of i used here is 12.
		
//		Substituting the values:
//
//			j = 10 + 12 + 12 + 12
//			  = 46
//			So, after executing the statement int j = i++ + ++i + i-- + ++i;, the value of j is 46, and the value of i becomes 12.
//		
		System.out.println("i -> "+ i);
		System.out.println("j -> " + j);
		
		boolean b1 = false;
		System.out.println(!b1);
		
//		The logical NOT (!) operator negates the value of the boolean expression.
//		In this case, b1 is false, so !b1 evaluates to true.
//		The System.out.println() statement then prints the result, which is true.
//		So, the output of the code will be true. It prints true because the logical NOT operator negates the value of b1, which is false, 
		//resulting in true.
		
		int m1  = ~-10;  // 10 -> +10 , -1
		System.out.println(m1);
		
//		The code int m1 = ~-10; involves the bitwise complement operator ~ applied to the unary negation - operator. Let's break it down:
//
//	
//		int m1 = ~-10;
//		The unary negation - operator negates the value of the operand, which is -10.
//		The bitwise complement ~ operator performs a bitwise inversion of the bits of the operand.
//		Now, let's break down -10 in binary form:
//
//		Decimal: -10
//		Binary:  11111111111111111111111111110110 (32-bit representation)
//		Since -10 is represented in two's complement form in Java, it has all bits set to 1 
		//except for the sign bit (most significant bit) which is 0.
//
//		Applying the bitwise complement ~ operator:
//			~(-10) = 00000000000000000000000000001001
//		This binary representation corresponds to the decimal value 9. So, int m1 = ~-10; sets m1 to 9.
//
//		Therefore, System.out.println(m1); will output 9.

	}

}
