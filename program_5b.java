package lab5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

	public class program_5b extends JFrame {

	    private JTabbedPane tabbedPane;
	    private JPanel redPanel, bluePanel, greenPanel;
	    private JLabel redLabel, blueLabel, greenLabel;

	    public program_5b() {
	        setTitle("Color Tabbed Pane Demo");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the window

	        tabbedPane = new JTabbedPane();

	        // Create panels with labels
	        redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);
	        redLabel = new JLabel("RED", SwingConstants.CENTER);
	        redLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
	        redLabel.setForeground(Color.WHITE);
	        redPanel.setLayout(new BorderLayout());
	        redPanel.add(redLabel, BorderLayout.CENTER);

	        bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);
	        blueLabel = new JLabel("BLUE", SwingConstants.CENTER);
	        blueLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
	        blueLabel.setForeground(Color.WHITE);
	        bluePanel.setLayout(new BorderLayout());
	        bluePanel.add(blueLabel, BorderLayout.CENTER);

	        greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);
	        greenLabel = new JLabel("GREEN", SwingConstants.CENTER);
	        greenLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
	        greenLabel.setForeground(Color.BLACK);
	        greenPanel.setLayout(new BorderLayout());
	        greenPanel.add(greenLabel, BorderLayout.CENTER);

	        // Add tabs
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add tabbedPane to frame
	        add(tabbedPane);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	        	program_5b frame = new program_5b();
	            frame.setVisible(true);
	        });
	    }
	}

