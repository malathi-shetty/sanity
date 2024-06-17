package methods;

public class MethodsWithReturnValues {

	public static void main(String[] args) {
		
		MethodsWithReturnValues obj = new MethodsWithReturnValues();
		int x=10;
		int y=20;
		
		int get_result=obj.add(x, y);
		System.out.println(get_result);

	}
	
	
	public int add(int a, int b) {
		int result = a+b;
		return result;
	}

}
