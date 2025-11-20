// definition of the package in which class definition is placed
package view;


import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Jakub Tomaszewski
 */
public class PalindromeView {
    private JFrame frame;
    private JTextField inputField;
    private JButton checkButton;
    private JTextArea resultArea;
    private JLabel inputLabel;
    
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
        resultArea = new JTextArea(15, 30);
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        frame.getContentPane().add(BorderLayout.NORTH, topPanel);
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);
        frame.getContentPane().add(BorderLayout.SOUTH, scrollPane);
        
        // tooltips
        inputField.setToolTipText("Input the string to analyze");
        checkButton.setToolTipText("Click, to begin the analyze");
        resultArea.setToolTipText("Analyze output");

        // mnemonics
        inputLabel.setDisplayedMnemonic('W');
        inputLabel.setLabelFor(inputField);

        checkButton.setMnemonic('S');
    }


    public void show() {
        frame.setVisible(true);
    }
    

    public String getInputValue() {
        return inputField.getText();
    }

   
    public void setResultText(String text) {
        resultArea.setText(text);
    }


    public JButton getCheckButton() {
        return checkButton;
    }
    
 
    public JFrame getFrame() {
        return frame;
    }
}

