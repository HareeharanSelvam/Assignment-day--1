package javachallenge;

public class LearnThisKey {
	public LearnThisKey test() {
		int a=1;
		System.out.println(a);
		return this;
	}
	

	public static void main(String[] args) {
		LearnThisKey obj = new LearnThisKey();
		obj.test();
	     	 

	}

}
