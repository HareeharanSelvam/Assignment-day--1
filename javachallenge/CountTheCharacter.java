package javachallenge;

public class CountTheCharacter {

	public static void main(String[] args) {
		/*
		 * count the given character e in the given input TestLeaf
		 * so in that String we should count the particular element 
		 */
		   
		  String input="testLeaf";
		  int count=0;
		  char[] ch = input.toCharArray();
		  for (int i = 0; i < ch.length; i++) {
			  
			  if(ch[i]=='e') {
				  count++;
				  
			  }
		}
		  System.out.println(count);
	}

}
