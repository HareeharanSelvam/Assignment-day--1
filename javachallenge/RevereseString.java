package javachallenge;

public class RevereseString {

	public static void main(String[] args) {
		String input= "TestLeaf";
		char[] output = input.toCharArray();
		for (int i = output.length-1; i >=0; i--) {
			System.out.println(output[i]); 
		}

	}

}
