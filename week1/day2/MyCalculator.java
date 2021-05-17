package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator a = new Calculator();
		
		int sum= a.add(20, 30, 40);
		System.out.println("Sum is: " +sum);
		
		int Diff=a.Sub(50, 20, 10);
		System.out.println("Difference is: "+Diff);
		
		double mul=a.mul(23,24);
		System.out.println("Multiplicated value is: "+mul);
		
		float div=a.div(123,13);
		System.out.println("Divided value is: "+div);
		
	}

}
