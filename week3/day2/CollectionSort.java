package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSort {

	public static void main(String[] args) {
		
		List<String> listValue = new ArrayList<String>();

		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		
		for (String temp : input) {
			
			listValue.add(temp);
			
		}
		
//		get the length of the array		
		
		System.out.println("Length of Array: "+input.length);

//		sort the array		
		
		Collections.sort(listValue);
		System.out.println("Array in sorted order: "+listValue);
		System.out.println("Array in reverese order:");

//		Iterate it in the reverse order
		
		for (int i = input.length-1; i >=0; i--) {

//			print the array
			
			System.out.print(listValue.get(i)+", ");
			
		}


		
//		Required Output: Wipro, HCL , CTS, Aspire Systems

	}

}
