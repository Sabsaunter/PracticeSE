package week3.day1;

public class Calculator {
	
	public void add(int a, int b) {

		System.out.println("Added value of a and b is: "+(a+b));

	}
	
	public void add(int a, int b, int c) {

		System.out.println("Added value a, b and c is: "+(a+b+c));

	}

	
	public void sub(int a, int b) {

		System.out.println("Subracted value of a and b is: "+ (a-b));

	}
	
	public void sub(double a, double b) {

		System.out.println("Subracted value of a and b is: "+ (a-b));

	}
	
	public void mul(int a, int b) {

		System.out.println("Multiplied value of a and b is: "+(a*b));

	}
	
	public void mul(int a, double b) {

		System.out.println("Multiplied value of a and b is: "+(a*b));

	}
	
	public void div(int a, int b) {

		System.out.println("Division value of a and b is: "+(a/b));

	}
	
	public void div(int a, double b) {

		System.out.println("Division value of b and a is: "+(b/a));

	}
	
	public static void main(String[] args) {


		Calculator calc = new Calculator();
		calc.add(10, 20);
		calc.add(5, 6, 9);
		calc.sub(10, 8);
		calc.sub(8.3, 7.22);
		calc.mul(5, 3);
		calc.mul(4, 3.98);
		calc.div(10, 2);
		calc.div(3, 12.3);

	}

}
