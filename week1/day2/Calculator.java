package week1.day2;

import java.util.Scanner;

public class Calculator {
	
	public int add(int num1, int num2, int num3) {
		
		int sum = num1+num2+num3;
		return sum;
		
	}
	
public int Sub(int num1, int num2, int num3) {
		
		int Diff = num1-num2-num3;
		return Diff;
	}

public double mul(double num1, double num2) {
	
	double multiply = num1*num2;
	return multiply;
}

public float div(float num1, float num2) {
	
	float divison = num1/num2;
	return divison;
}

}
