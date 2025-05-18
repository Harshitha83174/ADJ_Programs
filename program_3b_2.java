package Lab3;
import java.util.Scanner;
public class program_3b_2 {
	 public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // move past the found substring
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input main string
	        System.out.print("Enter the main string: ");
	        String mainStr = scanner.nextLine();

	        // Input substring
	        System.out.print("Enter the substring to count: ");
	        String subStr = scanner.nextLine();

	        // Count occurrences
	        int occurrences = countOccurrences(mainStr, subStr);
	        System.out.println("The substring \"" + subStr + "\" appears " + occurrences + " time(s) in the main string.");

	        scanner.close();
	    }
	}

