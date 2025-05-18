package lab5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;


	public class program_5a extends JFrame {

	    private JList<String> countryList;

	    public program_5a() {
	        setTitle("Country List Demo");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);  // Center the frame

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Create JList with countries
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add a listener for selection changes
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                // Avoid processing while adjusting
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries: " + selectedCountries);
	                }
	            }
	        });

	        // Put the list in a scroll pane
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add to frame
	        getContentPane().add(scrollPane, BorderLayout.CENTER);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	        	program_5a frame = new program_5a();
	            frame.setVisible(true);
	        });
	    }
	}
