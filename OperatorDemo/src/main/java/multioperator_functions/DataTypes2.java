package multioperator_functions;

public class DataTypes2 {

	public static void main(String[] args) {
		int i = 011;
		System.out.println(i);
		// if we are adding 0 before any number - it become octal (0,1,2,3,4,5,6,7)
		// if we are adding 0X before any number - it become hexadecimal
		// if we are adding 0b before any number - it become binary

		int j = 13_47_83_84;
		System.out.println(j);

		int i1 =  10;
		int j1 = 4;


		int k1 = 260;   // 4 byte
		byte b1 = (byte) k1;  // 1 byte
		System.out.println(b1);

		// 127 = 127
		// 128 = -128
		// 129 = -127
		// 130 = -126
		// 
		// 0 -> 127 -> -128 - 0


		//		floating - 12.8
		// float
		// double

		float f1 = 34.5f;
		System.out.println(f1);

		double d1 = 3.5d;
		System.out.println(d1);

		int m1 = 10;
		int m2 = 4;
		float j2 =(float)(int)(double)((float)m1/(float)m2);


		float k10 = 10;
		int k11 = 4;
		System.out.println(k10/k11);

		// int and float -> float preference 

		// 8 byte
		// 4 byte

		//		System.out.println(j2); 

		//  true / false
		boolean b51 = true; 
		boolean b52 = false;

	}

}
