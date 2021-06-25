package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {

		String string1 = "Madam";
		String rev="";
		
		for (int i = string1.length()-1; i >=0; i--) {
			
			rev=rev+string1.charAt(i);
		}
			if (string1.equalsIgnoreCase(rev))
			      System.out.println("The string is a palindrome.");
			    else
			      System.out.println("The string isn't a palindrome.");			
			
		
	}

}
