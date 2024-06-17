package methods;

public class Functions {

	public static void main(String[] args) {
		//Invoke functions
		
		sparta();
		
		int a=10;
		int b=20;
		add(a,b);
		System.out.println("--else--");
		add(5, 10);
		
	}
	
	
	//Creation of Method
		public static void sparta() {
			System.out.println("This is spartaa!..");
		}
		
		public static void add(int a, int b) { // parameterization
			System.out.println(a + b);
		}
	

}
