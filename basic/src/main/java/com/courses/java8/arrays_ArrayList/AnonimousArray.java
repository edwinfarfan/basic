package com.courses.java8.arrays_ArrayList;

public class AnonimousArray {

	public static void main(String[] args) {
		System.out.println("Minimum value: " + 
					findMinimum(new int[] { 3, 5, 4, 8, 6 }));
	}

	public static int findMinimum(int[] dataSeq) {
		int min = dataSeq[0];
		for (int index = 1; index < dataSeq.length; ++index) {
			if (dataSeq[index] < min) {
				min = dataSeq[index];
			}
		}
		return min;
	}

}
