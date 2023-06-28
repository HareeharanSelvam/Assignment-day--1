package javachallenge;

public class RevereseString {

	public static void main(String[] args) {
		String input= "TestLeaf";
		char[] output = input.toCharArray();
		//here we converted string into char array , so length is array property not method
		for (int i = output.length-1; i >=0; i--) {
			System.out.println(output[i]); 
		}

	}

}
