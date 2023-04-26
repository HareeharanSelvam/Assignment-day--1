package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int firstnumber= 0;
		int secondnumber=1;
		int sum;
		System.out.println(firstnumber);
		System.out.println(secondnumber);
		while(secondnumber<13)
		{
			sum=firstnumber+secondnumber;
			System.out.println(sum);
			firstnumber=secondnumber;
			secondnumber=sum;
		}

	}

}
