package javachallenge;
  
public class LearnMethods {
	public void Test() {
		String input ="TestLeaf";
		char[] ch= input.toCharArray();
		for (int i =ch.length-1; i >=0; i--) {
			System.out.println(ch[i]);
		}
			
		}
		public static void main(String[] args) {
			LearnMethods obj1 = new LearnMethods();
			obj1.Test();
			Print();
			System.out.println("Main Methods here");
		}
       public static void Print() {
    	   int a=15;
    	   System.out.println(a);
       }
     
	}
