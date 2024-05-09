package multioperator_functions;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// + , - , * , / and %
		int i=14;
		int j=10;
		
		System.out.println( i+j); // 24
		System.out.println( i-j); // 4
		System.out.println("Multiplication: " + i*j); // 140
		System.out.println(i/(float)j); // 1.4
		System.out.println("Modulu: " + i%j); // 4
		System.out.println(i/(int)(float)j);
		// operator precedence
		
		int k = 14 * 10 / (2 + 3);
		System.out.println(k);

	}

}
