package numberSeries;

public class ReverseNumber {

	public static void main(String[] args) {
		// 245 = 542
		
		// rev = 0
		// 245 % 10 = 5
		// 245 / 10 = 24
		
		// rev = rev * 10 + 5  = 5
		// 24 % 10 = 4
		// 24 / 10 = 2
		// rev = rev * 10 + 4  = 54
		
		// 2 % 10 = 2
		// 2 / 10 = 0
		// rev = rev * 10 + 2  =  542
		
		// test // tset
		
		int number = 1231;
		int initialNumber = number;
		int rev = 0;
		while(number != 0) {
			rev = rev * 10 + (number % 10);
			number /=  10;
		}
//		System.out.println(rev);

		if(initialNumber == rev) {
			System.out.println("number is palindrom");
		}else {
			System.out.println("number is not palindrom");
		}
		
		
		// Palindrom = 12421
		// reverse number
		// rev number and actual number compare -  if both are same
		

	}

}
