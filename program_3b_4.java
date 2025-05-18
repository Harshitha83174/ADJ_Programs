package Lab3;
import java.util.Scanner;
public class program_3b_4 {
  public static boolean isPalindrome(String input) {
	        if (input == null) return false;

	        // Remove punctuation and spaces, convert to lowercase
	        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Reverse the cleaned string
	        String reversed = new StringBuilder(cleaned).reverse().toString();

	        // Compare cleaned and reversed
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input from user
	        System.out.print("Enter a string to check if it is a palindrome: ");
	        String input = scanner.nextLine();

	        // Check and output result
	        if (isPalindrome(input)) {
	            System.out.println("✅ The string is a palindrome.");
	        } else {
	            System.out.println("❌ The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}

