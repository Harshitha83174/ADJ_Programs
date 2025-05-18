package Lab1;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class program_1c_1 {

	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display full list
	        System.out.println("Full color list: " + colors);

	        // Start iteration from 2nd element (index 1)
	        System.out.println("Iterating from 2nd element:");
	        Iterator<String> iterator = colors.listIterator(1);  // index 1 = 2nd element

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


