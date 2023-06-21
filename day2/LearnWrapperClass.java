package week3.day2;

public class LearnWrapperClass {
	/*
	 * Wrapper class are like wrappering something like, we wrapper chocolate and it protect the 
	 * chocolate, it like generic type and  like 
	 * 
	 * syntax
	 * List<wrapperclass> listName = new ArrayList<wrapperclass>();
	 * here wrapper class is the class to that it starts as caps
	 * and we can use it to something that can do instead of primitive datatype
	 * so, the wrapper class can give on some set of situtation
	 * Ex:
	 * List<String> listName = new ArrayList <String>();
	 * if it as an object we can use any kind of datatype because object is SuperMostClass
	 * like, ex:
	 * List<object> listName = new ArrayList<Integer>();
	 * so 
	 * 
	 *  Primitive DataType                       WrapperClass
	 * 
	 *   int -------------->                     Integer
	 *   float-------------->                    Float
	 *   double-------------->                   Double
	 *   short-------------->                    Short
	 *   char-------------->                     Character
	 *   byte-------------->                     Byte
	 *   boolean-------------->                  Boolean
	 * 
	 * and we also learn new features like
	 * 
	 * we can able convert one datatype into another datatype using wrapper class,
	 *  but not in primitve dt 
	 *    ex:
	 *    
	 */
	 public static void main(String[] args) {
	     int num=5; Integer nums=6;   // here int is primitive dt and Integer is wrapperClass,so
	     System.out.println(num);// in primitive dt we cannot able to convert it 
	     System.out.println(nums.floatValue());// here we can able convert one dt into other dt...
	 }
	     
	     
	     
	     
	     
	     


}
