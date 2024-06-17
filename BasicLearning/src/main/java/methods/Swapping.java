package methods;

public class Swapping {

	public static void main(String[] args) {
		
		Swapping obj = new Swapping();
		int x=10;
		int y=20;
		
		swapFunction(x,y);
		

	}
	
	public static void swapFunction(int a, int b) {
		System.out.println("Before swapping, a = " + a + " b = " +b);
		
		int c = a;
		a=b;
		b=c;
		
		System.out.println("After swapping, a : " + a + " b : " + b);
		
	}

}
