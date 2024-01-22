package partA.a1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Q1 class creates a GUI for converting raw data to a data package and vice versa.
 * This class provides a graphical user interface for converting strings of data
 * into a packaged hexadecimal format and vice versa.
 * The interface allows the user to input raw data, convert it to a data package,
 * and display the result
 */
public class Q1 {

    /**
     * The main method sets up the GUI and its components.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Package Convert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(5, 5, 5, 5);

        JTextArea rawDataField = new JTextArea(5,20);
        JTextArea dataPackageField = new JTextArea(5,20);

        JButton dataToPackageButton = new JButton("Data to package");
        JButton packageToDataButton = new JButton("Package to data");

        /**
         * Adds an ActionListener to the 'Data to package' button.
         * Converts the raw data in the text area to a data package when the button is pressed.
         */
        dataToPackageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rawData = rawDataField.getText();
                String dataPackage = DataPacket.convertToDataPacket(rawData);
                dataPackageField.setText(dataPackage);
            }
        });

        /**
         * Adds an ActionListener to the 'Package to data' button.
         * Converts the data package in the text area back to raw data when the button is pressed.
         */
        packageToDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dataPackage = dataPackageField.getText();
                String rawData = DataPacket.getDataFromDataPacket(dataPackage);
                rawDataField.setText(rawData);
            }
        });

        // Set GridBagConstraints parameters and add components
        constraints.gridx = 0; // First column
        constraints.gridy = 0; // First row
        frame.add(new JLabel("Raw data:"), constraints);

        constraints.gridx = 1; // Second column
        constraints.gridy = 0; // First row
        frame.add(rawDataField, constraints);

        constraints.gridx = 0; // First column
        constraints.gridy = 1; // Second row
        constraints.weightx = 0.5; // Set expansion ratio
        frame.add(new JLabel("Data package:"), constraints);

        constraints.gridx = 1; // Second column
        constraints.gridy = 1; // Second row
        frame.add(dataPackageField, constraints);

        constraints.gridx = 0; // First column
        constraints.gridy = 2; // Third row
        constraints.weightx = 0; // Reset expansion ratio
        frame.add(dataToPackageButton, constraints);

        constraints.gridx = 1; // Second column
        constraints.gridy = 2; // Third row
        frame.add(packageToDataButton, constraints);

        frame.setVisible(true);
    }
}
