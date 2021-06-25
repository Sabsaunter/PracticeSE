package week1.day1.assignment;

import java.util.Scanner;

public class FibonacciSeries {

	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int range, firstNum=0, secNum=1, sum;
		
		Scanner r = new Scanner(System.in);
	 System.out.println("Enter how may fibonnaci numbers to print: ");
		range = r.nextInt();
		
		System.out.println("Fibonacci Series till " + range + " are:");
		
		System.out.print(firstNum+", "+secNum);
		
		for (int i = 0; i <range-2; i++) {
						
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			
			System.out.print(", " +sum);
			
		}

	}

}
