package javachallenge;

public class HappyNumber {

	public static void main(String[] args) {
	    int n=19;
		int temp;
		int rem;
		int sum=0;
		temp=n;
		//calc the sum of squares of digits 
		while(sum!=1 && sum!=4) {
			sum=0;
			while(n>0) {
			rem=n%10; 
			sum=sum+(rem*rem);
			n=n/10;
			}
			n=sum;
		}
		if (sum==1) {
			System.out.println("it is a happy number: "+temp);
			
		}
		else {
			System.out.println("it is not a happy number: "+temp);
		}
	}

}
