package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnListCollection {

	public static void main(String[] args) {
		
		//learning List collection inteface
		
		List<String> name = new ArrayList<String>();
		//Adding string of names 
		//also check for duplicate values are allowed
		name.add("Lucifer");
		name.add("Chloe");
		name.add("Amendiael");
		name.add("Maze");
		name.add("Ella");
		name.add("Linda");
		name.add("Chloe");
		name.add("Charloette");
		System.out.println("Adding Method:");
		System.out.println(name);
		System.out.println("=====================================");
		
		
		//remove dupicates based on the index 
		//so we can grow or shrink the data 
		name.remove(6);
		System.out.println("Removing method:");
		System.out.println(name);
		System.out.println("=====================================");
		
		//Length of my list so we use size()
		System.out.println("Length of the List:");
		System.out.println(name.size());
		System.out.println("=====================================");
		//or we can iterate through foe loop like, 
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));// using get to get individual index
		}
	
		System.out.println("=====================================");
		//get method to get the particular element based on index
		System.out.println("get particular element based on index:");
		System.out.println(name.get(5));///returns index base particular element
		
		//adding other name
		System.out.println(name.add("Daniel"));
		System.out.println(name);
		System.out.println("===================================");
		
		//converting List into Array after convert only check for contains
		Object[] array = name.toArray();
		System.out.println("Converting list into array:");
		System.out.println(array);//print the address of the object where it stored
		System.out.println("=============================");
		
		//contains that i.e if element exist or not its Case Sensitive
		System.out.println("contains used to whether element exist or not:");
		System.out.println(name.contains("Chloe"));
		System.out.println("===============================");
		
		//To sort the collections using sort method use collections is a class
		Collections.sort(name);
		System.out.println("After sort the list:");
		System.out.println(name);
		

		
		
		
		
	 

	}

}
