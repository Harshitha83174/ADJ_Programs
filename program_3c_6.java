package Lab3;
import java.util.Scanner;
public class program_3c_6 {
	    public static String capitalizeWords(String str) {
	        if (str == null || str.isEmpty()) {
	            return str;
	        }

	        // Split the string into words using whitespace
	        String[] words = str.trim().split("\\s+");
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                // Capitalize first letter and add the rest of the word
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                           .append(word.substring(1).toLowerCase())
	                           .append(" ");
	            }
	        }

	        // Trim the final result to remove trailing space
	        return capitalized.toString().trim();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Capitalize each word
	        String result = capitalizeWords(input);

	        // Output
	        System.out.println("Capitalized: " + result);

	        scanner.close();
	    }
	}

