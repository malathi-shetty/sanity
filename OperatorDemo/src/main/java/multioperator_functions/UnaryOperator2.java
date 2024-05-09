package multioperator_functions;

public class UnaryOperator2 {

	public static void main(String[] args) {
		// 1 operand
		// ++ , -- , + , - , ! , ~
		
		// increment / decrement
		// pre increment = first increase then assign  ++i
		// post increment = first assign then increase i++
		
		
		int i = 10;
		int j = i++ + ++i + i++ + i++ + ++i + i-- + --i;
		//      10  + 12  + 12  + 13  + 15 +  15 +  13
		System.out.println("j:" + j);  //   
		System.out.println("i:"+ i);   // 13
		//System.out.println(i);
		
		
		
		i+=5; // i = i + 5;
		i-=5; // i = i - 5;
		i*=5;
		i/=5;
		i%=5;
		
//		+ 
	//  +  - Unary
	//  +  - Arithmatic 
	//  + - Append 
		// until string is nto there, + will behave as arithamtic -> append operator
//		System.out.println(10+20+30); // 60	
//		System.out.println(10+20+""+30); // 3030 / 60  
//		System.out.println(""+10+20+30); // 60	
		
		// reversing operator
		boolean b1 = false;
		System.out.println(!b1);
		

	}

}
