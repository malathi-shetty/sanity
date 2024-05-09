package multioperator_functions;

public class CharDemo2 {

	public static void main(String[] args) {
		
		// Java => J , a , v, a
		// ASCII Characters -  1 byte
		
		char c1 = 'D';
		System.out.println("value of the variable c1: " + c1);
		
//		Declares a variable c1 of type char and initializes it with the character 'D'.
//		Prints the value of the variable c1 to the console. It will print the character 'D'.
		
		// Keyboard char
		// binary
		// 1 byte
		// 4 byte
		
		int charAscii = c1;
		System.out.println("the Unicode value of the character 'D' is: " + charAscii);
		
//		Assigns the Unicode value (ASCII value) of the character c1 to the variable charAscii. 
		//In Java, characters are internally represented using Unicode.
//		Prints the Unicode value of the character c1 to the console. It will print the Unicode value of the character 'D'.
//		The Unicode value of the character 'D' is represented in decimal format. In Unicode, the character 'D' has a decimal value of 68.
//		So, the Unicode value of the character 'D' is 68.
		
		
		int ascii_n1 = 104; // 4 byte
		char n = (char)ascii_n1;
		System.out.println("ASCII value 104 is then casted to a char: "+n);
		
//		Declares a variable ascii_n1 of type int and initializes it with the integer value 104.
//		This value 104 represents the ASCII (or Unicode) value of a specific character. 
//		In this case, 104 corresponds to the ASCII value of the character 'h'.
//	So, ascii_n1 holds the ASCII value of the character 'h'.
		
//		char n = (char)ascii_n1;:
//		This line performs an explicit type casting of the integer variable ascii_n1 to a character (char) type.
//		It converts the ASCII value stored in ascii_n1 to its corresponding character.
//		Performs explicit type casting of the integer value 104 to a char.
//		The integer 104 represents the ASCII value of the character 'h'.
//		The ASCII value 104 is then casted to a char, resulting in the character 'h'.
//		Prints the value of the variable n to the console. It will print the character 'h'.
//		
//		Overall, this code snippet demonstrates the conversion between characters, their ASCII values, and integers in Java. 
//		It also shows how characters are represented internally using Unicode.







	}

}
