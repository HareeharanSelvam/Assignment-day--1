package week1.day1;

public class Mobile {
	public void makeCall() {
		String mobileModel="Redmi";
		float mobileWeight = 15.0f;
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	public void sendMsg() {
		boolean fullCharged =true;
		int mobileCost=20000;
		System.out.println(fullCharged);
		System.out.println(mobileCost);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
	Mobile redmi = new Mobile();
	redmi.makeCall();
	redmi.sendMsg();
	System.out.println("This is my mobile");
}
		
	}

