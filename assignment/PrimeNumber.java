package week1.day1.assignment;

import java.util.Scanner;

public class PrimeNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int input;
		boolean flag=false;
		Scanner a = new Scanner(System.in);
		System.out.print("Enter input to check whether Prime or Not: ");
		input = a.nextInt();
		
		for (int i = 2; i < input/2; i++) {
			
			if (input%i==0) {
				
				flag=true;
				break;
				
			}
			
			
		}
		if(!flag)
			System.out.println("Given Number "+ input+" is a Prime Number");
		else
			System.out.println("Given Number "+ input+" is not a Prime Number");
	}

}
