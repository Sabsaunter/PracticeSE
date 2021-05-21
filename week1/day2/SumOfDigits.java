package week1.day2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;

		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.println("Enter input: ");
		input = a.nextInt();

		int sum = 0;

		while (input > 0) {

			int rem = input % 10;

			sum = sum + rem;
			input = input / 10;

		}
		System.out.println("Sum of Digits is: " + sum);
	}

}
