package javachallenge;

public class StringReplace {

	public static void main(String[] args) {
		// String replace all the occurrences of the given character from the string 
		String str ="TesTleaF";
		char ch ='T';
		removeChar(str, ch);
	}
		public static void removeChar(String str,char ch) {
			int n =str.length();
			String str1= " ";
			for (int i = 0; i<n ; i++) {
				if(str.charAt(i)!= ch) {
					str1 = str1+str.charAt(i);
				}
			}
			System.out.println(str1);
			
		}

	}


