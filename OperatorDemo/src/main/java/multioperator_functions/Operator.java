package multioperator_functions;

public class Operator {

	public static void main(String[] args) {
		// operand 10 5
		// operator +
		// 10 + 5 
		
		// Arithmatic Operator
		// + , - , * , / , %
		
		int i = 10;
		int j = 7;
		
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println("Multiply: " + i*j);
		System.out.println("Divide: " + i/j);
		System.out.println("Remainder: " + i%j);
		
		
		int m1 = 10;
		int m2 = 7;
		//float > int
		
		float m3 = (float)m1/m2;
		System.out.println(m3);
		
		
		
		// odd and even 
		// number % 2 == 1 (odd) , == 0 = even
		
		System.out.println("**********");
		// Comparison Operator , boolean
//		System.out.println(i > j);
//		System.out.println(i >= j);
//		System.out.println(i < j);
//		System.out.println(i <= j);
//		System.out.println(i == j);
//		System.out.println(i != j);
//		
		
		int age = 10;
		// age < 18 = child
		// age >= 18 and age <= 30 = Adult
		// age > 30 and age < 45 =  Mature
		//  Old
		
		// bitwise Operator
		// &  |
		
		// AND (both condition is true then result will be true)
		// true & true = true
		// true & false = false
		// false & true = false
		// false & false = false
		
		
		
		// OR (any condition is true then result will be true)
		// true & true = true
		// true & false = true
		// false & true = true
		// false & false = false
		
		int i5 = 10;
		int j5 = 10;
		
		System.out.println((i5 == j5) || (i5 > j5)); // true | false 
		
//		Logical Operator - &&, ||

	}

}
