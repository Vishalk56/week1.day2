package week1.day2;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					if(count>1) {
						System.out.println("Duplicate number : "+arr[i]);
					}
				}
			}
		//	System.out.println(+arr[i] + " count is : " + count);
		}
	}

}
