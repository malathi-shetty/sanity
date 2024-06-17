package dataTypes;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// +,-,*,/
		
		int a=10;
		int b=20;
		
		float c=10f;
		float d=20f;
		
		//Relational Operators
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(c/d); //0.5
		System.out.println(a%b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println("----");
		
		//Logical Operators - And , OR
		
		boolean x = true;
		boolean y = false;
		
		System.out.println("---AND OPERATOR---");
		System.out.println(x && y);//both value should be true then o/p would be true
		System.out.println(y && x);
		System.out.println(x && x);
		System.out.println(y && y);
		
		System.out.println("---OR OPERATOR---");
		System.out.println(x || x); //either value should be true then o/p would be true
		System.out.println(y || y);
		System.out.println(x || y);
		System.out.println(y || x);

	}

}
