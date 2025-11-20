package controller;

// imports
import model.EmptyInputException;
import model.PalindromeModel;
import view.PalindromeView;

//gui
import javax.swing.*;
import java.awt.event.*;

import java.util.ArrayList;


public class PalindromeController {


    private PalindromeModel model;
    private PalindromeView view;

   
    public PalindromeController(PalindromeModel model, PalindromeView view) {
        this.model = model;
        this.view = view;


        this.view.getCheckButton().addActionListener(new CheckButtonListener());
    }

   
    class CheckButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           
            String rawInput = view.getInputValue();

            String input = rawInput.replaceAll("\\s+", "").toLowerCase();

            try {
            
                model.analyze(input);

              
                boolean isPalindrome = model.getIsPalindrome();
                ArrayList<String> differences = model.getDifferences();

              
                String resultText = formatResults(input, isPalindrome, differences);
                view.setResultText(resultText);

            } catch (EmptyInputException ex) {
     
                JOptionPane.showMessageDialog(
                        view.getFrame(), 
                        "error: " + ex.getMessage(),
                        "input error", 
                        JOptionPane.ERROR_MESSAGE
                );
           
                view.setResultText("");
            }
        }
    }


    private String formatResults(String input, boolean isPalindrome, ArrayList<String> differences) {

        StringBuilder sb = new StringBuilder();

        sb.append(input).append(" (length: ").append(input.length()).append(")\n\n");

        if (isPalindrome) {
            sb.append("Given string IS a palindrome.");
        } else {
            sb.append("Given string IS NOT a palindrome.\n");
            sb.append("\nDiffers:\n");

            for (String diff : differences) {
                sb.append("- ").append(diff).append("\n");
            }
        }
        return sb.toString();
    }
    
    
}