package week1.day2;

import java.util.Arrays;

public class SortArray {

	// Perform below steps for Array practice
	// step 1: sort the array : Arrays.sort(numArr);
	// step 2: print the sorted array
	// step 3: find the largest number (last element)
	// step 4: find the smallest number (first element)

	public static void main(String[] args) {

		int[] numArr = { 23, 345, 2000, 3, 45 };
		// step 1: sort the array : Arrays.sort(numArr);
		Arrays.sort(numArr);

		// step 2: print the sorted array
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "] : " + numArr[i]);

		}
		// step 3: find the largest number (last element)
		System.out.println(numArr[numArr.length - 1]);

		//step 4: find the smallest number (first element)
		System.out.println(numArr[0]);

	}

}
