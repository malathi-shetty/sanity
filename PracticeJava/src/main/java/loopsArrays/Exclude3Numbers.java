package loopsArrays;

public class Exclude3Numbers {

	public static void main(String[] args) {
		
		//Write a java program to print numbers from 1 to 10, excluding  4,7,8.
		for(int i=1; i <=10; i++) {
			
			if(i!=4 && i !=7 && i!=8) { //This program uses a for loop to iterate from 1 to 10. 
				//Inside the loop, it checks if the current number is not equal to 4, 7, or 8, and if it's not, it prints the number.
				System.out.println(i);
			}
			
		}

	}

}
