package week3.day1.assignments;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit() {

		System.out.println("My deposit Account created as per AxisBank Class");
		
	}

	public static void main(String[] args) {


		AxisBank myBank = new AxisBank();
		myBank.deposit();
		myBank.fixed();
		myBank.saving();

	}

}
