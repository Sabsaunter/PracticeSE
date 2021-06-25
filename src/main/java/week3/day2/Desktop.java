package week3.day2;

public class Desktop implements HardWare, Software{
	
	public void desktopModel() {


		System.out.println("Dell inspiron 14 is the desktop Model");

	}

	public void softwareResources() {

		System.out.println("OS is Windows10");
		
	}

	public void hardwareResources() {

		System.out.println("Hardware is Intel 5");
		
	}
	
public static void main(String[] args) {


		Desktop myDesktop = new Desktop();
		myDesktop.hardwareResources();
		myDesktop.softwareResources();
		myDesktop.desktopModel();

	}

}
