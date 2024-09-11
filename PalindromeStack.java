import java.util.Stack;
import java.util.Scanner;


	public class PalindromeStack {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string:");
	        String input = scanner.nextLine();
	        scanner.close();

	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }//end main

	    public static boolean isPalindrome(String input) {
	        Stack<Character> stack = new Stack<>();
	        int length = input.length();

	    
	        for (int i = 0; i < length / 2; i++) {
	            stack.push(input.charAt(i));
	        }


	        int start = (length % 2 == 0) ? length / 2 : length / 2 + 1;

	      
	        for (int i = start; i < length; i++) {
	            if (stack.isEmpty() || input.charAt(i) != stack.pop()) {
	                return false;
	            }
	        }

	        return true;
	    }//end isPalindrome
	    
	
}//end class
