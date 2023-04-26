package week1.day2;

public class PalindromeorNot {

	public static void main(String[] args) {
		int num=34343; // original variable
		int temp=num; //temp - temprorary variable 
	    int rev=0; // rev- reverse 
        int rem; // remainder
        while(num>0) {
        	rem=num%10; // here stored in remainder container
        	rev=(rev*10)+rem; // here stored in rev container
        	num=num/10; // here stored in num container
        }
        if(rev==temp) //here comparing the reversed and temp variable are reversed same 
        { 
        	System.out.println("it is a palindrome number");
        }
        else {
        	System.out.println("it is not a palindrome number");
        }
        
        }

	}


