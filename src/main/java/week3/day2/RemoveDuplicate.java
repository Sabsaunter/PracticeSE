package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {

//		Declare a String as PayPal India
		String input = "PayPal India";

//		Convert it into a character array
		
		char[] ch = input.toCharArray();

//		Declare a Set as charSet for Character
		
		Set<Character> setValue = new LinkedHashSet<Character>();


		for (Character temp : ch) {
			
			if(temp!=' ') {
				
				setValue.add(temp);
				
			}
				
			
		}

//		print each character for charSet
		
		System.out.println(setValue);
	}

}
