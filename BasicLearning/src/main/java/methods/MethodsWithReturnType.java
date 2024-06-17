package methods;

public class MethodsWithReturnType {

	public static void main(String[] args) {
		
		MethodsWithReturnType main = new MethodsWithReturnType();
	        int result = main.add(5, 10);
	        System.out.println("Sum of the two numbers is: " + result);

	}
	
	public int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}

}
