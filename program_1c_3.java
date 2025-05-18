package Lab1;
import java.util.LinkedList;
public class program_1c_3 {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add initial colors
	        colorList.add("Red");
	        colorList.add("Green");
	        colorList.add("Blue");
	        colorList.add("Yellow");

	        // Display original list
	        System.out.println("Original color list: " + colorList);

	        // Insert "Pink" at the end of the list using offerLast()
	        colorList.offerLast("Pink");

	        // Display updated list
	        System.out.println("Updated color list after adding 'Pink' at the end: " + colorList);
	    }
	}

