package javachallenge;

public class FindFactorial {

	public static void main(String[] args) {
		int a=8;    int i=1; int fact=1;
		while(i<=a) {
			fact=fact*i;
			i++;
			System.out.println("The factorial of given number is:" +fact); // it display all the number 
		}
		//System.out.println("The factorial of given number is:" +fact);// it display last number

	}

}
