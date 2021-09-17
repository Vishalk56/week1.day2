package week1.day2;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };

		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		Arrays.sort(arr1);
		
		System.out.println("Array1 in sorted order :");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		Arrays.sort(arr2);
		System.out.println("Array2 in sorted order :");
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println("********************");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println("intersection index is : "+i+" and the number is : "+arr1[i]);
				}
			}

		}

	}

}
