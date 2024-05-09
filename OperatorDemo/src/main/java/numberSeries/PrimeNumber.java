package numberSeries;

public class PrimeNumber {

	public static void main(String[] args) {
		// number which is devided by 1 and itself
				// 1  = PN
				// 2 = PN
				// 3 = PN
				// 4 
				// 5 = PN
				// 6 = 
				// 7 = PN
				// 8 
				// 9 
				// 10
				// 11

				//	a = 11
				//  for(n = 2 to (a-1))
				//  number % n == 0 //  PN nhi hai 	

				for(int number = 2; number  < 100 ; number++) {
					boolean isPrimeNumber = true;
					for(int i = 2 ;i <=  (number-1) ; i++ ) {
						if(number % i == 0) {
							isPrimeNumber = false;
							break;
						}
					}
					if(isPrimeNumber) {
						System.out.println(number);
					}

				}

	}

}
