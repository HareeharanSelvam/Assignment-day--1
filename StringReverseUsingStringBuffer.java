package javachallenge;

public class StringReverseUsingStringBuffer {

	public static void main(String[] args) {
		// string reverse using string buffer
		String str ="CodeCrush";
		String rev = "";
		//instantiate the string as string buffer class and pass the argument inside it as local var
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
