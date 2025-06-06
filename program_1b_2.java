package Lab1;
import java.util.ArrayList;

public class program_1b_2 {
	
	public class ColorRemoval {
	    public static void main(String[] args) {
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original color list: " + colors);

	        // 1. Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedColor = colors.remove(1);  // index 1 = 2nd element
	            System.out.println("Removed 2nd element: " + removedColor);
	        } else {
	            System.out.println("List has less than 2 elements. Cannot remove 2nd element.");
	        }

	        // 2. Remove the color "Blue"
	        boolean blueRemoved = colors.remove("Blue");
	        if (blueRemoved) {
	            System.out.println("Removed color: Blue");
	        } else {
	            System.out.println("Color 'Blue' was not found in the list.");
	        }

	        // Display final list
	        System.out.println("Updated color list: " + colors);
	    }
	}}


