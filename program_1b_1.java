package Lab1;
import java.util.ArrayList;
import java.util.Scanner;

public class program_1b_1 {

	
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");
	        colors.add("White");
	        colors.add("Red");  // Add "Red" optionally for testing

	        // Display all colors
	        System.out.println("Available colors: " + colors);

	        // Get user input for color to search (optional)
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a color to search: ");
	        String searchColor = scanner.nextLine();

	        // Check if "Red" or the input color exists in the list
	        if (colors.contains(searchColor)) {
	            System.out.println("Color \"" + searchColor + "\" is available in the list.");
	        } else {
	            System.out.println("Color \"" + searchColor + "\" is NOT available in the list.");
	        }

	        scanner.close();
	    }
	}

