package com.courses.java8.arrays_ArrayList;

public class Multidimentions {

	// creating multidimensional arrays
	int[][] vars1;   // 2D array
	int vars2 [][];  // 2D array
	int[] vars3[];   // 2D array
	int[] vars4 [], space [][];  // a 2D and a 3D array
			
	int cats[]= new int [5];
			
	char[] ca = {0x4e, '\u004e', 78};
	
	//this is legal...
	int [][] args = new int [4] [];

	//int[] vars5 []=new int [][4];  ///Cannot specify an array dimension after an empty dimension

	
	public static void main(String... args) {
		// TODO Auto-generated method stub

		System.out.println ("variable: " + '\u004e');
		
		//these are not legal;
		//int f[3] = {2,3,4};
		//int [] nros = new int [2] {1,2};
		
		
		int md[][] = new int [][] {{1,3,5},{7,54,6}};
		
 		
		// using multidimensional arrays
				// looping through them
				int[][] twoD = new int[3][2];
				for (int i = 0; i < twoD.length; i++) {
					for (int j = 0; j < twoD[i].length; j++)
						System.out.print(twoD[i][j] + " "); // print element
					System.out.println(); // time for a new row
				}

				// looping multidimensional array this time with enhanced for (for-each)
				for (int[] outer : twoD) {
					for (int num : outer)
						System.out.print(num + " ");
					System.out.println();
				}
	}

}
