package javachallenge;

public class StringReverseCharArray {

	public static void main (String[] args) {
		//string reverse using or converting String into charArray 
		String str = "CodeCrush";
		String strRev =" ";
		//converting string into charArray
		char[] ch = str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			strRev = strRev+ch[i];
		}
        System.out.println(strRev);
	}

}
