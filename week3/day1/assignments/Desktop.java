package week3.day1.assignments;

public class Desktop extends Computer{
	
	public void desktopSize(){
		
		System.out.println("Desktop size is 14 inch");
	}

	public static void main(String[] args) {


		Desktop myDesktop = new Desktop();
		myDesktop.computerModel();
		myDesktop.desktopSize();

	}

}
