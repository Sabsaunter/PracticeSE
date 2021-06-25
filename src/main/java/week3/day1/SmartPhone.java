package week3.day1;

public class SmartPhone extends Android{
	
		public void connectWhatsapp() {
		// TODO Auto-generated method stub
		System.out.println("Connect Whatsapp");
	}

		@Override
		public void takeVideo() {
		
			System.out.println("Video from Smartphone");
		}
		
		public static void main(String[] args) {

			SmartPhone myPhone = new SmartPhone();
			myPhone.takeVideo();
		}
}
