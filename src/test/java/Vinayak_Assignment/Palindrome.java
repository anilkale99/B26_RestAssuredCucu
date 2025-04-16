package Vinayak_Assignment;

public class Palindrome {

	public static void main(String[] args) {
		//String str = " Cucumber";
		String str =" madam ";
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println(str.equals(reversed));
		

	}

}
