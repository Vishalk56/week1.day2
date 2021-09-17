package week1.day2;

public class LearnWhile {

	// Problem statement is to print the sum of digits in a given number
	// Input 2345
	// Output 2+3+4+5 = 14

	public static void main(String[] args) {

		int number = 2345;
		int quotient = 0, remainder = 0, sum = 0;

		while (number != 0) {
			quotient = number / 10;
			remainder = number % 10;
			sum = sum + remainder;
			number = quotient;
			System.out.println("Number is : "+number);
		}
		System.out.println("Sum is : " + sum);

	}

}
