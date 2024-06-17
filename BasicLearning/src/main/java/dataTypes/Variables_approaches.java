package dataTypes;

public class Variables_approaches {

	public static void main(String[] args) {
		
		//approach -1: assign 3 variables different values - if all variables belongs to different data types
		int a = 100;
		int b = 200;
		int c = 300;
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
		System.out.println("Value of c: " + c);
		
		System.out.println(" ");
		// approach 2: 
		int x,y,z; // writing variables in one line by SAME datatype only applicable - decalration
		x=400; // assign values
		y=500;
		z=600;
		
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
		System.out.println("Value of z: " + z);
		System.out.println(" ");
		// approach 3:
		int m=700,n=800,o=900; // if all variables belongs to SAME datatype only applicable
		System.out.println("Value of m: " + m);
		System.out.println("Value of n: " + n);
		System.out.println("Value of o: " + o);
		System.out.println(" ");
		
		//System.out.println(m+n+o); // will give addition of all number
		System.out.println("Printing all number in one line: " + m + " " + n + " " + o);

	}

}
