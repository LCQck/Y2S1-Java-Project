package partA.a2;

import javax.swing.*;
import java.awt.*;

/**
 * The Q2 class creates a GUI for handling multiple data package conversions.
 * It provides text fields to input multiple strings of raw data and buttons to convert
 * these strings into a single hexadecimal string representing a multi-data package.
 * This class demonstrates the use of Java Swing components arranged with BoxLayout.
 */
public class Q2 {

    /**
     * Sets up the GUI framework, initializes components, and displays them.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiple Data Package Convert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Labels for personal information, set to red font color
        JLabel nameLabel = new JLabel("Name: Changqing Lin");
        nameLabel.setForeground(Color.RED);
        JLabel studentIdLabel = new JLabel("StuID: 2039153");
        studentIdLabel.setForeground(Color.RED);
        JLabel genderLabel = new JLabel("Gender: Male");
        genderLabel.setForeground(Color.RED);

        // Load the image icon
        ImageIcon photoIcon = new ImageIcon("photo.jpg");
        JLabel photoLabel = new JLabel(photoIcon);

        // Panel for personal information with vertical layout
        JPanel infoPanel = new JPanel();
        infoPanel.setLayout(new BoxLayout(infoPanel, BoxLayout.Y_AXIS));
        infoPanel.add(nameLabel);
        infoPanel.add(studentIdLabel);
        infoPanel.add(genderLabel);

        // Main panel for horizontally placing the info panel and photo label
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.add(infoPanel);
        mainPanel.add(photoLabel);

        // Text fields for raw data input
        JTextField rawData1 = new JTextField(20);
        JTextField rawData2 = new JTextField(20);
        JTextField rawData3 = new JTextField(20);
        JTextField multiDataPackage = new JTextField(20);

        // Buttons for converting data
        JButton dataToMultiPackageButton = new JButton("Data to multi package");
        JButton multiPackageToDataButton = new JButton("Multi package to data");

        // Action listeners for buttons to convert data and handle exceptions
        dataToMultiPackageButton.addActionListener(e -> {
            // Implementation code for converting data to multi package
        });

        multiPackageToDataButton.addActionListener(e -> {
            // Implementation code for converting multi package to data
        });

        // Assemble and add components to the frame
        frame.add(infoPanel);
        frame.add(createLabeledField("Raw data 1:", rawData1));
        frame.add(createLabeledField("Raw data 2:", rawData2));
        frame.add(createLabeledField("Raw data 3:", rawData3));
        frame.add(createLabeledField("Multi data package:", multiDataPackage));

        // Panel for buttons
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(dataToMultiPackageButton);
        buttonPanel.add(multiPackageToDataButton);
        frame.add(buttonPanel);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    /**
     * Creates a JPanel containing a JLabel and a JTextField.
     * @param label The text for the JLabel.
     * @param textField The JTextField for data input.
     * @return The JPanel containing the label and text field.
     */
    private static JPanel createLabeledField(String label, JTextField textField) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.add(new JLabel(label));
        panel.add(textField);
        return panel;
    }
}
