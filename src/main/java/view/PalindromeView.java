// definition of the package in which class definition is placed
package view;


import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

/**
 * The PalindromeView class provides the graphical user interface
 * for the Palindrome Analyzer application. 
 * 
 * It allows the user to input text,
 * initiate palindrome analysis, and view detailed results of detected differences.
 * This class is responsible only for the presentation layer (the View) 
 * in the MVC architecture.
 * 
 * @version 1.2
 * @author Jakub Tomaszewski
 */
public class PalindromeView {
    private JFrame frame;
    private JTextField inputField;
    private JButton checkButton;
    private JLabel inputLabel;
    
    private JLabel statusLabel;
    private JTable resultTable;
    private DefaultTableModel tableModel;
    private JScrollPane tableScrollPane;
    
    private final String[] columnNames = {"Pos 1", "Char 1", "Pos 2", "Char 2"};
    
    public PalindromeView() {
        frame = new JFrame("Palindrome Analyzer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        
        
        //top
        JPanel topPanel = new JPanel();
        
        inputLabel = new JLabel("Input the string to analyze:");
        inputField = new JTextField(20);
        
        topPanel.add(inputLabel);
        topPanel.add(inputField);

        //center
        JPanel centerPanel = new JPanel();
        checkButton = new JButton("Check");
        centerPanel.add(checkButton);
        
        //bottom
        JPanel bottomPanel = new JPanel(new BorderLayout());
        
        statusLabel = new JLabel(" ", SwingConstants.CENTER);
        statusLabel.setFont(new Font("Arial", Font.BOLD, 14));
        bottomPanel.add(statusLabel, BorderLayout.NORTH);
        
        tableModel = new DefaultTableModel(columnNames, 0);
        resultTable = new JTable(tableModel);
        resultTable.setEnabled(false);
        
        tableScrollPane = new JScrollPane(resultTable);
        tableScrollPane.setPreferredSize(new Dimension(450, 150));
        tableScrollPane.setVisible(false);
        
        bottomPanel.add(tableScrollPane, BorderLayout.CENTER);

        frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        
        // tooltips
        inputField.setToolTipText("Input the string to analyze");
        checkButton.setToolTipText("Click, to begin the analyze");
        statusLabel.setToolTipText("Analyze output");
        resultTable.setToolTipText("Detailed analyze output");

        // mnemonics
        inputLabel.setDisplayedMnemonic('W');
        inputLabel.setLabelFor(inputField);

        checkButton.setMnemonic('S');
        
        // screen reader descriptions
        inputField.getAccessibleContext().setAccessibleDescription(
            "Text field for entering the phrase to analyze as a palindrome");
        checkButton.getAccessibleContext().setAccessibleDescription(
            "Button that starts the analysis of the entered phrase");
        resultTable.getAccessibleContext().setAccessibleDescription(
            "Table displaying detailed differences found in the analyzed text");
    }

    /**
     * Displays the application window.
     */
    public void show() {
        frame.setVisible(true);
    }
    

    /**
     * Returns the text entered by the user.
     * 
     * @return the input string
     */
    public String getInputValue() {
        return inputField.getText();
    }
    
    /**
     * Sets the text in the input field.
     * 
     * @param text the text to set
     */
    public void setInputText(String text) {
        inputField.setText(text);
    }
    
    /**
     * Returns the "Check" button component.
     * 
     * @return the check button
     */
    public JButton getCheckButton() {
        return checkButton;
    }
    
    
    /**
     * Returns the main application frame.
     * 
     * @return the frame
     */
    public JFrame getFrame() {
        return frame;
    }
    
    /**
     * Sets the text displayed in the status label.
     * 
     * @param text the status message
     */
    public void setStatusText(String text) {
        statusLabel.setText(text);
    }

    /**
     * Shows or hides the result table containing palindrome analysis details.
     * 
     * @param show {@code true} to show the table; {@code false} to hide it
     */
    public void showTable(boolean show) {
        tableScrollPane.setVisible(show);
        tableScrollPane.revalidate();
        tableScrollPane.repaint();
    }
    
    /**
     * Returns the table model used to display analysis results.
     * This allows the controller to add rows with detected differences.
     * 
     * @return the table model
     */
    public DefaultTableModel getTableModel() {
        return tableModel;
    }
}

