package javachallenge;

public class StringPalindrome2 {

	public static void main(String[] args) {
		//string palindrome it should be same start letter and end letter 
		String input="radar";
		String rev =" ";
		//without using string to charArray
		for (int i = input.length()-1; i>=0; i++) {
			rev = rev+input.charAt(i);
			if(rev==input) {
				System.out.println("its string palindrome ");
			}
		}
		
			
		System.out.println(rev);

	}

}
