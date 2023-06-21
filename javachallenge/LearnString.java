package javachallenge;

import java.util.Iterator;

public class LearnString {

	public static void main(String[] args) {
		String name = "TestLeaf";
		String compName= "Chennai";
		//converting string into char array to count individually
		char [] charArray = name.toCharArray();
		System.out.println(charArray);
		System.out.println("==================");
		//to iterate the characters inside for loop
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);	
		}
		System.out.println("================");
		//to return at the particular index we use charAt
		char charAt = name.charAt(3);
		System.out.println("particular index:" +charAt);
		//concating two strings 
		System.out.println("concate operator:" +name+compName);
		System.out.println("concate Method:" +name.concat(compName));
		
		
		
	
		
		
		
		
		
		
		
	}

}
