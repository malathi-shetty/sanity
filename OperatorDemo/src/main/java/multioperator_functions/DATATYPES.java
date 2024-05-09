package multioperator_functions;

public class DATATYPES {

	public static void main(String[] args) {


		// 127
		// 2 power 15
//		type casting
		
//		Type Casting:
//
//			Type casting is the process of converting a value from one data type to another.
//			In Java, there are two types of type casting: implicit casting (widening conversion) and explicit casting (narrowing conversion).
//			Implicit casting happens automatically when a value of smaller data type is assigned to a variable of larger data type.
//			Explicit casting is done manually when a value of larger data type is assigned to a variable of smaller data type. 
		//It requires the use of parentheses and the desired target data type.
		
		short b1 = 190; // 2 bytes
			//Declares a variable b1 of type short and initializes it with the value 190.
			//A short data type occupies 2 bytes in memory.
	byte b2 = (byte)b1; // 1 byte
			//Performs explicit type casting of the short variable b1 to a byte.
//			Since a byte data type can only hold values from -128 to 127, 
//			casting a short to a byte may result in a loss of data if the value is outside this range.
//			In this case, the value 190 falls outside the range of a byte.
		System.out.println("Explicit type casting of the short variable b1 to a byte: " + b2);
		//		Prints the value of the byte variable b2.
		//		Since 190 exceeds the range of a byte, the value is truncated. 
		//		The result of the explicit type casting will be the least significant 8 bits of the short value 190, 
		//		which is 190 % 256, resulting in b2 being assigned the value -66.
//
		//		So, when you print b2, it will output -66.
		
		// 150 = 0010110
		//       1101001 = 105+1 = -106
		System.out.println("*******");
		
		byte i = 0Xb;
		System.out.println("the byte variable i: " + i);
		
		// 0 before any number ->  Octal (0,1,2,3,4,5,6,7)
		// 0X = Hexadecimal
		// 0b = binary
		
//		Hexadecimal and Octal Literals:
//
//			Hexadecimal literals are prefixed with 0x or 0X and represent values in base-16 numbering system (0-9, A-F).
//			Octal literals are prefixed with a leading zero (0) and represent values in base-8 numbering system (0-7).
		
//		 the hexadecimal value 0Xb is interpreted:
//
//			 0X indicates that the following characters represent a hexadecimal value.
//			 b in hexadecimal represents the decimal value 11.
//			 However, there's a potential issue with the assignment because 0Xb is not a valid hexadecimal literal. 
//			 In Java, hexadecimal literals should be followed by a series of digits ranging from 0 to 9 and 
//			 letters ranging from A to F (or a to f) to represent values from 10 to 15 in hexadecimal.
//
//			 If you intended to assign the decimal value 11 to the byte variable i, you should use:
//			 byte i = 11;
//			 System.out.println(i);
//			 This would correctly assign the value 11 to the variable i.
		
		System.out.println("*******");
		
		int num = 1_2; // 12
		int num1 = num+num;
		System.out.println("underscore value: " + num1);
		
	
		
//Initializes an integer variable num with the value 12.
//The underscore (_) is used as a delimiter to improve readability of the number. It doesn't affect the value, so 1_2 is interpreted as 12.
//Adds the value of num to itself and assigns the result to the variable num1.
//Since num is 12, num + num equals 12 + 12, which is 24.
//Prints the value of num1, which is 24.
//Therefore, when you run this code, it will output 24.

//		Underscores in Numeric Literals:
//
//			Underscores (_) can be used in numeric literals (integer, floating-point, etc.) to enhance readability.
//			They do not affect the value of the literal. They are simply used as separators for better readability.
		
		
//		System.out.println(b1);
		// straight forward
		
		//  Type Casting 
//		byte < short < int  < long
		
		System.out.println("*******");
		
		byte n1 = 10;
		short nj = n1; // Automatic conversion
		System.out.println(nj);
		
//		There is automatic type promotion happening here. 
//		Java allows automatic type promotion from a smaller data type (byte) to a larger data type (short) without explicit casting, 
//		as long as the value being assigned fits within the range of the larger data type.
//
//		Explanation:
//
//		byte n1 = 10;:
//
//		Declares a variable n1 of type byte and initializes it with the value 10.
//		short nj = n1;:
//
//		Assigns the value of n1 (which is 10) to the variable nj of type short.
//		Since short can accommodate a wider range of values compared to byte, automatic type promotion occurs, 
//		and the value of n1 (which fits within the range of short) is assigned to nj.
//		Therefore, the assignment short nj = n1; is valid and nj will be assigned the value 10.
		
//		Automatic and Explicit Type Casting:
//
//	Automatic type casting (widening conversion) occurs when a value of smaller data type is assigned to a variable of larger data type.
//			Explicit type casting (narrowing conversion) is done manually using parentheses and the desired target data type.
//			Explicit casting may result in loss of data if the value being casted is outside the range of the target data type.
		
		System.out.println("*******");
		
		short mk = 190;
		byte h1 = (byte)mk;
		System.out.println(" type casting of the short variable mk to a byte: " + h1);
		
//		short mk = 190;:
//			Declares a variable mk of type short and initializes it with the value 190.
//		byte h1 = (byte)mk;:
//
//			Performs explicit type casting of the short variable mk to a byte.
//			This line may result in a data loss because a byte can only hold values from -128 to 127. 
//			Since 190 falls outside this range, it gets truncated to fit within the range.
//			System.out.println(" type casting of the short variable mk to a byte: " + h1);:
//
//			Prints the string " type casting of the short variable mk to a byte: " concatenated with the value of h1.
//			So, if you run this code, it will output:

//			type casting of the short variable mk to a byte: -66
//			This indicates that the value of mk after being casted to a byte is -66. 
//			The value is printed in the context of the provided message.
//

		
		float g2 = 1.4f;
		float g3 = 3.4f;
		
//		Two float variables g2 and g3 are declared and initialized with the floating-point literals 1.4f and 3.4f respectively.
//
//		Explanation:
//
//		float g2 = 1.4f;:
//
//		Declares a float variable g2 and initializes it with the value 1.4f.
//		The f suffix indicates that the number 1.4 should be treated as a float literal, 
//		ensuring that it is interpreted correctly by the compiler as a float instead of a double.
//		float g3 = 3.4f;:
//
//		Declares another float variable g3 and initializes it with the value 3.4f.
//		These lines of code demonstrate the declaration and initialization of floating-point variables in Java. 
//		The float data type is used to represent single-precision 32-bit floating-point numbers. 
//		The f suffix is added to the numeric literals to explicitly specify them as float values.
		
		float g1 = 134.5f;
		double d4 = 145.6;
		
//		Two floating-point variables, g1 and d4, are declared and initialized.
//
//		float g1 = 134.5f;:
//
//		Declares a float variable named g1 and initializes it with the value 134.5f.
//		The f suffix indicates that the number 134.5 should be treated as a float literal instead of a double literal.
//		double d4 = 145.6;:
//
//		Declares a double variable named d4 and initializes it with the value 145.6.
//		Unlike float, a double does not require a suffix to indicate it's a double literal. 
		//Numeric literals without a suffix are interpreted as double by default.
//		Explanation:
//
//		The float data type is a single-precision 32-bit floating-point type, 
	//	suitable for representing numbers with fractional parts that do not require high precision.
//		The double data type is a double-precision 64-bit floating-point type, 
	//	capable of representing larger numbers and providing higher precision compared to float.
//		In this code snippet, g1 is initialized with a float literal, and d4 is initialized with a double literal.
//		These lines demonstrate the use of floating-point literals and the declaration of variables 
		//with different floating-point data types in Java.
		
//		byte j = 128;
		// numerical - int
		
		
		// 2*5 = 10 expression value
		// 10 = literal   
		
//		Numeric Data Types:
//
//			Java provides different numeric data types such as byte, short, int, long, float, and double.
//			The size of each data type determines the range of values it can store.
//			It's important to choose the appropriate data type based on the requirements of the program to ensure efficient 
		//memory usage and accurate representation of data.
		
		System.out.println("*******");
		boolean b5 = false;
		System.out.println(b5);
		
//		Boolean Data Type:
//
//			The boolean data type represents two possible values: true and false.
//			It is typically used for logical expressions and conditions.

	}

}
