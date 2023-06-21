package javachallenge;

public class EvenOdd {

	public static void main(String[] args) {
/*
 * print even or odd , if it is then even print 1 to 10
 * if its odd then print from 90 to 100
 */
		int a=1;
		int b=90;
		while(a<=10) {
			if(a%2==0)
			{
				System.out.println("even number 1 to 10:" +a);
			}
			a++;
		}
		System.out.println("================");
				while(b<=100) {
					if(b%2!=0) {
			System.out.println("Odd number 90 to 100:" +b);
					}
					b++;
					
			}
	}

}
