package week1.day1;

public class Mobile {
	
	String mobileModel = "iPhone12";
	int mobileWeight = 169;
	boolean isFullyCharged = true;
	double mobileCost = 172000.50;

	public void makeCall() {
		System.out.println("Make Call");
	}
	public void sendMsg() {
		System.out.println("Send SMS");
	}
	public static void main(String[] args) {
		
		Mobile mymob = new Mobile();
		
		mymob.makeCall();
		mymob.sendMsg();
		
		System.out.println("Mobile Model: "+ mymob.mobileModel);
		System.out.println("Mobile Weight: "+mymob.mobileWeight);
		System.out.println("Mobile Cost: "+mymob.mobileCost);
		System.out.println("Mobile Fully Charged (True/False): "+mymob.isFullyCharged);

	}

}