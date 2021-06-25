package week1.day2.assignments;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		
		for (int i = 0; i < test.length(); i++) {
			
			//find the odd index within the loop (use mod operator)
			
			if(i%2==1)
				
				System.out.print(Character.toUpperCase(test.charAt(i)));
			else
				System.out.print(test.charAt(i));
			 
			 //within the loop, change the character to uppercase, if the index is odd else don't change
			
		}

	}

}
