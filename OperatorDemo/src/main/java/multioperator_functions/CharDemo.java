package multioperator_functions;

public class CharDemo {

	public static void main(String[] args) {
//		2 type of 
		
//		ascii code - 1 byte
//		unicode code - 2 byte
		
//		mynameisshivam
// class mynameisshivam
// class myNameIsShivam - camel casing
// class MyNameIsShivam - hungarian
		
		char c1= ' '; // Declares a char variable named c1 and initializes it with a space character.
		System.out.println("Space character:" + c1); // Prints the value of c1, which is a space character, to the console.	
		int c1AsciCode = c1; // // Declares an int variable named c1AsciCode and assigns the ASCII value of c1 to it.
		System.out.println("The ASCII code of the space character stored in the variable c1:" + c1AsciCode);  // Prints the ASCII value of c1 to the console.
		
		int i=70; // Declares an int variable named i and initializes it with the value 70.
		char jk = (char)i;
		// Declares a char variable named jk and assigns the character corresponding to the ASCII value 70 to it, which is 'F'.

		System.out.println("char variable of ASCII value 70 is: "+ jk);// // Prints the value of jk, which is 'F', to the console.
		
		// for every language in world - unicode chart
		
		char b1= '\u0935';
		char b2= '\u0948';
		char b3= '\u092D';
		// Declares char variables b1, b2, and b3 and assigns them Unicode characters representing specific characters in some language.
		System.out.println(b1 +"" + b2 + "" + b3 + "" + b1);
		// Prints the concatenation of b1, b2, b3, and b1 to the console.
		
		char b4= '\u092E';
		char b5= '\u093E';
		char b6= '\u0932';
		char b7= '\u0924';
		char b8= '\u0940';
		System.out.println("unicode of malathi:" + b4 +"" + b5 + "" + b6 + "" + b7+ "" + b8);
		
		

	}

}
