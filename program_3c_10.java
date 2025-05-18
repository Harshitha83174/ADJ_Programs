package Lab3;
import java.util.Scanner;
public class program_3c_10 {
   public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }

	        // Split the string by one or more whitespace characters
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string from user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Count words using the function
	        int wordCount = countWords(input);

	        // Output the result
	        System.out.println("Number of words: " + wordCount);

	        scanner.close();
	    }
	}

