package javaPractice;

//Palindrome number in java: A palindrome number is a number that is same after reverse. 
//For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers. 
//It can also be a string like LOL, MADAM etc.

//Steps
//Get the number to check for palindrome
//Hold the number in temporary variable
//Reverse the number
//Compare the temporary number with reversed number
//If both numbers are same, print "palindrome number"
//Else print "not palindrome number"

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int r,sum=0,temp;
		
		int n = 545;// Input number to be check (Palindrome Number)
		//int n = 541; Not Palindrome
		temp=n;
		
		while(n>0) {
			
			r=n%10; // getting remainder
			sum = (sum*10)+r;
			n=n/10;
				
		}
		if (temp==sum) {
			
			System.out.println("Palindrome Number");
		}else 
			System.out.println("Not Palindrome");

	}

}
