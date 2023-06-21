package javachallenge;

public class LearnPalindrome {

	public static void main(String[] args) {
		int a=1330; int b=a; int rev=0; int rem;
		while(a>0) {
			rem = a%10;
			rev = rev*10+rem;
			a=a/10;
		}
		if(b==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
