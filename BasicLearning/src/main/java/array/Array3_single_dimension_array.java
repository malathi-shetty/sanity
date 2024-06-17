package array;

public class Array3_single_dimension_array {

	public static void main(String[] args) {

		int a[]= new int[5];
		int b[]= new int[5];
		int c[]= new int[5];
		
		int num=5;
		
		for(int i=0; i<5; i++) {
			a[i]=i;
			
		}
		
		for(int i=0; i<5;i++) {
			b[i]=num;
			
			++num;
		}
		
		System.out.print("Values of array 'A': ");
		for(int i=0; i<5; i++) {
			System.out.print(a[i] + " ");			
		}
		
		System.out.print("\nValues of array 'B': ");
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");		
		}
		
		for(int i=0; i<5; i++) {
			c[i]=a[i]+b[i];		
		}
		
		System.out.print("\nValues of array 'C': ");
		for(int i=0; i<5; i++) {
			System.out.print(c[i] + " ");		
		}

	}

}
