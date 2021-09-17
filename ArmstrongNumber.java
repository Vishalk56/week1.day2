package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153, Rem, Quot, result = 0;

		/*
		 * int R1 = num % 10; System.out.println("R1 is : " + R1); int Q1 = num / 10;
		 * System.out.println("Q1 is : " + Q1); int res1 = R1 * R1 * R1;
		 * System.out.println("res1 is : " + res1);
		 * 
		 * R1 = Q1 % 10; System.out.println("R1 is : " + R1); Q1 = Q1 / 10;
		 * System.out.println("Q1 is : " + R1); res1 = res1 + R1 * R1 * R1;
		 * System.out.println("res1 is : " + res1);
		 * 
		 * R1 = Q1 % 10; System.out.println("R1 is : " + R1); Q1 = Q1 / 10;
		 * System.out.println("Q1 is : " + R1); res1 = res1 + R1 * R1 * R1;
		 * System.out.println("res1 is : " + res1);
		 * 
		 * if (res1 == num) { System.out.println("Number is Armstrong number : " + num);
		 * } else { System.out.println("Not an Armstrong number : " + num); }
		 */
		int temp=num;
		while (num > 0) {
			Rem = num % 10;
			System.out.println("Rem is : " + Rem);
			
			Quot = num / 10;
			System.out.println("Quot is : " + Quot);
			
			result = result + (Rem * Rem * Rem);
			System.out.println("result is : " + result);
			
			num=Quot;
			System.out.println("Num is : " + num);
			
		}
		if(result==temp) {
			System.out.println(temp+" is an Armstrong number");
		}else {
			System.out.println(temp+" is NOT an Armstrong number");
		}

	}

}
