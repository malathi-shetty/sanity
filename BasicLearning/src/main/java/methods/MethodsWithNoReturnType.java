package methods;

public class MethodsWithNoReturnType {

	public static void main(String[] args) {
		MethodsWithNoReturnType mnr = new MethodsWithNoReturnType();
		mnr.add(5,10);
	}

public void add(int num1, int num2){
	int sum = num1+num2;
	System.out.println("Sum of the two numbers are: " + sum);
}
	

}
