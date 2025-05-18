package Lab1;
import java.util.LinkedList;
import java.util.Iterator;

public class program_1c_2 {
	    public static void main(String[] args) {
	        // Create a LinkedList of colors
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original color list: " + colors);

	        // Reverse iteration using descendingIterator()
	        System.out.println("Iterating in reverse order:");
	        Iterator<String> reverseIterator = colors.descendingIterator();

	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}


