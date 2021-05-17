package week1.day1.assignment;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int fact=1, input;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter input for Factorial: ");
		input = a.nextInt();
		
		for (int i = 1; i <= input; i++) {
			
			fact = i*fact;
			
		}
		
		
		System.out.println("Factorial Value is: "+ fact);
		

	}

}
