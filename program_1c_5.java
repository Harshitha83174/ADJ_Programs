package Lab1;
import java.util.LinkedList;
import java.util.Collections;

public class program_1c_5 {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colorList = new LinkedList<>();

	        // Add colors to the list
	        colorList.add("Red");     // index 0
	        colorList.add("Green");   // index 1
	        colorList.add("Blue");    // index 2
	        colorList.add("Yellow");  // index 3
	        colorList.add("Black");   // index 4

	        // Display original list
	        System.out.println("Original color list: " + colorList);

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colorList, 0, 2);

	        // Display updated list
	        System.out.println("Updated color list after swapping 1st and 3rd elements: " + colorList);
	    }
	}

