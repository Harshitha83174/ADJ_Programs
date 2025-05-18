package Lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

	public class program_4c extends JFrame implements ActionListener {

	    private JButton btnDigitalClock;
	    private JButton btnHourGlass;
	    private JLabel messageLabel;

	    public program_4c() {
	        setTitle("Image Button Demo");
	        setSize(400, 200);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);  // Center the frame

	        // Load images (make sure these image files are in your project directory or provide full path)
	        ImageIcon digitalIcon = new ImageIcon("digital_clock.png");  // replace with your image file
	        ImageIcon hourglassIcon = new ImageIcon("hour_glass.png");   // replace with your image file

	        // Create buttons with images
	        btnDigitalClock = new JButton("Digital Clock", digitalIcon);
	        btnHourGlass = new JButton("Hour Glass", hourglassIcon);

	        // Place text below image
	        btnDigitalClock.setHorizontalTextPosition(SwingConstants.CENTER);
	        btnDigitalClock.setVerticalTextPosition(SwingConstants.BOTTOM);

	        btnHourGlass.setHorizontalTextPosition(SwingConstants.CENTER);
	        btnHourGlass.setVerticalTextPosition(SwingConstants.BOTTOM);

	        // Label to display messages
	        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);
	        messageLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));

	        // Add action listeners
	        btnDigitalClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Layout setup
	        JPanel buttonPanel = new JPanel();
	        buttonPanel.add(btnDigitalClock);
	        buttonPanel.add(btnHourGlass);

	        getContentPane().setLayout(new BorderLayout());
	        getContentPane().add(buttonPanel, BorderLayout.CENTER);
	        getContentPane().add(messageLabel, BorderLayout.SOUTH);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnDigitalClock) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	        	program_4c frame = new program_4c();
	            frame.setVisible(true);
	        });
	    }}
	

