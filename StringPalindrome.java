package javachallenge;

public class StringPalindrome {

	public static void main(String[] args) {
		/*
		 * Wap to check whether given String is Palindrome or not Radar
		 * 
		 */
		String  str="Radar";
		String reverse=" ";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch= str.charAt(i);
			reverse = str+reverse;
			System.out.println(reverse);
			
			
		}

	}

}
