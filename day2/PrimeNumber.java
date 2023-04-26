package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int m = 0, flag = 0;
	      int n = 13;
	      m = n / 2;
	      for (int i = 2; i <= m; i++) {
	            if (n % i == 0 && !(n==0) || (n==1)) {
	               System.out.println( n+ " it is not a prime number");
	               flag = 1;
	               break;
	            }
	         }
	         if (flag == 0) {
	            System.out.println( n+ " it is a prime number");
	
}

	}

}
