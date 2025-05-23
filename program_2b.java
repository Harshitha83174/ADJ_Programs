package Lab2;

public class program_2b {
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String appendStr = "AIET";

	        // Test StringBuffer
	        StringBuffer stringBuffer = new StringBuffer();
	        long startBuffer = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(appendStr);
	        }
	        long endBuffer = System.nanoTime();
	        long timeBuffer = endBuffer - startBuffer;
	        System.out.println("Time taken by StringBuffer: " + timeBuffer + " nanoseconds");

	        // Test StringBuilder
	        StringBuilder stringBuilder = new StringBuilder();
	        long startBuilder = System.nanoTime();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(appendStr);
	        }
	        long endBuilder = System.nanoTime();
	        long timeBuilder = endBuilder - startBuilder;
	        System.out.println("Time taken by StringBuilder: " + timeBuilder + " nanoseconds");

	        // Justification
	        if (timeBuilder < timeBuffer) {
	            System.out.println("\n✅ StringBuilder is faster than StringBuffer for single-threaded environments.");
	        } else {
	            System.out.println("\n✅ StringBuffer is better only when thread-safety is required.");
	        }
	    }
	}

