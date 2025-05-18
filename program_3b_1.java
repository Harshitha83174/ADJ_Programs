package Lab3;
import java.util.Scanner;

public class program_3b_1 {
	    public static boolean isNullOrEmpty(String str) {
	        return (str == null || str.trim().isEmpty());
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Take input from the user
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function
	        if (isNullOrEmpty(input)) {
	            System.out.println("The string is either null, empty, or contains only whitespace.");
	        } else {
	            System.out.println("The string is valid: '" + input + "'");
	        }

	        scanner.close();
	    }
	}
