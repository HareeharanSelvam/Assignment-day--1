package javachallenge;

public class LearnProdOfNumber {

	public static void main(String[] args) {
		int a=25;
		int prod=1;
		while(a>0) {
			prod= prod*10+(a%10);
			a=a/10;
			System.out.println(prod);
			
		}
	}

}
