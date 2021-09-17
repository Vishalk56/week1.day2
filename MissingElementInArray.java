package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,5,4,7,6,8};
		
		Arrays.sort(arr);
		System.out.println("Array in sorted order :");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("** Verifying Missing Element in sorted order ***");
		for(int i=0;i<arr.length;i++) {
			if(i+1==arr[i]) {
				System.out.println(arr[i]);
			}else {
				System.out.println("missing number is : "+(i+1));
				break;
			}
		}
	}

}
