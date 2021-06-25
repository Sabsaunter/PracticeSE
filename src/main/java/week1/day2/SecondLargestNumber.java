package week1.day2;

//import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] values = { 3, 2, 5, 54, 6, 7 };

//Arrays.sort(values);

//System.out.println("Second Largest Number is: "+values[values.length-2]);

		for (int i = 0; i < values.length; i++) {

			int count = 1;

			for (int j = i+1; j < values.length; j++) {

				if (values[j] == values[i]) {

					count = count + 1;

				}
			}

			if (count > 1) {
				System.out.println("Duplicate Value is: " + values[i]);

			} 
			/*else if (count == 1) {
				System.out.println("No Duplicate found");
			}*/

		}

	}

}
