package Lab1;
import java.util.ArrayList;
import java.util.List;
public class program_1b_4 {
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

	        // Extract 1st and 2nd elements (index 0 and 1)
	        if (colors.size() >= 2) {
	            List<String> subColors = colors.subList(0, 2); // end index is exclusive
	            System.out.println("Extracted sublist (1st and 2nd elements): " + subColors);
	        } else {
	            System.out.println("Not enough elements in the list to extract 1st and 2nd elements.");
	        }
	    }
	}


