package week1.day2;

public class FrequencyNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 1, 2, 6, 3, 6, 2, 4, 7, 1 };

		int[] arr1 = new int[arr.length];
		int count, freq;
		
		for(int i=0;i<arr.length;i++) {
			count=0;
			freq=0;
			for (int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					arr1[j]=-1;
					if(freq>=2) {
						System.out.println("number is : "+arr[i]);
						continue;
					}
				}
			}
		}
		
	}

}
