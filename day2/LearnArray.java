
package week1.day2;
import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		int [] values={10,20,30,40,50};//literals creating an array
		int [] num = new int[5];//instanziation it mandatory to do
	    num [0] = 10;
		num [1] = 20;
		num [2] = 30;
		num [3] = 60;
		num [4] = 70;
		//find the length of the array
		int length = num.length; // to check the length or size of the array
		System.out.println("Array Length:" +length);
		System.out.println("Array first index:" +num [0]);
		System.out.println("Array second index:"+num [1]);
		System.out.println("Array third index:" +num [2]);
		System.out.println("Array fourth index:"+num [3]);
		System.out.println("Array Fifth index:"+num  [4]);
		//print array last index
		System.out.println("Array Last Index:"+ values[length-1]);
		System.out.println("Array Last Index:"+ num[length-1]);
		//print array firsr index
		System.out.println("Array First Index:"+ values[0]);
		System.out.println("Array First Index:"+ num[0]);
		//sort the array
		Arrays.sort(values);// order the array in ascending order 
		System.out.println("second Third largest number"+num[length-3]);

	}

}
