package multioperator_functions;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		// AND OR
		//  AND  - & (all situation must be true) - bitwise,  if both bits are 1, it gives 1, else it shows 0. 
        // && - Logical
       // true & true = true
	  // true & false = false
	 //  false & true = false
	 //  false & false = false
		
	 // OR | (any one is true then result is true) - Bitwise, if either of the bits is 1, it gives 1, else it shows 0. 
	// || - Logical
    //	true | true = true
	//  true | false = true
	//  false | true = true
	//  false | false = false
		
		System.out.println("*OR OPERATOR*");
		System.out.println(TRUE() || TRUE()); // 10 seconds - m1 - 5 seconds
		System.out.println("*1*");
		System.out.println(FALSE() || TRUE());
		System.out.println("*2*");
		System.out.println(TRUE() || FALSE());
		System.out.println("*3*");
		System.out.println(FALSE() || FALSE());
		System.out.println("*4*");
		
		System.out.println("");
		System.out.println("*AND OPERATOR*");
		System.out.println(TRUE() & TRUE()); // 10 seconds - m1 - 5 seconds
		System.out.println("*1*");
		System.out.println(FALSE() & TRUE());
		System.out.println("*2*");
		System.out.println(TRUE() & FALSE());
		System.out.println("*3*");
		System.out.println(FALSE() & FALSE());
		System.out.println("*4*");
		
		System.out.println("");
	}

	private static boolean TRUE() {  // 5 seconds
		System.out.println("m1 - 5 seconds");
		return true;
	}
	
	public static boolean FALSE() { // 5 seconds
		System.out.println("m2  - 5 seconds");
		return false;
	}

}
