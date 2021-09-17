package week1.day2;

/*
Pallindrome of a number
=======================
Pseudocode
STEP 1 : Declare the variable as int =454;
STEP 2 : Hold the number in a temporary variable.
STEP 3 : Reverse that number.
STEP 4 : Compare the temporary number with the reversed number.
STEP 5 : If both numbers are the same, print "palindrome number".
STEP 6 : Else print "not palindrome number".

Expected Output
Pallindrome of the given number is : 454

*/
public class Palindrome {

	public static void main(String[] args) {
		int num=12321, temp=num, sum=0, rem;

		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("Given number " +temp+ " is palindrome : "+sum);
		}else {
			System.out.println("Given number " +temp+" is NOT palindrome : "+sum);
		}
		
			
			
		}
}
